package com.spartaglobal;

import com.spartaglobal.connection.ConnectionManager;
import com.spartaglobal.dto.WeatherDTO;
import com.spartaglobal.injector.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectionLatAndLonTests {
    public static WeatherDTO weatherDTO;

    @BeforeAll
    public static void init() {
        weatherDTO = Injector.injectWeatherDTO(ConnectionManager.getConnectionLatAndLon(-0.1257,51.5085));
    }

    @Test
    @DisplayName("Lon is correct")
    public void testLon() {
        Assertions.assertEquals(-0.1257, weatherDTO.getCoord().getLat());
    }

    @Test
    @DisplayName("Lat is correct")
    public void testLat() {
        Assertions.assertEquals(51.5085, weatherDTO.getCoord().getLon());
    }
}