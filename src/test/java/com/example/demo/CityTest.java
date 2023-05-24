package com.example.demo;

import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CityTest {

    @Test
    public void testCityId() {
        // Arrange
        Integer expectedId = 1;
        City city = new City();
        city.setCity_id(expectedId);

        // Act
        Integer actualId = city.getCity_id();

        // Assert
        assertEquals(expectedId, actualId);
    }

    @Test
    public void testCityName() {
        // Arrange
        String expectedName = "New York";
        City city = new City();
        city.setName(expectedName);

        // Act
        String actualName = city.getName();

        // Assert
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testCityAvailability() {
        // Arrange
        ArrayList<Tool> expectedAvailability = new ArrayList<>();
        Tool tool1 = new Tool();
        Tool tool2 = new Tool();
        expectedAvailability.add(tool1);
        expectedAvailability.add(tool2);
        City city = new City();
        city.setAvailability(expectedAvailability);

        // Act
        ArrayList<Tool> actualAvailability = (ArrayList<Tool>) city.getAvailability();

        // Assert
        assertEquals(expectedAvailability, actualAvailability);
    }

}
