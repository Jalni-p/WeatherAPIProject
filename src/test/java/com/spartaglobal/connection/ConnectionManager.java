package com.spartaglobal.connection;

import com.spartaglobal.ConfigReader;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.URI.create;

public class ConnectionManager {
    private static final String BASEURL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String KEY = ConfigReader.getConfigKey();


    public static String getConnectionCity(String city) {
        return BASEURL + "?q=" + city + "&appid=" + KEY;
    }

    public static String getConnectionCityAndCountry(String city, String country) {
        return BASEURL + "?q=" + city + ",\"\"," + country + "&appid=" + KEY;
    }

    public static String getConnectionCityId(int id) {
        return BASEURL + "?id=" + id + "&appid=" + KEY;
    }

    public static String getConnectionLatAndLon(String lat, String lon) {
        return BASEURL + "?lat=" + lat + "&lon=" + lon + "&appid=" + KEY;
    }

    public static int getStatusCode(String connection) {
        HttpResponse<String> httpResponse = getStringHttpResponse(connection);
        return httpResponse.statusCode();
    }

    public static String getHeader(String connection, String key){
        HttpResponse<String> httpResponse = getStringHttpResponse(connection);
        return httpResponse.headers().map().get(key).get(0);
    }

    private static HttpResponse<String> getStringHttpResponse(String connection) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(create(connection))
                .build();
        HttpResponse<String> httpResponse = null;

        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

}
