package com.yzb.pad.pojo;

/**
 * Created by brander on 2018/9/23
 */
public class Bunker {

    private String bunker;
    private String raw;
    private String batch;
    private Double weight;


    public String getBunker() {
        return bunker;
    }

    public void setBunker(String bunker) {
        this.bunker = bunker;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "bunker='" + bunker + '\'' +
                ", raw='" + raw + '\'' +
                ", batch='" + batch + '\'' +
                ", weight=" + weight +
                '}';
    }
}
