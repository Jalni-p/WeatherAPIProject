package com.spartaglobal;

import com.spartaglobal.connection.ConnectionManager;
import com.spartaglobal.dto.WeatherDTO;
import com.spartaglobal.injector.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectionCityAndCountryTest {
    public static WeatherDTO weatherDTO;

    @BeforeAll
    public static void init() {
        weatherDTO = Injector.injectWeatherDTO(ConnectionManager.getConnectionCityAndCountry("London", "uk"));
    }

    @Test
    @DisplayName("City and Country is correct")
    public void testCityAndCountry() {
        Assertions.assertEquals("London", weatherDTO.getName());
    }

}
