
package com.openweatherweapper.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CurrentWeather {

    @SerializedName("coord")
    @Expose
    private Coord coordinates;
    @SerializedName("weather")
    @Expose
    private List<Weather> weather = new ArrayList<Weather>();
    @SerializedName("main")
    @Expose
    private Main main;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("wind")
    @Expose
    private Wind windInfo;
    @SerializedName("clouds")
    @Expose
    private Clouds cloudsInfo;
    @SerializedName("createdDate")
    @Expose
    private long createdDate;
    @SerializedName("sys")
    @Expose
    private Sys sys;
    @SerializedName("id")
    @Expose
    private long cityId;
    @SerializedName("name")
    @Expose
    private String cityName;
    @SerializedName("rain")
    @Expose
    private Rain rainInfo;
    @SerializedName("snow")
    @Expose
    private Snow snowInfo;

    /**
     * @return Coordinates
     * @see Coord
     */
    public Coord getCoordinates() {
        return coordinates;
    }

    /**
     * @return Weather information
     * @see Weather
     */
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     * @return {@link Main}
     * @see Main
     */
    public Main getMain() {
        return main;
    }

    /**
     * @return The visibility
     */
    public int getVisibility() {
        return visibility;
    }

    /**
     * @return Wind information
     * @see Wind
     */
    public Wind getWindInfo() {
        return windInfo;
    }

    /**
     * @return Get cloudiness information
     * @see Clouds
     */
    public Clouds getCloudsInfo() {
        return cloudsInfo;
    }

    /**
     * @return Time of data calculation, unix, UTC
     */
    public long getCreatedDate() {
        return createdDate;
    }

    /**
     * @return System parameters
     * @see Sys
     */
    public Sys getSys() {
        return sys;
    }

    /**
     * @return City id
     */
    public long getCityId() {
        return cityId;
    }

    /**
     * @return City cityName
     */
    public String getCityName() {
        return cityName;
    }

    public Rain getRainInfo() {
        return rainInfo;
    }

    public Snow getSnowInfo() {
        return snowInfo;
    }
}