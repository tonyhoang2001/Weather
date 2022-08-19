package com.example.weatherapp.mapper;

import com.example.weatherapp.dto.WeatherDTO;
import com.example.weatherapp.model.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WeatherMapper {
    @Mapping(target = "cityList",ignore = true)
    WeatherDTO toWeatherDTO(Weather weather);
    Weather toWeather(WeatherDTO weatherDTO);
}
