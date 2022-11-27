package net.lastdovahkiin.thanksgivingcraft.block;

import net.lastdovahkiin.thanksgivingcraft.items.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class SweetPotatoCropBlock extends CropBlock {
    public static IntegerProperty AGE = IntegerProperty.create("age", 0, 8);

    public SweetPotatoCropBlock(Properties properties)
    {
        super(properties);
    }



    @Override
    protected ItemLike getBaseSeedId()
    {
        return ModItems.SWEET_POTATO.get();
    }

    public IntegerProperty getAgeProperty()
    {
        return AGE;
    }

    public int getMaxAge()
    {
        return 8;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(AGE);
    }
}
