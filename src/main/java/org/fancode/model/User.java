package org.fancode.model;

import com.google.gson.annotations.SerializedName;

public class User {

    public int id;
    public String name;
    public Address address;

    public static class Address {
        public Geo geo;

        public static class Geo {
            @SerializedName("lat")
            public double latitude;

            @SerializedName("lng")
            public double longitude;
        }
    }
}
