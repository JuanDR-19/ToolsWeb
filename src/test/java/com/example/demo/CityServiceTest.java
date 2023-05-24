package com.example.demo;

import com.example.demo.Entities.City;
import com.example.demo.Repositories.CityRepository;
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
public class CityServiceTest {
    @Mock
    private CityRepository cityRepository;

    @InjectMocks
    private CityService cityService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSearchAll() {
        // Arrange
        ArrayList<City> expectedCities = new ArrayList<>();
        when(cityRepository.findAll()).thenReturn(expectedCities);

        // Act
        ArrayList<City> actualCities = cityService.SearchAll();

        // Assert
        assertEquals(expectedCities, actualCities);
        verify(cityRepository, times(1)).findAll();
    }

    @Test
    public void testPut() {
        // Arrange
        City city = new City();

        // Act
        cityService.Put(city);

        // Assert
        verify(cityRepository, times(1)).save(city);
    }

    @Test
    public void testUpdateCity() {
        // Arrange
        City city = new City();

        // Act
        cityService.updateCity(city);

        // Assert
        verify(cityRepository, times(1)).save(city);
    }

    @Test
    public void testDeleteCity() {
        // Arrange
        Integer id = 1;

        // Act
        cityService.deleteCity(id);

        // Assert
        verify(cityRepository, times(1)).deleteById(id);
    }

    @Test
    public void testFindOne_Exists() {
        // Arrange
        Integer id = 1;
        City expectedCity = new City();
        when(cityRepository.existsById(id)).thenReturn(true);
        when(cityRepository.getReferenceById(id)).thenReturn(expectedCity);

        // Act
        City actualCity = cityService.findOne(id);

        // Assert
        assertEquals(expectedCity, actualCity);
        verify(cityRepository, times(1)).existsById(id);
        verify(cityRepository, times(1)).getReferenceById(id);
    }@Test
    public void testFindOne_NotExists() {
        // Arrange
        Integer id = 1;
        when(cityRepository.existsById(id)).thenReturn(false);

        // Act
        City actualCity = cityService.findOne(id);

        // Assert
        assertEquals(null, actualCity);
        verify(cityRepository, times(1)).existsById(id);
        verify(cityRepository, times(0)).getReferenceById(id);
    }
}
