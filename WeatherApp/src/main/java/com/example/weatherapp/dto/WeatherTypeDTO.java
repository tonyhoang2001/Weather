package com.example.weatherapp.dto;

import com.example.weatherapp.model.Weather;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherTypeDTO {
    private int id;
    private String type;
    private Weather weather;
}
