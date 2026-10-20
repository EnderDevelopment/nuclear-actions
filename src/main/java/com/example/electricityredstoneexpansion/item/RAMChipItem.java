package com.example.electricityredstoneexpansion.item;

import net.minecraft.world.item.Item;

public class RAMChipItem extends Item {
    private final int capacity;

    public RAMChipItem(int capacity) {
        super(new Properties().stacksTo(1));
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}