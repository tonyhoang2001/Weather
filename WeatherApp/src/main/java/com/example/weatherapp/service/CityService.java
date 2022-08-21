package com.example.weatherapp.service;

import com.example.weatherapp.dto.CityDTO;
import com.example.weatherapp.mapper.CityMapper;
import com.example.weatherapp.model.City;
import com.example.weatherapp.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public City addCity(City city) {
        return cityRepository.save(city);
    }

    public Optional<City> getCityById(int id) {
        return cityRepository.findById(id);
    }

    public List<City> getAllCity(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(),pageable.getPageSize());
        List<City> cityList = cityRepository.findAll(pageable).getContent();
        return cityList;
    }

    public void deleteCityById(int id){
        cityRepository.deleteById(id);
    }

}
