package net.lastdovahkiin.thanksgivingcraft;

import com.mojang.logging.LogUtils;
import net.lastdovahkiin.thanksgivingcraft.block.ModBlocks;
import net.lastdovahkiin.thanksgivingcraft.items.ModItems;
import net.lastdovahkiin.thanksgivingcraft.world.feature.ModConfiguredFeatures;
import net.lastdovahkiin.thanksgivingcraft.world.feature.ModPlacedFeatures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Thanksgivingcraft.MOD_ID)
public class Thanksgivingcraft
{
    public static final String MOD_ID = "thanksgivingcraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Thanksgivingcraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntityTypes.ENTITIES.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    @Mod.EventBusSubscriber(modid=MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SuppressWarnings("removal")
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRANBERRY_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEPPER_CROP.get(), RenderType.cutout());
        }
    }

}
