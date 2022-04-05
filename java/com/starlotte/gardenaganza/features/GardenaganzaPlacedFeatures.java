package com.starlotte.gardenaganza.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class GardenaganzaPlacedFeatures {

    public static final Holder<PlacedFeature> DAFFODILS_PLACED = PlacementUtils.register("daffodils_placed",
            GardenaganzaConfiguredFeatures.DAFFODIL_SPREAD, RarityFilter.onAverageOnceEvery(64),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> PEONIES_PLACED = PlacementUtils.register("peonies_placed",
            GardenaganzaConfiguredFeatures.PEONY_SPREAD, RarityFilter.onAverageOnceEvery(64),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> AFRICAN_DAISIES_PLACED = PlacementUtils.register("african_daisies_placed",
            GardenaganzaConfiguredFeatures.AFRICAN_DAISY_SPREAD, RarityFilter.onAverageOnceEvery(64),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> COSMOS_PLACED = PlacementUtils.register("cosmos_placed",
            GardenaganzaConfiguredFeatures.COSMO_SPREAD, RarityFilter.onAverageOnceEvery(64),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> LILLIES_PLACED = PlacementUtils.register("lillies_placed",
            GardenaganzaConfiguredFeatures.LILY_SPREAD, RarityFilter.onAverageOnceEvery(64),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> PANSIES_PLACED = PlacementUtils.register("pansies_placed",
            GardenaganzaConfiguredFeatures.PANSY_SPREAD, RarityFilter.onAverageOnceEvery(64),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> MARIGOLDS_PLACED = PlacementUtils.register("marigolds_placed",
            GardenaganzaConfiguredFeatures.MARIGOLD_SPREAD, RarityFilter.onAverageOnceEvery(64),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

}
