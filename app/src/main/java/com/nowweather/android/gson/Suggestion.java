package com.nowweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 付存哲kk on 2017/2/27.
 * 一些与天气相关的建议
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
