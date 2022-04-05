package com.starlotte.gardenaganza;


import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Gardenaganza.MOD_ID)
public class Gardenaganza {
    public static final String MOD_ID = "gardenaganza";

    private static final Logger LOGGER = LogManager.getLogger();

    public Gardenaganza() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        GardenaganzaBlocks.register(eventBus);
        GardenaganzaItems.register(eventBus);
        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
     //putting_the_flowers_into_a_composter
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.YELLOW_DAFFODILS.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.PINK_DAFFODILS.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.MIXED_DAFFODILS.get(), 0.65f);

            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.PINK_PEONIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.MIXED_PEONIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.WHITE_CAPPED_PEONIES.get(), 0.65f);

            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.WHITE_AFRICAN_DAISIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.PINK_AFRICAN_DAISIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.ORANGE_AFRICAN_DAISIES.get(), 0.65f);

            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.PINK_COSMOS.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.RED_COSMOS.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.MIXED_COSMOS.get(), 0.65f);

            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.PINK_LILLIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.PURPLE_LILLIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.MIXED_LILLIES.get(), 0.65f);

            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.SUNRISE_PANSIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.WHITE_PURPLE_PANSIES.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.VIOLA_TRICOLOUR_PANSIES.get(), 0.65f);

            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.RED_MARIGOLDS.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.ORANGE_MARIGOLDS.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(GardenaganzaBlocks.YELLOW_MARIGOLDS.get(), 0.65f);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.YELLOW_DAFFODILS.getId(),
                    GardenaganzaBlocks.POTTED_YELLOW_DAFFODILS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.PINK_DAFFODILS.getId(),
                    GardenaganzaBlocks.POTTED_PINK_DAFFODILS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.MIXED_DAFFODILS.getId(),
                    GardenaganzaBlocks.POTTED_MIXED_DAFFODILS);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.PINK_PEONIES.getId(),
                    GardenaganzaBlocks.POTTED_PINK_PEONIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.MIXED_PEONIES.getId(),
                    GardenaganzaBlocks.POTTED_MIXED_PEONIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.WHITE_CAPPED_PEONIES.getId(),
                    GardenaganzaBlocks.POTTED_WHITE_CAPPED_PEONIES);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.WHITE_AFRICAN_DAISIES.getId(),
                    GardenaganzaBlocks.POTTED_WHITE_AFRICAN_DAISIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.PINK_AFRICAN_DAISIES.getId(),
                    GardenaganzaBlocks.POTTED_PINK_AFRICAN_DAISIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.ORANGE_AFRICAN_DAISIES.getId(),
                    GardenaganzaBlocks.POTTED_ORANGE_AFRICAN_DAISIES);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.PINK_COSMOS.getId(),
                    GardenaganzaBlocks.POTTED_PINK_COSMOS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.RED_COSMOS.getId(),
                    GardenaganzaBlocks.POTTED_RED_COSMOS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.MIXED_COSMOS.getId(),
                    GardenaganzaBlocks.POTTED_MIXED_COSMOS);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.PINK_LILLIES.getId(),
                    GardenaganzaBlocks.POTTED_PINK_LILLIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.PURPLE_LILLIES.getId(),
                    GardenaganzaBlocks.POTTED_PURPLE_LILLIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.MIXED_LILLIES.getId(),
                    GardenaganzaBlocks.POTTED_MIXED_LILLIES);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.SUNRISE_PANSIES.getId(),
                    GardenaganzaBlocks.POTTED_SUNRISE_PANSIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.WHITE_PURPLE_PANSIES.getId(),
                    GardenaganzaBlocks.POTTED_WHITE_PURPLE_PANSIES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.VIOLA_TRICOLOUR_PANSIES.getId(),
                    GardenaganzaBlocks.POTTED_VIOLA_TRICOLOUR_PANSIES);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.RED_MARIGOLDS.getId(),
                    GardenaganzaBlocks.POTTED_RED_MARIGOLDS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.ORANGE_MARIGOLDS.getId(),
                    GardenaganzaBlocks.POTTED_ORANGE_MARIGOLDS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(GardenaganzaBlocks.YELLOW_MARIGOLDS.getId(),
                    GardenaganzaBlocks.POTTED_YELLOW_MARIGOLDS);

        });
    }
}
