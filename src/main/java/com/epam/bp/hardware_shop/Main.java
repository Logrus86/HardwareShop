package com.epam.bp.hardware_shop;

import com.epam.bp.hardware_shop.entity.HwShop;
import com.epam.bp.hardware_shop.entity.HwShopFactory;

public class Main {
    private static final int WARES_AMOUNT = 100;

    public static void main(String[] args) {
        HwShop hwShop = HwShopFactory.createRandomHWShop(WARES_AMOUNT);
        System.out.println(hwShop);
    }
}
