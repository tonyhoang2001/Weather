package com.example.weatherapp.dto;

import com.example.weatherapp.model.WeatherType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class CityDTO {
    private int id;
    private String name;
//    @JsonInclude
    private List<WeatherDTO> weatherList;
}
