package com.example.weatherapp.controller;

import com.example.weatherapp.dto.CityDTO;
import com.example.weatherapp.mapper.CityMapper;
import com.example.weatherapp.model.City;
import com.example.weatherapp.repository.CityRepository;
import com.example.weatherapp.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    private final CityMapper cityMapper;

    @PostMapping("/city")
    public ResponseEntity<CityDTO> add(@RequestBody CityDTO cityDTO) {
        City city = cityMapper.toCity(cityDTO);
        cityService.addCity(city);
        return ResponseEntity.status(HttpStatus.CREATED).body(cityDTO);
    }

    @GetMapping("/city")
    public ResponseEntity<List<CityDTO>> getAll(@PageableDefault Pageable pageable) {
        List<City> cityList = cityService.getAllCity(pageable);
        List<CityDTO> cityDTOList = new ArrayList<>();

        for (City c : cityList) {
            cityDTOList.add(cityMapper.toCityDTO(c));
        }

        return ResponseEntity.ok(cityDTOList);
    }

    @GetMapping("/city/{id}")
    public ResponseEntity<CityDTO> getCityById(@PathVariable int id) {
        Optional<City> city = cityService.getCityById(id);

        CityDTO cityDTO = cityMapper.toCityDTO(city.orElseThrow());

        return ResponseEntity.ok(cityDTO);

    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        cityService.deleteCityById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

//    @PutMapping("/weather/{id}")
//    public ResponseEntity<CityDTO> edit(@RequestBody CityDTO cityDTO,
//                                        @PathVariable Integer id) {
//        if (cityService.getCityById(id).isPresent()) {
//            City city = cityService.getCityById(id).get();
//
//        }
//
//    }

}
