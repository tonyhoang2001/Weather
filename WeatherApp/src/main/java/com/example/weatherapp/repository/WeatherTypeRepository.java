package com.example.weatherapp.repository;

import com.example.weatherapp.model.WeatherType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherTypeRepository extends JpaRepository<WeatherType,Integer> {

}
