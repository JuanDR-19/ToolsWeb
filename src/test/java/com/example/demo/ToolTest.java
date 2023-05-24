package com.example.demo;

import com.example.demo.Entities.Brand;
import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ToolTest {

    @Test
    public void testToolId() {
        // Arrange
        Integer expectedId = 1;
        Tool tool = new Tool();
        tool.setId(expectedId);

        // Act
        Integer actualId = tool.getId();

        // Assert
        assertEquals(expectedId, actualId);
    }

    @Test
    public void testToolName() {
        // Arrange
        String expectedName = "Hammer";
        Tool tool = new Tool();
        tool.setName(expectedName);

        // Act
        String actualName = tool.getName();

        // Assert
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testToolImage() {
        // Arrange
        String expectedImg = "https://example.com/hammer.jpg";
        Tool tool = new Tool();
        tool.setImg(expectedImg);

        // Act
        String actualImg = tool.getImg();

        // Assert
        assertEquals(expectedImg, actualImg);
    }

    @Test
    public void testToolDescription() {
        // Arrange
        String expectedDescription = "A useful tool for various tasks.";
        Tool tool = new Tool();
        tool.setDescription(expectedDescription);

        // Act
        String actualDescription = tool.getDescription();

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testToolBrand() {
        // Arrange
        Brand expectedBrand = new Brand();
        Tool tool = new Tool();
        tool.setBrand_id(expectedBrand);

        // Act
        Brand actualBrand = tool.getBrand_id();

        // Assert
        assertEquals(expectedBrand, actualBrand);
    }

    @Test
    public void testToolPrice() {
        // Arrange
        double expectedPrice = 9.99;
        Tool tool = new Tool();
        tool.setPrice(expectedPrice);

        // Act
        double actualPrice = tool.getPrice();

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testToolCities() {
        // Arrange
        ArrayList<City> expectedCities = new ArrayList<>();
        City city1 = new City();
        City city2 = new City();
        expectedCities.add(city1);
        expectedCities.add(city2);
        Tool tool = new Tool();
        tool.setCities(expectedCities);

        // Act
        ArrayList<City> actualCities = (ArrayList<City>) tool.getCities();

        // Assert
        assertEquals(expectedCities, actualCities);
    }

    @Test
    public void testToolQuantity() {
        // Arrange
        Integer expectedQuantity = 10;
        Tool tool = new Tool();
        tool.setQuantity(expectedQuantity);

        // Act
        Integer actualQuantity = tool.getQuantity();

        // Assert
        assertEquals(expectedQuantity, actualQuantity);
    }
}
