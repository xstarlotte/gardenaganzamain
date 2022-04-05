package com.starlotte.gardenaganza.data;

import com.starlotte.gardenaganza.Gardenaganza;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class GardenaganzaData {

    @Mod.EventBusSubscriber(modid = Gardenaganza.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class DataGenerators {

        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {
            DataGenerator generator = event.getGenerator();
            generator.addProvider(new GardenaganzaLootTableProvider(generator));


        }

    }

}
