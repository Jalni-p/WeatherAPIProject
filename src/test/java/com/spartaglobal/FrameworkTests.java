package com.spartaglobal;
import com.spartaglobal.connection.ConnectionManager;
import com.spartaglobal.dto.*;
import com.spartaglobal.injector.Injector;
import org.junit.jupiter.api.*;

import java.util.List;

public class FrameworkTests {
    private static WeatherDTO weatherDTO;
    private static int statusCode;

    @BeforeAll
    public static void init(){
        weatherDTO = Injector.injectWeatherDTO(ConnectionManager.getConnectionCity("London"));
        statusCode = ConnectionManager.getStatusCode(ConnectionManager.getConnectionCity("London"));
    }
    @Test
    @DisplayName("Test status code")
    public void testStatusCode(){
        Assertions.assertEquals(200, statusCode);
    }
    @Nested
    @DisplayName("Checking type is correct")
    public class CheckForType {
        @Test
        @DisplayName("Check that coordenates are correct type")
        public void checkCoordenatesCoord(){
            Assertions.assertEquals(Coord.class, weatherDTO.getCoord().getClass());
        }

        @Test
        @DisplayName("Test that weather returns correct type")
        public void checkWeatherList(){
            Assertions.assertTrue(weatherDTO.getWeather() instanceof List<WeatherItem>);
        }

        @Test
        @DisplayName("Check that base is a string")
        public void checkBaseString(){
            Assertions.assertEquals(String.class, weatherDTO.getBase().getClass());
        }

        @Test
        @DisplayName("Check that main is correct type")
        public void checkMainMain(){
            Assertions.assertEquals(Main.class, weatherDTO.getMain().getClass());
        }

        @Test
        @DisplayName("Check that visibility is an Integer")
        public void checkVisibilityInteger(){
            Assertions.assertTrue( weatherDTO.getVisibility() instanceof Integer);
        }

        @Test
        @DisplayName("Check that wind is the correct type")
        public void checkWindWind(){
            Assertions.assertEquals(Wind.class, weatherDTO.getWind().getClass());
        }
        @Test
        @DisplayName("Check that clouds is the correct type")
        public void checkCloudsClouds(){
            Assertions.assertEquals(Clouds.class, weatherDTO.getClouds().getClass());
        }

        @Test
        @DisplayName("Check that dt is an int")
        public void checkDtInt(){
            Assertions.assertTrue(weatherDTO.getDt() instanceof Integer);
        }


        @Test
        @DisplayName("Check that sys is correct type")
        public void checkSys(){
            Assertions.assertEquals(Sys.class, weatherDTO.getSys().getClass());
        }

        @Test
        @DisplayName("Check that timezone is an int")
        public void checkTimezoneInt(){
            Assertions.assertTrue(weatherDTO.getTimeZone() instanceof Integer);
        }

        @Test
        @DisplayName("Check that id is an int")
        public void checkIdInt(){
            Assertions.assertTrue(weatherDTO.getId() instanceof Integer);
        }

        @Test
        @DisplayName("Check that name is a string")
        public void checkNameString(){
            Assertions.assertEquals(String.class, weatherDTO.getName().getClass());
        }

        @Test
        @DisplayName("Check that cod is an int")
        public void checkCodInt(){
            Assertions.assertTrue(weatherDTO.getCod() instanceof Integer);
        }

    }
    
}
