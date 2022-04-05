package com.starlotte.gardenaganza;

import com.starlotte.gardenaganza.itemgroups.GardenaganzaItemGroups;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GardenaganzaBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Gardenaganza.MOD_ID);

//daffodils

    public static final RegistryObject<Block> YELLOW_DAFFODILS = registerBlock("yellow_daffodils",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> PINK_DAFFODILS = registerBlock("pink_daffodils",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> MIXED_DAFFODILS = registerBlock("mixed_daffodils",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);

                    public static final RegistryObject<Block> POTTED_YELLOW_DAFFODILS = BLOCKS.register("potted_yellow_daffodils",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.YELLOW_DAFFODILS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_PINK_DAFFODILS = BLOCKS.register("potted_pink_daffodils",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.PINK_DAFFODILS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_MIXED_DAFFODILS = BLOCKS.register("potted_mixed_daffodils",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.MIXED_DAFFODILS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

//african_daisies

    public static final RegistryObject<Block> WHITE_AFRICAN_DAISIES = registerBlock("white_african_daisies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> PINK_AFRICAN_DAISIES = registerBlock("pink_african_daisies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> ORANGE_AFRICAN_DAISIES = registerBlock("orange_african_daisies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);

                    public static final RegistryObject<Block> POTTED_WHITE_AFRICAN_DAISIES = BLOCKS.register("potted_white_african_daisies",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.WHITE_AFRICAN_DAISIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_PINK_AFRICAN_DAISIES = BLOCKS.register("potted_pink_african_daisies",
                        () -> new FlowerPotBlock(null, GardenaganzaBlocks.PINK_AFRICAN_DAISIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_ORANGE_AFRICAN_DAISIES = BLOCKS.register("potted_orange_african_daisies",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.ORANGE_AFRICAN_DAISIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

//peonies

public static final RegistryObject<Block> PINK_PEONIES = registerBlock("pink_peonies",
        () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> MIXED_PEONIES = registerBlock("mixed_peonies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> WHITE_CAPPED_PEONIES = registerBlock("white_capped_peonies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);

                    public static final RegistryObject<Block> POTTED_PINK_PEONIES = BLOCKS.register("potted_pink_peonies",
                        () -> new FlowerPotBlock(null, GardenaganzaBlocks.PINK_PEONIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_MIXED_PEONIES = BLOCKS.register("potted_mixed_peonies",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.MIXED_PEONIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_WHITE_CAPPED_PEONIES = BLOCKS.register("potted_white_capped_peonies",
                        () -> new FlowerPotBlock(null, GardenaganzaBlocks.WHITE_CAPPED_PEONIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));


     //cosmos
    public static final RegistryObject<Block> PINK_COSMOS = registerBlock("pink_cosmos",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> RED_COSMOS = registerBlock("red_cosmos",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> MIXED_COSMOS = registerBlock("mixed_cosmos",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);

                 public static final RegistryObject<Block> POTTED_PINK_COSMOS = BLOCKS.register("potted_pink_cosmos",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.PINK_COSMOS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                  public static final RegistryObject<Block> POTTED_RED_COSMOS = BLOCKS.register("potted_red_cosmos",
                      () -> new FlowerPotBlock(null, GardenaganzaBlocks.RED_COSMOS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_MIXED_COSMOS = BLOCKS.register("potted_mixed_cosmos",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.MIXED_COSMOS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));


     //lillies
    public static final RegistryObject<Block> PINK_LILLIES = registerBlock("pink_lillies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> PURPLE_LILLIES = registerBlock("purple_lillies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> MIXED_LILLIES = registerBlock("mixed_lillies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);

                public static final RegistryObject<Block> POTTED_PINK_LILLIES = BLOCKS.register("potted_pink_lillies",
                 () -> new FlowerPotBlock(null, GardenaganzaBlocks.PINK_LILLIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_PURPLE_LILLIES = BLOCKS.register("potted_purple_lillies",
                    () -> new FlowerPotBlock(null, GardenaganzaBlocks.PURPLE_LILLIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                 public static final RegistryObject<Block> POTTED_MIXED_LILLIES = BLOCKS.register("potted_mixed_lillies",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.MIXED_LILLIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));


      //pansies
    public static final RegistryObject<Block> SUNRISE_PANSIES = registerBlock("sunrise_pansies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> WHITE_PURPLE_PANSIES = registerBlock("white_purple_pansies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> VIOLA_TRICOLOUR_PANSIES = registerBlock("viola_tricolour_pansies",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);

             public static final RegistryObject<Block> POTTED_SUNRISE_PANSIES = BLOCKS.register("potted_sunrise_pansies",
                 () -> new FlowerPotBlock(null, GardenaganzaBlocks.SUNRISE_PANSIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
             public static final RegistryObject<Block> POTTED_WHITE_PURPLE_PANSIES = BLOCKS.register("potted_white_purple_pansies",
                 () -> new FlowerPotBlock(null, GardenaganzaBlocks.WHITE_PURPLE_PANSIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
             public static final RegistryObject<Block> POTTED_VIOLA_TRICOLOUR_PANSIES = BLOCKS.register("potted_viola_tricolour_pansies",
                    () -> new FlowerPotBlock(null, GardenaganzaBlocks.VIOLA_TRICOLOUR_PANSIES,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));


      //marigolds
    public static final RegistryObject<Block> RED_MARIGOLDS = registerBlock("red_marigolds",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> ORANGE_MARIGOLDS = registerBlock("orange_marigolds",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);
    public static final RegistryObject<Block> YELLOW_MARIGOLDS = registerBlock("yellow_marigolds",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 4,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), GardenaganzaItemGroups.GARDENAGANZA_FLOWERS);

                    public static final RegistryObject<Block> POTTED_RED_MARIGOLDS = BLOCKS.register
                            ("potted_red_marigolds",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.RED_MARIGOLDS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                     public static final RegistryObject<Block> POTTED_ORANGE_MARIGOLDS = BLOCKS.register
                             ("potted_orange_marigolds",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.ORANGE_MARIGOLDS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
                    public static final RegistryObject<Block> POTTED_YELLOW_MARIGOLDS = BLOCKS.register
                            ("potted_yellow_marigolds",
                     () -> new FlowerPotBlock(null, GardenaganzaBlocks.YELLOW_MARIGOLDS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return GardenaganzaItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}