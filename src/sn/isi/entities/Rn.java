package sn.isi.entities;

import java.util.List;

public class Rn {
    private int id;
    private List<Zone> zones;
    private Double latitude;
    private Double longitude;

    //Constructeurs

    public Rn() {
    }

    public Rn(int id, List<Zone> zones, Double latitude, Double longitude) {
        this.id = id;
        this.zones = zones;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    //Getters et Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}

