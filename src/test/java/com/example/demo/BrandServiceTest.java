package com.example.demo;

import com.example.demo.Entities.Brand;
import com.example.demo.Repositories.BrandRepository;
import com.example.demo.Services.BrandService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BrandServiceTest {

    @Mock
    private BrandRepository brandRepository;

    @InjectMocks
    private BrandService brandService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testInsertNewBrand() {
        // Arrange
        Brand brand = new Brand();

        // Act
        brandService.InsertNewBrand(brand);

        // Assert
        verify(brandRepository, times(1)).save(brand);
    }

    @Test
    public void testUpdateBrand() {
        // Arrange
        Brand brand = new Brand();

        // Act
        brandService.UpdateBrand(brand);

        // Assert
        verify(brandRepository, times(1)).save(brand);
    }

    @Test
    public void testSearchAll() {
        // Arrange
        ArrayList<Brand> expectedBrands = new ArrayList<>();
        when(brandRepository.findAll()).thenReturn(expectedBrands);

        // Act
        ArrayList<Brand> actualBrands = brandService.SearchAll();

        // Assert
        assertEquals(expectedBrands, actualBrands);
        verify(brandRepository, times(1)).findAll();
    }

    @Test
    public void testDeleteBrand() {
        // Arrange
        Integer id = 1;

        // Act
        brandService.deleteBrand(id);

        // Assert
        verify(brandRepository, times(1)).deleteById(id);
    }

    @Test
    public void testFindOne_Exists() {
        // Arrange
        Integer id = 1;
        Brand expectedBrand = new Brand();
        when(brandRepository.existsById(id)).thenReturn(true);
        when(brandRepository.getReferenceById(id)).thenReturn(expectedBrand);

        // Act
        Brand actualBrand = brandService.findOne(id);

        // Assert
        assertEquals(expectedBrand, actualBrand);
        verify(brandRepository, times(1)).existsById(id);
        verify(brandRepository, times(1)).getReferenceById(id);
    }

    @Test
    public void testFindOne_NotExists() {
        // Arrange
        Integer id = 1;
        when(brandRepository.existsById(id)).thenReturn(false);

        // Act
        Brand actualBrand = brandService.findOne(id);

        // Assert
        assertEquals(null, actualBrand);
        verify(brandRepository, times(1)).existsById(id);
        verify(brandRepository, times(0)).getReferenceById(id);
    }
}
