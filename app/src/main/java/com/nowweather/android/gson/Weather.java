package com.nowweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 付存哲kk on 2017/2/27.
 * 总的天气实例类  用来引用刚刚创建好的各个实体类
 */

public class Weather {
    //当前请求状态
    public String status;
    //一些天气的基本信息
    public Basic basic;
    //空气质量
    public AQI aqi;
    //当前天气信息
    public Now now;
    //一些天气相关的建议
    public Suggestion suggestion;
    //未来几天内的天气信息
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
