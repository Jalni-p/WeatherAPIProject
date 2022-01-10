package com.spartaglobal;
import com.spartaglobal.connection.ConnectionManager;
import com.spartaglobal.dto.WeatherDTO;
import com.spartaglobal.injector.Injector;
import org.junit.jupiter.api.*;

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

    }
    
}
