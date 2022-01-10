package com.spartaglobal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WeatherDTO {

    @JsonProperty("visibility")
    private Integer visibility;

    @JsonProperty("timezone")
    private Integer timezone;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonProperty("sys")
    private Sys sys;

    @JsonProperty("dt")
    private Integer dt;

    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("weather")
    private List<WeatherItem> weather;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private Integer cod;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("base")
    private String base;

    @JsonProperty("wind")
    private Wind wind;

    public Integer getVisibility() {
        return visibility;
    }

    public Integer getTimeZone() {
        return timezone;
    }

    public Main getMain() {
        return main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public Integer getDt() {
        return dt;
    }

    public Coord getCoord() {
        return coord;
    }

    public List<WeatherItem> getWeather() {
        return weather;
    }

    public String getName() {
        return name;
    }

    public Integer getCod() {
        return cod;
    }

    public Integer getId() {
        return id;
    }

    public String getBase() {
        return base;
    }

    public Wind getWind() {
        return wind;
    }
}
