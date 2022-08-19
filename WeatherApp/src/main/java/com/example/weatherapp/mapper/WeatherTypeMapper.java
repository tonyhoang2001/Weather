package com.example.weatherapp.mapper;

import com.example.weatherapp.dto.WeatherTypeDTO;
import com.example.weatherapp.model.WeatherType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WeatherTypeMapper {
    @Mapping(target = "weather",ignore = true)
    WeatherTypeDTO toWaWeatherTypeDTO(WeatherType weatherType);
    WeatherType toWeatherType(WeatherTypeDTO weatherTypeDTO);
}
