package com.example.weatherapp.service;

import com.example.weatherapp.dto.WeatherDTO;
import com.example.weatherapp.mapper.WeatherMapper;
import com.example.weatherapp.model.Weather;
import com.example.weatherapp.repository.WeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service
//@RequiredArgsConstructor
//public class WeatherService {
//
//    private final WeatherRepository weatherRepository;
//    private final WeatherMapper weatherMapper;
//
//    public WeatherDTO addWeather(WeatherDTO weatherDTO) {
//        Weather weather = new Weather();
//        weather = weatherMapper.toWeather(weatherDTO);
//        weatherRepository.save(weather);
//        return weatherDTO;
//    }
//
//    public List<WeatherDTO> getAllWeatherByCityId() {
//        List<Weather> weathers = weatherRepository.findAll();
//        List<WeatherDTO> weatherDTOS = new ArrayList<>();
//        for (Weather w : weathers) {
//            weatherDTOS.add(weatherMapper.toWeatherDTO(w));
//        }
//        return weatherDTOS;
//    }
//
//    public WeatherDTO getWeatherById(int id) {
//        if (weatherRepository.findById(id).isPresent()) {
//            Weather weather = weatherRepository.findById(id).get();
//            WeatherDTO weatherDTO = weatherMapper.toWeatherDTO(weather);
//            return weatherDTO;
//        }
//        return null;
//    }
//
//    public void deleteWeatherById(int id) {
//        if (getWeatherById(id) != null) {
//            weatherRepository.deleteById(id);
//        }
//    }
//
//}
