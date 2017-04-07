package com.ancheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: ancheng
 * date: 2017/3/13
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
