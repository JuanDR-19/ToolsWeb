package com.example.demo;

import com.example.demo.Entities.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BrandTest {
    @Test
    public void testBrandId() {
        // Arrange
        Integer expectedId = 1;
        Brand brand = new Brand();
        brand.setBrand_id(expectedId);

        // Act
        Integer actualId = brand.getBrand_id();

        // Assert
        assertEquals(expectedId, actualId);
    }

    @Test
    public void testBrandName() {
        // Arrange
        String expectedName = "Nike";
        Brand brand = new Brand();
        brand.setName(expectedName);

        // Act
        String actualName = brand.getName();

        // Assert
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testBrandWebsite() {
        // Arrange
        String expectedWebsite = "https://www.nike.com";
        Brand brand = new Brand();
        brand.setWebsite(expectedWebsite);

        // Act
        String actualWebsite = brand.getWebsite();

        // Assert
        assertEquals(expectedWebsite, actualWebsite);
    }
}
