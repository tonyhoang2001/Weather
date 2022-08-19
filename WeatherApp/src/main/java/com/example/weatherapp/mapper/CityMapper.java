package com.example.weatherapp.mapper;

import com.example.weatherapp.dto.CityDTO;
import com.example.weatherapp.model.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface CityMapper {
    @Mapping(source = "weatherList", target = "weatherList")
    CityDTO toCityDTO(City city);
    City toCity(CityDTO cityDTO);
}
