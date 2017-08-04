package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 作者: jiayi.zhang
 * 时间: 2017/8/4
 * 描述: 省
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省名称
    private int provinceCode;//省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
