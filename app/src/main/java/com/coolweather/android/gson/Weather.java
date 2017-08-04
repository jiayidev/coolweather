package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者: jiayi.zhang
 * 时间: 2017/8/4
 * 描述:
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
