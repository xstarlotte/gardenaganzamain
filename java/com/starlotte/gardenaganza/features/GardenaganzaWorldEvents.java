package com.starlotte.gardenaganza.features;

import com.starlotte.gardenaganza.Gardenaganza;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gardenaganza.MOD_ID)
public class GardenaganzaWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        GardenaganzaFlowerGeneration.generateFlowers(event);
    }
}
