package com.example.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
@JsonIgnoreProperties(value = {"weatherList"})
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY )
    @JoinTable(name = "city_weather",
               joinColumns = @JoinColumn(name = "weather_id"),
               inverseJoinColumns = @JoinColumn(name = "city_id")
    )
    @JsonManagedReference
    private List<Weather> weatherList;
}
