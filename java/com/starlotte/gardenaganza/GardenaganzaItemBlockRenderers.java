package com.starlotte.gardenaganza;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Gardenaganza.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GardenaganzaItemBlockRenderers {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.YELLOW_DAFFODILS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.PINK_DAFFODILS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.MIXED_DAFFODILS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.PINK_PEONIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.WHITE_CAPPED_PEONIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.MIXED_PEONIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.ORANGE_AFRICAN_DAISIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.PINK_AFRICAN_DAISIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.WHITE_AFRICAN_DAISIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.PINK_COSMOS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.RED_COSMOS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.MIXED_COSMOS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.PINK_LILLIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.PURPLE_LILLIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.MIXED_LILLIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.SUNRISE_PANSIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.WHITE_PURPLE_PANSIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.VIOLA_TRICOLOUR_PANSIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.RED_MARIGOLDS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.ORANGE_MARIGOLDS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.YELLOW_MARIGOLDS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_YELLOW_DAFFODILS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_PINK_DAFFODILS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_MIXED_DAFFODILS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_PINK_PEONIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_WHITE_CAPPED_PEONIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_MIXED_PEONIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_ORANGE_AFRICAN_DAISIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_PINK_AFRICAN_DAISIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_WHITE_AFRICAN_DAISIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_PINK_COSMOS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_RED_COSMOS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_MIXED_COSMOS.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_PINK_LILLIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_PURPLE_LILLIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_MIXED_LILLIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_SUNRISE_PANSIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_WHITE_PURPLE_PANSIES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_VIOLA_TRICOLOUR_PANSIES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_RED_MARIGOLDS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_ORANGE_MARIGOLDS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GardenaganzaBlocks.POTTED_YELLOW_MARIGOLDS.get(), RenderType.cutout());
    }
}
