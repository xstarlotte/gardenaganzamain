package com.starlotte.gardenaganza.itemgroups;

import com.starlotte.gardenaganza.GardenaganzaBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GardenaganzaItemGroups {

        public static final CreativeModeTab GARDENAGANZA_FLOWERS = new CreativeModeTab("gardenaganza_flowers") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(GardenaganzaBlocks.MIXED_PEONIES.get());
            }
        };

}
