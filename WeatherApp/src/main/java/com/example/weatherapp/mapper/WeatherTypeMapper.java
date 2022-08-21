package com.example.weatherapp.mapper;

import com.example.weatherapp.dto.WeatherTypeDTO;
import com.example.weatherapp.model.WeatherType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WeatherTypeMapper {
    WeatherTypeDTO toWaWeatherTypeDTO(WeatherType weatherType);
    WeatherType toWeatherType(WeatherTypeDTO weatherTypeDTO);
}
