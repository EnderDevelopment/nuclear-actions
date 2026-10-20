package com.example.electricityredstoneexpansion;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricityRedstoneExpansionMod implements ModInitializer {
    public static final String MOD_ID = "electricity_redstone_expansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Electricity Redstone Expansion mod initialized");
    }
}