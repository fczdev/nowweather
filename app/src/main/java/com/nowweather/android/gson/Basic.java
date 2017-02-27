package com.nowweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 付存哲kk on 2017/2/27.
 * 城市基本信息
 */

public class Basic {

    //使用@SerializedName注解的方式让JSON字段与Java字段建立起映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata update;

    public class Updata{

        @SerializedName("loc")
        public String updateTime;
    }
}
