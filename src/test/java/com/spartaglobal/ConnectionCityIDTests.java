package com.spartaglobal;
public class ConnectionCityIDTests {


import com.spartaglobal.connection.ConnectionManager;
import com.spartaglobal.dto.WeatherDTO;
import com.spartaglobal.injector.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectionCityIDTests {
    public static WeatherDTO weatherDTO;

    @BeforeAll
    public static void init() {
        weatherDTO = Injector.injectWeatherDTO(ConnectionManager.getConnectionCityId(2643743));
    }

    @Test
    @DisplayName("ID is correct")
    public void testId() {
        Assertions.assertEquals(2643743, weatherDTO.getId());
    }

}

