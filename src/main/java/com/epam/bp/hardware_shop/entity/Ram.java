package com.epam.bp.hardware_shop.entity;

public class Ram extends Ware {
    private int capacityMb;
    private int maxFrequencyMHz;
    private RamType ramtype;

    public int getCapacityMb() {
        return capacityMb;
    }

    public Ram setCapacityMb(int capacityMb) {
        this.capacityMb = capacityMb;
        return this;
    }

    public int getMaxFrequencyMHz() {
        return maxFrequencyMHz;
    }

    public Ram setMaxFrequencyMHz(int maxFrequencyMHz) {
        this.maxFrequencyMHz = maxFrequencyMHz;
        return this;
    }

    public RamType getRamtype() {
        return ramtype;
    }

    public Ram setRamtype(RamType ramtype) {
        this.ramtype = ramtype;
        return this;
    }

    @Override
    public String toString() {
        return "Ram {" +
                "capacityMb=" + this.getCapacityMb() +
                ", maxFrequencyMHz=" + this.getMaxFrequencyMHz() +
                ", ramtype=" + this.getRamtype() +
                ", vendor=" + this.getVendor() +
                ", model='" + this.getModel() +
                ", weight=" + this.getWeight() +
                ", price=" + this.getPrice() +
                '}';
    }

    public enum RamType {
        DDR2, DDR3
    }
}
