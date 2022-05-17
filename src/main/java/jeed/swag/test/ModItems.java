package jeed.swag.test;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Each line (pair) adds an item!!!!!
    public static final Item SWAG_ITEM = registerItem("swag_item", 
        new Item(new FabricItemSettings().group(ModItemGroup.SWAG)));

    // Item Registering
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JeedSwag.MOD_ID, name), item);
    }

    // Do Something
    public static void registerModItems() {
        JeedSwag.LOGGER.info("registering items for " + JeedSwag.MOD_ID);
    }
}
