package net.lastdovahkiin.thanksgivingcraft.events;

import net.lastdovahkiin.thanksgivingcraft.Thanksgivingcraft;
import net.lastdovahkiin.thanksgivingcraft.entity.ModEntityTypes;
import net.lastdovahkiin.thanksgivingcraft.entity.custom.EntityTurkey;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Thanksgivingcraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents
{
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event)
    {
    event.put(ModEntityTypes.TURKEY.get(), EntityTurkey.getTurkeyAttributes().build());
    }
}
