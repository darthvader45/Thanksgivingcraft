package net.lastdovahkiin.thanksgivingcraft.entity;

import net.lastdovahkiin.thanksgivingcraft.Thanksgivingcraft;
import net.lastdovahkiin.thanksgivingcraft.entity.custom.EntityTurkey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes
{
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Thanksgivingcraft.MOD_ID);

    public static final RegistryObject<EntityType<EntityTurkey>> TURKEY = ENTITIES.register("turkey", () -> EntityType.Builder.of(EntityTurkey::new, MobCategory.CREATURE).build(Thanksgivingcraft.MOD_ID + ":turkey"));
}
