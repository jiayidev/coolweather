package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者: jiayi.zhang
 * 时间: 2017/8/4
 * 描述:
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
