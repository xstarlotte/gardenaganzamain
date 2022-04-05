package com.starlotte.gardenaganza.features;

import com.starlotte.gardenaganza.GardenaganzaBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;

public class GardenaganzaConfiguredFeatures {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DAFFODIL_SPREAD =
            FeatureUtils.register("daffodil_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(GardenaganzaBlocks.YELLOW_DAFFODILS.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.PINK_DAFFODILS.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.MIXED_DAFFODILS.get().defaultBlockState(), 1)
                    ), 16)));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PEONY_SPREAD =
            FeatureUtils.register("peony_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(GardenaganzaBlocks.WHITE_CAPPED_PEONIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.PINK_PEONIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.MIXED_PEONIES.get().defaultBlockState(), 1)
                    ), 16)));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> AFRICAN_DAISY_SPREAD =
            FeatureUtils.register("african_daisy_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(GardenaganzaBlocks.ORANGE_AFRICAN_DAISIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.PINK_AFRICAN_DAISIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.WHITE_AFRICAN_DAISIES.get().defaultBlockState(), 1)
                    ), 16)));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> COSMO_SPREAD =
            FeatureUtils.register("cosmo_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(GardenaganzaBlocks.PINK_COSMOS.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.RED_COSMOS.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.MIXED_COSMOS.get().defaultBlockState(), 1)
                    ), 16)));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> LILY_SPREAD =
            FeatureUtils.register("lily_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(GardenaganzaBlocks.PINK_LILLIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.PURPLE_LILLIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.MIXED_LILLIES.get().defaultBlockState(), 1)
                    ), 16)));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PANSY_SPREAD =
            FeatureUtils.register("pansy_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(GardenaganzaBlocks.SUNRISE_PANSIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.VIOLA_TRICOLOUR_PANSIES.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.WHITE_PURPLE_PANSIES.get().defaultBlockState(), 1)
                    ), 16)));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> MARIGOLD_SPREAD =
            FeatureUtils.register("marigold_spread", Feature.FLOWER,
                    (grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(GardenaganzaBlocks.RED_MARIGOLDS.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.ORANGE_MARIGOLDS.get().defaultBlockState(), 1)
                            .add(GardenaganzaBlocks.YELLOW_MARIGOLDS.get().defaultBlockState(), 1)
                    ), 16)));


    private static RandomPatchConfiguration grassPatch(BlockStateProvider p_195203_, int p_195204_) {
        return FeatureUtils.simpleRandomPatchConfiguration(p_195204_,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(p_195203_)));
    }

}
