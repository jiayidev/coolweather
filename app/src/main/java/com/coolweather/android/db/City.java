package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 作者: jiayi.zhang
 * 时间: 2017/8/4
 * 描述: 市
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//市名称
    private int cityCode;//市编号
    private int provinceId;//省Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
