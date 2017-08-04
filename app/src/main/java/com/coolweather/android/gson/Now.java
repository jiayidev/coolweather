package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者: jiayi.zhang
 * 时间: 2017/8/4
 * 描述:
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
