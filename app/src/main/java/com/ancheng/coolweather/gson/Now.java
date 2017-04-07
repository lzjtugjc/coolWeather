package com.ancheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: ancheng
 * date: 2017/3/13
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
