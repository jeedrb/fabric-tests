package jeed.swag.test;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
// import jeed.swag.test.JeedSwag;
// import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SWAG = FabricItemGroupBuilder.build(
        new Identifier("swag", "main"),
        () -> new ItemStack(Items.GOLD_INGOT));
    
}