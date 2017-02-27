package com.nowweather.android.gson;

/**
 * Created by 付存哲kk on 2017/2/27.
 * 空气质量类
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
