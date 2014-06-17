package com.epam.bp.hardware_shop.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HwShop {
    public List<Ware> wares = new ArrayList<Ware>();
    private String title;
    private String address;
    private int waresAmount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWaresAmount() {
        return waresAmount;
    }

    public HwShop setWaresAmount(int waresAmount) {
        this.waresAmount = waresAmount;
        return this;
    }

    public void add(Ware ware) {
        wares.add(ware);
    }

    public BigDecimal getTotalWaresCost() {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (Ware ware : wares) {
            totalCost = totalCost.add(ware.getPrice());
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Hardware shop named '");
        result.append(this.getTitle());
        result.append("' with address: '");
        result.append(this.getAddress());
        result.append("'.\nWares amount at store: ");
        result.append(this.getWaresAmount());
        result.append(".\nTotal wares cost: ");
        result.append(this.getTotalWaresCost());
        result.append(".\n\nFull wares list:\n");
        int i = 0;
        for (Ware ware : wares) {
            result.append((i + 1));
            result.append(". ");
            result.append(ware);
            result.append("\n");
            i++;
        }
        return result.toString();
    }
}
