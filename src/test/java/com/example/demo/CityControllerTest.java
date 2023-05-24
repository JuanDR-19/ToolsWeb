package com.example.demo;

import com.example.demo.Controllers.CityController;
import com.example.demo.Entities.City;
import com.example.demo.Services.CityService;
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
public class CityControllerTest {

    @Mock
    private CityService cityService;

    @InjectMocks
    private CityController cityController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testGetAll() {
        // Arrange
        ArrayList<City> expectedCities = new ArrayList<>();
        expectedCities.add(new City());
        when(cityService.SearchAll()).thenReturn(expectedCities);

        // Act
        ArrayList<City> actualCities = cityController.getAll();

        // Assert
        assertEquals(expectedCities, actualCities);
        verify(cityService, times(1)).SearchAll();
    }

    @Test
    public void NewCityTest() {
        // Arrange
        City city = new City();

        // Act
        cityController.NewCity(city);

        // Assert
        verify(cityService, times(1)).Put(city);
    }

    @Test
    public void updateCityTest() {
        // Arrange
        City city = new City();
        Integer id = 1;
        City existingCity = new City();
        when(cityService.findOne(id)).thenReturn(existingCity);

        // Act
        String response = cityController.updateCity(city, id);

        // Assert
        assertEquals("Exito", response);
        verify(cityService, times(1)).findOne(id);
        verify(cityService, times(1)).updateCity(existingCity);
    }

    @Test
    public void deleteCityTest() {
        // Arrange
        Integer id = 1;

        // Act
        cityController.deleteCity(id);

        // Assert
        verify(cityService, times(1)).deleteCity(id);
    }

}
