package com.example.weatherapp.mapper;

import com.example.weatherapp.dto.WeatherDTO;
import com.example.weatherapp.model.Weather;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WeatherMapper {
    WeatherDTO toWeatherDTO(Weather weather);
    Weather toWeather(WeatherDTO weatherDTO);
}
