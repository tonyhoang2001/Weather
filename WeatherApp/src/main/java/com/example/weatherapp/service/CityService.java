package com.example.weatherapp.service;


import com.example.weatherapp.dto.CityDTO;
import com.example.weatherapp.dto.WeatherDTO;
import com.example.weatherapp.dto.WeatherTypeDTO;
//import com.example.weatherapp.dto.WrapperDTO;
import com.example.weatherapp.mapper.CityMapper;
//import com.example.weatherapp.mapper.WrapperMapper;
import com.example.weatherapp.model.City;
import com.example.weatherapp.model.Weather;
import com.example.weatherapp.model.WeatherType;
//import com.example.weatherapp.model.Wrapper;
import com.example.weatherapp.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;
//    private final WrapperMapper wrapperMapper;

//    public CityDTO addCity(CityDTO cityDTO) {
//        City city = new City();
//        city = cityMapper.toCity(cityDTO);
//        cityRepository.save(city);
//        return cityDTO;
//    }

    public List<CityDTO> getAllCity(Pageable pageable) {

        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());
        List<City> cityList = cityRepository.findAll(pageable).getContent();

        List<CityDTO> cityDTOList = new ArrayList<>();

        for (City w : cityList) {
            cityDTOList.add(cityMapper.toCityDTO(w));
        }

        return cityDTOList;
    }


//    public List<WrapperDTO> getAllCity(Pageable pageable) {
//
//        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());
//        List<City> cityList = cityRepository.findAll(pageable).getContent();
//        List<Wrapper> wrapperList = new ArrayList<>();
//
//        for (City c : cityList) {
//            List<List<WeatherType>> weatherTypeList = new ArrayList<>();
//
//            for (Weather w : c.getWeatherList()) {
//                weatherTypeList.add(w.getWeatherTypeList());
//            }
//            wrapperList.add(new Wrapper(c.getId(), c.getName(), c.getWeatherList(), weatherTypeList));
//        }
//
//        List<WrapperDTO> wrapperDTOList = new ArrayList<>();
//
//        for (Wrapper w : wrapperList) {
//            wrapperDTOList.add(wrapperMapper.toWrapperDTO(w));
//        }
//
//        return wrapperDTOList;
//    }

//    public CityDTO getCityById(int id) {
//        if (cityRepository.findById(id).isPresent()) {
//            City city = cityRepository.findById(id).get();
//            CityDTO cityDTO = cityMapper.toCityDTO(city);
//            return cityDTO;
//        }
//        return null;
//    }
//
//    public void deleteCityById(int id) {
//        if (getCityById(id) != null) {
//            cityRepository.deleteById(id);
//        }
//    }

//    public List<CityDTO> toCityDTOList(List<City> cityList){
//
//        List<CityDTO> cityDTOList = new ArrayList<>();
//
//        for (City c : cityList) {
//            cityDTOList.add(toCityDTO(c));
//        }
//
//        return cityDTOList;
//    }
//
//    public List<City> toCityList(List<CityDTO> cityDTOList){
//
//        List<City> cityList = new ArrayList<>();
//
//        for (CityDTO c : cityDTOList) {
//            cityList.add(toCity(c));
//        }
//
//        return cityList;
//    }
//
//    private CityDTO toCityDTO(City city){
//        CityDTO cityDTO = new CityDTO();
//        cityDTO.setName(city.getName());
//        cityDTO.setWeatherTypeList(city.getWeatherTypeList());
//        return cityDTO;
//
//    }
//
//    private City toCity(CityDTO cityDTO){
//        City city = new City();
//        city.setName(city.getName());
//        city.setWeatherTypeList(cityDTO.getWeatherTypeList());
//        return city;
//    }

}
