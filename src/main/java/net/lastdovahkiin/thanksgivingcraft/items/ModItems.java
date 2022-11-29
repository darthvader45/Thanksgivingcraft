package net.lastdovahkiin.thanksgivingcraft.items;

import net.lastdovahkiin.thanksgivingcraft.Thanksgivingcraft;
import net.lastdovahkiin.thanksgivingcraft.block.ModBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Thanksgivingcraft.MOD_ID);

    //Food
    public static final RegistryObject<Item> RAW_TURKEY = ITEMS.register("raw_turkey", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().meat().nutrition(2).saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 30, 1), 0.3f).build())));
    public static final RegistryObject<Item> GIBLETS = ITEMS.register("giblets", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().meat().nutrition(1).saturationMod(0.9f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 30, 1), 0.3f).build())));
    public static final RegistryObject<Item> CLEANED_TURKEY = ITEMS.register("cleaned_turkey", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().meat().nutrition(2).saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 30, 1), 0.3f).build())));
    public static final RegistryObject<Item> COOKED_TURKEY = ITEMS.register("cooked_turkey", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(7.2f).build())));
    public static final RegistryObject<Item> SEASONED_TURKEY = ITEMS.register("seasoned_turkey", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 30, 1), 0.3f).build())));
    public static final RegistryObject<Item> STUFFED_TURKEY = ITEMS.register("stuffed_turkey", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 30, 1), 0.3f).build())));
    public static final RegistryObject<Item> RAW_STEW = ITEMS.register("raw_stew", () -> new Item(new Item.Properties().craftRemainder(Items.BOWL).tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> COOKED_STEW = ITEMS.register("cooked_stew", () -> new BowlFoodItem(new Item.Properties().craftRemainder(Items.BOWL).tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(1.0f).build())));
    public static final RegistryObject<Item> SLICED_TURKEY = ITEMS.register("sliced_turkey", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().meat().nutrition(3).saturationMod(0.9f).build())));
    public static final RegistryObject<Item> CHOPPED_PORK = ITEMS.register("chopped_pork", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().meat().nutrition((int) 1.5).saturationMod(1.8f).build()).tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> CUBED_BREAD = ITEMS.register("cubed_bread", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition((int) 2.5).saturationMod(5.0f).build()).tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().craftRemainder(Items.BUCKET).food(new FoodProperties.Builder().nutrition((int) 1.5).saturationMod(1.8f).build()).tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> STUFFING = ITEMS.register("stuffing", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(1).saturationMod(3.6f).build())));
    public static final RegistryObject<Item> CRANBERRY_BOWL = ITEMS.register("cranberry_bowl", () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(5).saturationMod(1.0f).build())));
    public static final RegistryObject<Item> CRANBERRY_SAUCE = ITEMS.register("cranberry_sauce", () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.9f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 30, 1 ), 1.0f).build())));
    public static final RegistryObject<Item> BUCKET_POTATOES = ITEMS.register("bucket_potatoes", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> BOILED_POTATOES = ITEMS.register("boiled_potatoes", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> MASHED_POTATOES = ITEMS.register("mashed_potatoes", () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> BUCKET_SWEET_POTATOES = ITEMS.register("bucket_sweet_potatoes", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> BOILED_SWEET_POTATOES = ITEMS.register("boiled_sweet_potatoes", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> MASHED_SWEET_POTATOES = ITEMS.register("mashed_sweet_potatoes", () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));

    //Crop Items
    public static final RegistryObject<Item> PEPPERCORNS = ITEMS.register("peppercorns", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> CRANBERRIES = ITEMS.register("cranberries", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2.4f).build())));
    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register("sweet_potato", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB).food(new FoodProperties.Builder().nutrition((int) 0.5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> CRANBERRY_SEEDS = ITEMS.register("cranberry_seeds", () -> new ItemNameBlockItem(ModBlocks.CRANBERRY_CROP.get(),new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds", () -> new ItemNameBlockItem(ModBlocks.PEPPER_CROP.get(),new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> GROUND_PEPPER = ITEMS.register("ground_pepper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));


    //Mineral Items
    public static final RegistryObject<Item> ROCK_SALT = ITEMS.register("rock_salt", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> TABLE_SALT = ITEMS.register("table_salt", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> PILGRIM_HAT = ITEMS.register("pilgrim_hat", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<ArmorItem> PILGRIM_SHIRT = ITEMS.register("pilgrim_shirt", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<ArmorItem> PILGRIM_PANTS = ITEMS.register("pilgrim_pants", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<ArmorItem> PILGRIM_BOOTS = ITEMS.register("pilgrim_boots", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<ArmorItem> NATIVE_FEATHER = ITEMS.register("native_feather", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<ArmorItem> NATIVE_VEST = ITEMS.register("native_vest", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<ArmorItem> NATIVE_PANTS = ITEMS.register("native_pants", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<ArmorItem> NATIVE_MOCCASINS = ITEMS.register("native_moccasins", () -> new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));

    //Tools
    public static final RegistryObject<Item> SALT_SHAKER = ITEMS.register("salt_shaker", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> PEPPER_SHAKER = ITEMS.register("pepper_shaker", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> CARVING_TOOLS = ITEMS.register("carving_tools", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<SwordItem> CARVING_KNIFE = ITEMS.register("carving_knife", () -> new SwordItem(Tiers.IRON, 6,1.6f,new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> MORTAR_PESTLE = ITEMS.register("mortar_pestle", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> MASHER = ITEMS.register("masher", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));

    //Misc
    public static final RegistryObject<Item> WISHBONE = ITEMS.register("wishbone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));
    public static final RegistryObject<Item> TURKEY_BONES = ITEMS.register("cooked_thanksgiving_turkey", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THANKSGIVING_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
