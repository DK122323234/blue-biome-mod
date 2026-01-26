package com.blue_biome;

import com.blue_biome.biome.RegisterBiome;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class BlueBiomeMod implements ModInitializer {
   public static final String MODID = "blue_biome_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        RegisterBiome.register();
        LOGGER.info("Hello Fabric world!");
    }
}