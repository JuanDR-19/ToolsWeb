package com.example.demo;

import com.example.demo.Controllers.BrandController;
import com.example.demo.Entities.Brand;
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
import static org.mockito.Mockito.times;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BrandControllerTest {
    @Mock
    private BrandService brandService;

    @InjectMocks
    private BrandController brandController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testGetAll() {
        // Arrange
        ArrayList<Brand> expectedBrands = new ArrayList<>();
        expectedBrands.add(new Brand());
        when(brandService.SearchAll()).thenReturn(expectedBrands);

        // Act
        ArrayList<Brand> actualBrand = brandController.getAll();

        // Assert
        assertEquals(expectedBrands, actualBrand);
        verify(brandService, times(1)).SearchAll();
    }

    @Test
    public void NewBrandTest() {
        // Arrange
        Brand brand = new Brand();

        // Act
        brandController.NewBrand(brand);

        // Assert
        verify(brandService, times(1)).InsertNewBrand(brand);
    }

    @Test
    public void updateBrandTest() {
        // Arrange
        Brand brand = new Brand();
        Integer id = 1;
        Brand existingBrand = new Brand();
        when(brandService.findOne(id)).thenReturn(existingBrand);

        // Act
        String response = brandController.UpdateBrand(brand, id);

        // Assert
        assertEquals("exito", response);
        verify(brandService, times(1)).findOne(id);
        verify(brandService, times(1)).UpdateBrand(existingBrand);
    }

    @Test
    public void deleteBrandTest() {
        // Arrange
        Integer id = 1;

        // Act
        brandController.deleteBrand(id);

        // Assert
        verify(brandService, times(1)).deleteBrand(id);
    }
}
