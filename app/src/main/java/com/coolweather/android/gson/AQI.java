package com.coolweather.android.gson;

/**
 * 作者: jiayi.zhang
 * 时间: 2017/8/4
 * 描述:
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
