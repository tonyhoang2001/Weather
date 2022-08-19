package com.example.weatherapp.service;

import com.example.weatherapp.dto.WeatherDTO;
import com.example.weatherapp.dto.WeatherTypeDTO;
import com.example.weatherapp.mapper.WeatherMapper;
import com.example.weatherapp.mapper.WeatherTypeMapper;
import com.example.weatherapp.model.Weather;
import com.example.weatherapp.model.WeatherType;
import com.example.weatherapp.repository.WeatherRepository;
import com.example.weatherapp.repository.WeatherTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service
//@RequiredArgsConstructor
//public class WeatherTypeService {
//
//    private final WeatherTypeRepository weatherTypeRepository;
//    private final WeatherTypeMapper weatherTypeMapper;
//
//    public WeatherTypeDTO addWeatherType(WeatherTypeDTO weatherTypeDTO) {
//        WeatherType weatherType = new WeatherType();
//        weatherType = weatherTypeMapper.toWeatherType(weatherTypeDTO);
//        weatherTypeRepository.save(weatherType);
//        return weatherTypeDTO;
//    }
//
//    public List<WeatherTypeDTO> getAllWeatherType() {
//        List<WeatherType> weatherTypeList = weatherTypeRepository.findAll();
//        List<WeatherTypeDTO> weatherTypeDTOList = new ArrayList<>();
//        for (WeatherType w : weatherTypeList) {
//            weatherTypeDTOList.add(weatherTypeMapper.toWaWeatherTypeDTO(w));
//        }
//        return weatherTypeDTOList;
//    }
//
//    public WeatherTypeDTO getWeatherTypeById(int id) {
//        if (weatherTypeRepository.findById(id).isPresent()) {
//            WeatherType weatherType = weatherTypeRepository.findById(id).get();
//            WeatherTypeDTO weatherTypeDTO = weatherTypeMapper.toWaWeatherTypeDTO(weatherType);
//            return weatherTypeDTO;
//        }
//        return null;
//    }
//
//    public void deleteWeatherTypeById(int id) {
//        if (getWeatherTypeById(id) != null) {
//            weatherTypeRepository.deleteById(id);
//        }
//    }
//
//}
