package com.example.weatherapp.controller;

import com.example.weatherapp.dto.CityDTO;
//import com.example.weatherapp.mapper.CityMapper;
import com.example.weatherapp.model.City;
import com.example.weatherapp.repository.CityRepository;
//import com.example.weatherapp.service.CityService;
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

//@RestController
//@RequestMapping("/api")
//@RequiredArgsConstructor
//public class CityController {
//
//    private final CityService cityService;
//
//    private final CityMapper cityMapper;
//
//    @PostMapping("/weather")
//    public ResponseEntity<CityDTO> add(@RequestBody CityDTO cityDTO) {
//        City city = cityMapper.toCity(cityDTO);
//        cityService.addCity(city);
//        return ResponseEntity.status(HttpStatus.CREATED).body(cityDTO);
//    }
//
////    @GetMapping("/weather")
////    public ResponseEntity<List<City>> getAll(@PageableDefault Pageable page) {
////        List<City> cityDTOList = cityService.paging(page).getContent();
////        return ResponseEntity.ok(cityDTOList);
////    }
//
//    @GetMapping("/weather")
//    public ResponseEntity<Page<City>> getAll(@PageableDefault Pageable page) {
//        Page<City> cityDTOList = cityService.paging(page);
//        return ResponseEntity.ok(cityDTOList);
//    }
//
//    @GetMapping("/weather/{id}")
//    public ResponseEntity<CityDTO> getCityById(@PathVariable Long id) {
//        Optional<City> cityOp = cityService.getCityById(id);
//
//        if (cityOp.isPresent()) {
//            CityDTO cityDTO = cityMapper.toCityDTO(cityOp.get());
//            return ResponseEntity.ok(cityDTO);
//        } else {
//            throw new NullPointerException();
//        }
//    }
//
//    @DeleteMapping("/weather/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id){
//        cityService.deleteCityById(id);
//        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
//    }
//
////    @PutMapping("/weather/{id}")
////    public ResponseEntity<CityDTO> edit(@RequestBody CityDTO cityDTO,
////                                        @PathVariable Integer id) {
////        if (cityService.getCityById(id).isPresent()) {
////            City city = cityService.getCityById(id).get();
////
////        }
////
////    }
//
//}
