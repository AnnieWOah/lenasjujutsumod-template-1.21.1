package net.lena.jujutsumod;

import net.fabricmc.api.ModInitializer;

import net.lena.jujutsumod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JujutsuMod implements ModInitializer {
	public static final String MOD_ID = "jujutsu-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems(); // mod items class will be called whenever the mod is initialized
	}
}