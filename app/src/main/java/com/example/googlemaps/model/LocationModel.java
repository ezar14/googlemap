package com.example.googlemaps.model;

import com.google.gson.annotations.SerializedName;

public class LocationModel{
    public String getImageLocationName() {
        return ImageLocationName;
    }

    public void setImageLocationName(String imageLocationName) {
        ImageLocationName = imageLocationName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @SerializedName("nama")
    private String ImageLocationName;
    @SerializedName("Latitude")
    private String latitude;
    @SerializedName("Longitude")
    private String longitude;

    public LocationModel (String imageLocationName, String latitude, String longitude){
        this.ImageLocationName = imageLocationName;
        this.latitude = latitude;
    }
}