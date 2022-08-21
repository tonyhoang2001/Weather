package com.example.weatherapp.dto;

import com.example.weatherapp.model.City;
import com.example.weatherapp.model.WeatherType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherDTO {
    private int id;
    private double temp;
    private double temp_max;
    private double temp_min;
    private Date date;
    private List<City> cityList;
    private List<WeatherType> weatherTypeList;
}
