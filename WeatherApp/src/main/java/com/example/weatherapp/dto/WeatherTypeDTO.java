package com.example.weatherapp.dto;

import com.example.weatherapp.model.Weather;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class WeatherTypeDTO {
    private String type;
    private WeatherDTO weather;
}
