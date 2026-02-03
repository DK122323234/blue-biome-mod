package com.blue_biome;

import com.blue_biome.biome.BlueBiomeTerraBlenderRegion;
import com.blue_biome.biome.RegisterBiome;
import net.fabricmc.api.ModInitializer;
import terrablender.api.TerraBlenderApi;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.RegionType;
import terrablender.api.Regions;

import java.util.Random;

import static com.blue_biome.biome.RegisterBiome.register;
import static net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID;

public class BlueBiomeMod implements ModInitializer {
   public static final String MODID = "blue_biome_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        RegisterBiome.register();


        Regions.register(new BlueBiomeTerraBlenderRegion(new Identifier(MODID, "blue_biome"), RegionType.OVERWORLD, 10));

        LOGGER.info("Blue Biome Mod: Initialized successfully!");
    }
}