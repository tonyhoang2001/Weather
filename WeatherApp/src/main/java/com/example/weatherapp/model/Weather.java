package com.example.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "weather")
@JsonIgnoreProperties(value = {"cityList"})
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double temp;
    private double temp_max;
    private double temp_min;
    private Date date;

//    @OneToMany(mappedBy = "weather",cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private List<WeatherType> weatherTypeList;

    @ManyToMany(mappedBy = "weatherList")
    @JsonBackReference
    private List<City> cityList;
}
