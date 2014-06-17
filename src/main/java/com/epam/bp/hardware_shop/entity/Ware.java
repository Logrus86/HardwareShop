package com.epam.bp.hardware_shop.entity;

import java.math.BigDecimal;

public abstract class Ware {
    private BigDecimal price;
    private int weight;
    private String model;
    private Vendor vendor;

    public Vendor getVendor() {
        return vendor;
    }

    public Ware setVendor(Vendor vendor) {
        this.vendor = vendor;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Ware setModel(String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Ware setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Ware setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{vendor=" + this.getVendor() +
                ", model='" + this.getModel() +
                ", weight=" + this.getWeight() +
                ", price=" + this.getPrice() +
                '}';
    }

    public enum Vendor {
        AMD, INTEL, NVIDIA, ASUS, HP, DELL, LENOVO, ACER, SAMSUNG, APPLE, TOSHIBA, GIGABYTE, MSI, PHILLIPS, SONY
    }
}
