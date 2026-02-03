package com.blue_biome.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class BlueBiomeTerraBlenderRegion extends Region {
    public BlueBiomeTerraBlenderRegion(Identifier name, RegionType type, int weight) {
        super(name, type, weight);
    }
    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {builder.replaceBiome(BiomeKeys.DARK_FOREST, RegisterBiome.BLUE_BIOME);});
    }
}
