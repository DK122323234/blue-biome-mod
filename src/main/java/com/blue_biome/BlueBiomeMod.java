package com.blue_biome;

import com.blue_biome.biome.RegisterBiome;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class BlueBiomeMod implements ModInitializer {
   public static final String MODID = "blue_biome_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {

        LOGGER.info("Hello Fabric world!");
    }
}