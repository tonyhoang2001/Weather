package com.example.weatherapp.dto;

import com.example.weatherapp.model.Weather;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CityDTO {
    private int id;
    private String name;
    private List<Weather> weatherList;
}
