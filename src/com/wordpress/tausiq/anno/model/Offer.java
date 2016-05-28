package com.wordpress.tausiq.anno.model;


public class Offer {

    private String title;

    private String brand;

    private float price;

    public Offer(String title, String brand, float price) {
        this.title = title;
        this.brand = brand;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
