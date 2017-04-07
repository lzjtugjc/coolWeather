package com.ancheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: ancheng
 * date: 2017/3/13
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("Cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
