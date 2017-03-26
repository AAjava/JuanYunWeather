package com.example.administrator.juanyunweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/21.
 */
public class City extends DataSupport {
    private int id;     //字段id.
    private String cityName;    //城市名.
    private int cityCode;   //城市代号.
    private int provinceId; //城市所属省份字段id.

    public City() {
    }

    public City(int id, String cityName, int cityCode, int provinceId) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
    }

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
