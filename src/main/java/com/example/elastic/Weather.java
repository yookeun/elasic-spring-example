package com.example.elastic;

import lombok.Data;

/**
 * Created by yookeun on 2017. 11. 5..
 */
@Data
public class Weather {
    private String city;
    private double temperature;
    private String season;
}
