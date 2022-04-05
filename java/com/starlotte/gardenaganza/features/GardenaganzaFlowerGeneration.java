package com.starlotte.gardenaganza.features;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class GardenaganzaFlowerGeneration {
    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(GardenaganzaPlacedFeatures.DAFFODILS_PLACED);;

            base.add(GardenaganzaPlacedFeatures.PEONIES_PLACED);

            base.add(GardenaganzaPlacedFeatures.AFRICAN_DAISIES_PLACED);

            base.add(GardenaganzaPlacedFeatures.COSMOS_PLACED);

            base.add(GardenaganzaPlacedFeatures.LILLIES_PLACED);

            base.add(GardenaganzaPlacedFeatures.PANSIES_PLACED);

            base.add(GardenaganzaPlacedFeatures.MARIGOLDS_PLACED);

        }
    }
}
