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
    @DisplayName("Checking type is correct")
    public class CheckForType {
        @Test
        @DisplayName("Check that coordinates are correct type")
        public void checkCoordinatesCoord(){
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
}
