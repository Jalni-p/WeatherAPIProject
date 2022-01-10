package com.spartaglobal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

	@JsonProperty("temp")
	private Double temp;

	@JsonProperty("temp_min")
	private Double tempMin;

	@JsonProperty("humidity")
	private Integer humidity;

	@JsonProperty("pressure")
	private Integer pressure;

	@JsonProperty("feels_like")
	private Double feelsLike;

	@JsonProperty("temp_max")
	private Double tempMax;

	@JsonProperty("sea_level")
	private Integer seaLevel;

	@JsonProperty("grnd_level")
	private Integer grndLevel;

	public Double getTemp(){
		return temp;
	}

	public Double getTempMin(){
		return tempMin;
	}

	public Integer getHumidity(){
		return humidity;
	}

	public Integer getPressure(){
		return pressure;
	}

	public Double getFeelsLike(){
		return feelsLike;
	}

	public Double getTempMax(){
		return tempMax;
	}

	public Integer getSeaLevel() { return seaLevel; }

	public Integer getGrndLevel() { return grndLevel; }

}