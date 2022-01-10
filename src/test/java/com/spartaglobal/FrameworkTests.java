package com.spartaglobal;
import com.spartaglobal.connection.ConnectionManager;
import com.spartaglobal.dto.WeatherDTO;
import com.spartaglobal.injector.Injector;
import org.junit.jupiter.api.*;

public class FrameworkTests {
    private static WeatherDTO weatherDTO;
    private static int statusCode;

    @BeforeAll
    public static void init() {
        weatherDTO = Injector.injectWeatherDTO(ConnectionManager.getConnectionCity("London"));
        statusCode = ConnectionManager.getStatusCode(ConnectionManager.getConnectionCity("London"));
    }

    @Test
    @DisplayName("Test status code")
    public void testStatusCode() {
        Assertions.assertEquals(200, statusCode);
    }

//    @Nested
//    @DisplayName("Checking type is correct")
//    public class CheckForType {
//
//    }

    @Nested
    @DisplayName("Checking returns are not null")
    class checkValuesAreNotNull {

        @Test
        @DisplayName(" Checking name is not null")
        public void CheckNameIsNotNull() {
            Assertions.assertFalse(weatherDTO.getName() == null);
        }

        @Test
        @DisplayName(" Checking base is not null")
        public void CheckBaseIsNotNull() {
            Assertions.assertFalse(weatherDTO.getBase() == null);

        }
        @Test
        @DisplayName(" Checking Visibility is not null")
        public void CheckVisibilityIsNotNull() {
            Assertions.assertFalse(weatherDTO.getVisibility() == null);

        }
        @Test
        @DisplayName(" Checking Timezone is not null")
        public void CheckTimeZoneIsNotNull() {
            Assertions.assertFalse(weatherDTO.getTimeZone() == null);

        }
        @Test
        @DisplayName(" Checking Main is not null")
        public void CheckMainIsNotNull() {
            Assertions.assertFalse(weatherDTO.getMain() == null);

        }
        @Test
        @DisplayName(" Checking Clouds is not null")
        public void CheckCloudsIsNotNull() {
            Assertions.assertFalse(weatherDTO.getClouds() == null);

        }
        @Test
        @DisplayName(" Checking Sys is not null")
        public void CheckSysIsNotNull() {
            Assertions.assertFalse(weatherDTO.getSys() == null);

        }
        @Test
        @DisplayName(" Checking Dt is not null")
        public void CheckDtIsNotNull() {
            Assertions.assertFalse(weatherDTO.getDt() == null);

        }

        @Test
        @DisplayName(" Checking coord is not null")
        public void CheckCoordIsNotNull() {
            Assertions.assertFalse(weatherDTO.getCoord() == null);

        }
        @Test
        @DisplayName(" Checking Weather is not null")
        public void CheckWeatherIsNotNull() {
            Assertions.assertFalse(weatherDTO.getWeather() == null);

        }
        @Test
        @DisplayName(" Checking cod is not null")
        public void CheckCodIsNotNull() {
            Assertions.assertFalse(weatherDTO.getCod() == null);

        }
        @Test
        @DisplayName(" Checking Id is not null")
        public void CheckIdIsNotNull() {
            Assertions.assertFalse(weatherDTO.getId() == null);

        }
        @Test
        @DisplayName(" Checking  is not null")
        public void CheckWindIsNotNull() {
            Assertions.assertFalse(weatherDTO.getWind() == null);
        }


    }


    
}
