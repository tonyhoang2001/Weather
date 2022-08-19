package com.example.weatherapp.controller;

import com.example.weatherapp.dto.CityDTO;
//import com.example.weatherapp.dto.WeatherDTO;
//import com.example.weatherapp.dto.WrapperDTO;
import com.example.weatherapp.service.CityService;
//import com.example.weatherapp.service.WeatherService;
//import com.example.weatherapp.service.WeatherTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MyController {

    private final CityService cityService;
//    private final WeatherService weatherService;
//    private final WeatherTypeService weatherTypeService;

//    @GetMapping("/city")
//    public ResponseEntity<List<WrapperDTO>> getAllC(@PageableDefault Pageable pageable){
//        List<WrapperDTO> wrapperDTOList = cityService.getAllCity(pageable);
//        return ResponseEntity.ok(wrapperDTOList);
//    }

    @GetMapping("/city")
    public ResponseEntity<List<CityDTO>> getAllC(@PageableDefault Pageable pageable){
        List<CityDTO> wrapperDTOList = cityService.getAllCity(pageable);
        return ResponseEntity.ok(wrapperDTOList);
    }
//
//    @GetMapping("/city/{id}")
//    public ResponseEntity<CityDTO> getCById(@PathVariable Integer id){
//        CityDTO cityDTO = cityService.getCityById(id);
//        return ResponseEntity.ok(cityDTO);
//    }
//
//    @PostMapping("/city")
//    public ResponseEntity<CityDTO> addC(@RequestBody CityDTO cityDTO){
//        CityDTO cityDTO1 = cityService.addCity(cityDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(cityDTO1);
//    }
//
//    @DeleteMapping("/city/{id}")
//    public ResponseEntity<CityDTO> deleteC(@PathVariable Integer id){
//        cityService.deleteCityById(id);
//        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
//    }

}
