package com.example.demo;

import com.example.demo.Entities.Tool;
import com.example.demo.Repositories.ToolRepository;
import com.example.demo.Services.ToolService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ToolServiceTest {
    @Mock
    private ToolRepository toolRepository;

    @InjectMocks
    private ToolService toolService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testInsertNewTool() {
        // Arrange
        Tool tool = new Tool();

        // Act
        toolService.InsertNewTool(tool);

        // Assert
        verify(toolRepository, times(1)).save(tool);
    }

    @Test
    public void testSearchAll() {
        // Arrange
        ArrayList<Tool> expectedTools = new ArrayList<>();
        when(toolRepository.findAll()).thenReturn(expectedTools);

        // Act
        ArrayList<Tool> actualTools = toolService.SearchAll();

        // Assert
        assertEquals(expectedTools, actualTools);
        verify(toolRepository, times(1)).findAll();
    }

    @Test
    public void testToolsPages() {
        // Arrange
        Page<Tool> expectedPage = mock(Page.class);
        Pageable pageable = mock(Pageable.class);
        when(toolRepository.findAll(pageable)).thenReturn(expectedPage);

        // Act
        Page<Tool> actualPage = toolService.toolsPages(pageable);

        // Assert
        assertEquals(expectedPage, actualPage);
        verify(toolRepository, times(1)).findAll(pageable);
    }

    @Test
    public void testUpdateTool() {
        // Arrange
        Tool tool = new Tool();

        // Act
        toolService.updateTool(tool);

        // Assert
        verify(toolRepository, times(1)).save(tool);
    }

    @Test
    public void testDeleteTool() {
        // Arrange
        Integer id = 1;

        // Act
        toolService.deleteTool(id);

        // Assert
        verify(toolRepository, times(1)).deleteById(id);
    }
    @Test
    public void testFindOne_Exists() {
        // Arrange
        Integer id = 1;
        Tool expectedTool = new Tool();
        when(toolRepository.existsById(id)).thenReturn(true);
        when(toolRepository.getReferenceById(id)).thenReturn(expectedTool);

        // Act
        Tool actualTool = toolService.findOne(id);

        // Assert
        assertEquals(expectedTool, actualTool);
        verify(toolRepository, times(1)).existsById(id);
        verify(toolRepository, times(1)).getReferenceById(id);
    }
    @Test
    public void testFindOne_NotExists() {
        // Arrange
        Integer id = 1;
        when(toolRepository.existsById(id)).thenReturn(false);

        // Act
        Tool actualTool = toolService.findOne(id);

        // Assert
        assertEquals(null, actualTool);
        verify(toolRepository, times(1)).existsById(id);
        verify(toolRepository, times(0)).getReferenceById(id);
    }
}
