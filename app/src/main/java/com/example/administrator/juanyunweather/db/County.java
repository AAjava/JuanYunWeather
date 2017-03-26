package com.example.administrator.juanyunweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/21.
 */
public class County extends DataSupport {
    private int id; //字段id
    private String countyName;  //区县名
    private String weatherId;   //天气id
    private int cityId; //城市id

    public County() {
    }

    public County(int id, String countyName, String weatherId, int cityId) {
        this.id = id;
        this.countyName = countyName;
        this.weatherId = weatherId;
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
