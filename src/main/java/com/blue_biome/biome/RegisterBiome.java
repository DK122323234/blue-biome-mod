package com.blue_biome.biome;

import com.blue_biome.BlueBiomeMod;
import com.mojang.serialization.Codec;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;

import java.util.stream.Stream;

public class RegisterBiome {
    public static final RegistryKey<Biome> BLUE_BIOME = registerBiome("blue_biome");

    private static RegistryKey<Biome> registerBiome(String id) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(BlueBiomeMod.MODID, id));
    }

    public static void register() {

    }
}
