package com.nowweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 付存哲kk on 2017/2/27.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Tempterature tempterature;

    @SerializedName("cond")
    public More more;

    public class Tempterature{

        public String max;

        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
