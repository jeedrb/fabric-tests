package jeed.swag.test;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Each line (pair) adds a block!!!!!
    public static final Block SWAG_BLOCK = registerBlock("swag_block", 
        new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.SWAG);

    // Block Registering
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(JeedSwag.MOD_ID, name), block);
    }
    
    // BlockItem Registering
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(JeedSwag.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    // Do Something
    public static void registerModBlocks() {
        JeedSwag.LOGGER.info("Registering blocks for " + JeedSwag.MOD_ID);
    }
}
