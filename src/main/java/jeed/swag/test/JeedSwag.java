package jeed.swag.test;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
// import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;
//import java.rmi.registry.Registry;

public class JeedSwag implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("jeedswag");

	//public static final Item SWEATY_BALLS = new Item(new Item.Settings().group(ItemGroup.REDSTONE));
	public static final Block SWAG_BLOCK = new Block(FabricBlockSettings.of(Material.SPONGE).strength(0.1f));

	@Override
	public void onInitialize() {
		//Registry.register(Registry.ITEM, new Identifier("jeedswag", "sweaty_balls"), SWEATY_BALLS);
		Registry.register(Registry.BLOCK, new Identifier("jeedswag", "swag_block"), SWAG_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("jeedswag", "swag_block"), new BlockItem(SWAG_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
