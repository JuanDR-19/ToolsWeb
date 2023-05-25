package com.example.demo;

import com.example.demo.Controllers.ToolController;
import com.example.demo.Entities.Tool;
import com.example.demo.Services.ToolService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ToolControllerTest {

    @Mock
    private ToolService toolService;

    @InjectMocks
    private ToolController toolController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAll() {
        // Arrange
        ArrayList<Tool> expectedTools = new ArrayList<>();
        expectedTools.add(new Tool());
        when(toolService.SearchAll()).thenReturn(expectedTools);

        // Act
        ArrayList<Tool> actualTools = toolService.SearchAll();

        // Assert
        assertEquals(expectedTools, actualTools);
        //verify(toolService, times(1)).SearchAll();
    }


    @Test
    public void testNewTool() {
        // Arrange
        Tool tool = new Tool();

        // Act
        toolController.NewTool(tool);

        // Assert
        verify(toolService, times(1)).InsertNewTool(tool);
    }


    @Test
    public void testUpdateTool() {
        // Arrange
        Tool tool = new Tool();
        Integer id = 1;
        Tool existingTool = new Tool();
        when(toolService.findOne(id)).thenReturn(existingTool);

        // Act
        String response = toolController.updateTool(tool, id);

        // Assert
        assertEquals("Fue un exito", response);
        verify(toolService, times(1)).findOne(id);
        verify(toolService, times(1)).updateTool(existingTool);
    }


    @Test
    public void testUpdateTool_InsertNewTool() {
        // Arrange
        Tool tool = new Tool();
        Integer id = 1;
        when(toolService.findOne(id)).thenReturn(null);

        // Act
        String response = toolController.updateTool(tool, id);

        // Assert
        assertEquals("Herramienta agregada", response);
        verify(toolService, times(1)).findOne(id);
        verify(toolService, times(1)).InsertNewTool(tool);
    }


}