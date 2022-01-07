package com.spartaglobal.injector;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spartaglobal.dto.WeatherDTO;

import java.io.IOException;
import java.net.URL;

public class Injector {
    public static ObjectMapper objectMapper = new ObjectMapper();

    public static WeatherDTO injectWeatherDTO(String path) {
        WeatherDTO weatherDTO = new WeatherDTO();
        try {
            weatherDTO = objectMapper.readValue(new URL(path), WeatherDTO.class);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return weatherDTO;
    }
}
