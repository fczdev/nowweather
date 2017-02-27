package com.nowweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 付存哲kk on 2017/2/27.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
