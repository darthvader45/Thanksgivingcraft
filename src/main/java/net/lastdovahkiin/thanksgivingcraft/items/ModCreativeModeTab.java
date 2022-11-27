package net.lastdovahkiin.thanksgivingcraft.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static CreativeModeTab THANKSGIVING_TAB = new CreativeModeTab("thanksgivingcrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COOKED_TURKEY.get());
        }
    };
}
