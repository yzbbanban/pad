package com.yzb.pad.pojo;

/**
 * Created by brander on 2018/9/23
 */
public class Bucket {
    private String idName;
    private String bucketName;
    private String bucketNumber;
    private String bucketSendDate;
    private Double weight;
    private String bucketExpiryDate;

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketNumber() {
        return bucketNumber;
    }

    public void setBucketNumber(String bucketNumber) {
        this.bucketNumber = bucketNumber;
    }

    public String getBucketSendDate() {
        return bucketSendDate;
    }

    public void setBucketSendDate(String bucketSendDate) {
        this.bucketSendDate = bucketSendDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBucketExpiryDate() {
        return bucketExpiryDate;
    }

    public void setBucketExpiryDate(String bucketExpiryDate) {
        this.bucketExpiryDate = bucketExpiryDate;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "idName='" + idName + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", bucketNumber='" + bucketNumber + '\'' +
                ", bucketSendDate='" + bucketSendDate + '\'' +
                ", weight=" + weight +
                ", bucketExpiryDate='" + bucketExpiryDate + '\'' +
                '}';
    }
}
