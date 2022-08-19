package com.example.weatherapp.repository;

import com.example.weatherapp.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<Weather,Integer> {

//    @Query("select u from ")
//    List<Weather> findWeatherByCityId(int id);

}
