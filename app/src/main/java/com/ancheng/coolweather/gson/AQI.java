package com.ancheng.coolweather.gson;

/**
 * author: ancheng
 * date: 2017/3/13
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
