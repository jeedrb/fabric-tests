package jeed.swag.test;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JeedSwag implements ModInitializer {
	public static final String MOD_ID = "jeedswag";
	public static final Logger LOGGER = LoggerFactory.getLogger("jeedswag");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
