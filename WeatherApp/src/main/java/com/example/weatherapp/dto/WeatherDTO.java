package com.example.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class WeatherDTO {
    private double temp;
    private double temp_max;
    private double temp_min;
    private Date date;
//    @JsonInclude
    private List<WeatherTypeDTO> weatherTypeList;
//    @JsonInclude
    private List<CityDTO> cityList;
}
