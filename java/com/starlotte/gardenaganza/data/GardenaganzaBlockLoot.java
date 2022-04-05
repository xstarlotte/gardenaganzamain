package com.starlotte.gardenaganza.data;

import com.starlotte.gardenaganza.GardenaganzaBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.registries.RegistryObject;

public class GardenaganzaBlockLoot extends BlockLoot {

    @Override
    protected void addTables() {

    this.dropSelf(GardenaganzaBlocks.YELLOW_DAFFODILS.get());
    this.dropSelf(GardenaganzaBlocks.PINK_DAFFODILS.get());
    this.dropSelf(GardenaganzaBlocks.MIXED_DAFFODILS.get());

    this.dropSelf(GardenaganzaBlocks.WHITE_AFRICAN_DAISIES.get());
    this.dropSelf(GardenaganzaBlocks.PINK_AFRICAN_DAISIES.get());
    this.dropSelf(GardenaganzaBlocks.ORANGE_AFRICAN_DAISIES.get());

    this.dropSelf(GardenaganzaBlocks.PINK_PEONIES.get());
    this.dropSelf(GardenaganzaBlocks.MIXED_PEONIES.get());
    this.dropSelf(GardenaganzaBlocks.WHITE_CAPPED_PEONIES.get());

    this.dropSelf(GardenaganzaBlocks.PINK_COSMOS.get());
    this.dropSelf(GardenaganzaBlocks.RED_COSMOS.get());
    this.dropSelf(GardenaganzaBlocks.MIXED_COSMOS.get());

    this.dropSelf(GardenaganzaBlocks.PINK_LILLIES.get());
    this.dropSelf(GardenaganzaBlocks.PURPLE_LILLIES.get());
    this.dropSelf(GardenaganzaBlocks.MIXED_LILLIES.get());

    this.dropSelf(GardenaganzaBlocks.SUNRISE_PANSIES.get());
    this.dropSelf(GardenaganzaBlocks.WHITE_PURPLE_PANSIES.get());
    this.dropSelf(GardenaganzaBlocks.VIOLA_TRICOLOUR_PANSIES.get());

    this.dropSelf(GardenaganzaBlocks.RED_MARIGOLDS.get());
    this.dropSelf(GardenaganzaBlocks.ORANGE_MARIGOLDS.get());
    this.dropSelf(GardenaganzaBlocks.YELLOW_MARIGOLDS.get());

        this.dropPottedContents(GardenaganzaBlocks.POTTED_YELLOW_DAFFODILS.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_PINK_DAFFODILS.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_MIXED_DAFFODILS.get());

        this.dropPottedContents(GardenaganzaBlocks.POTTED_PINK_PEONIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_MIXED_PEONIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_WHITE_CAPPED_PEONIES.get());

        this.dropPottedContents(GardenaganzaBlocks.POTTED_WHITE_AFRICAN_DAISIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_PINK_AFRICAN_DAISIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_ORANGE_AFRICAN_DAISIES.get());

        this.dropPottedContents(GardenaganzaBlocks.POTTED_PINK_COSMOS.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_RED_COSMOS.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_MIXED_COSMOS.get());

        this.dropPottedContents(GardenaganzaBlocks.POTTED_PINK_LILLIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_PURPLE_LILLIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_MIXED_LILLIES.get());

        this.dropPottedContents(GardenaganzaBlocks.POTTED_SUNRISE_PANSIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_WHITE_PURPLE_PANSIES.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_VIOLA_TRICOLOUR_PANSIES.get());

        this.dropPottedContents(GardenaganzaBlocks.POTTED_RED_MARIGOLDS.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_ORANGE_MARIGOLDS.get());
        this.dropPottedContents(GardenaganzaBlocks.POTTED_YELLOW_MARIGOLDS.get());




    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GardenaganzaBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    public void dropPottedContents(Block p_124253_) {
        this.add(p_124253_, (p_176061_) -> {
            return createPotFlowerItemTable(((FlowerPotBlock)p_176061_).getContent());
        });
    }

}
