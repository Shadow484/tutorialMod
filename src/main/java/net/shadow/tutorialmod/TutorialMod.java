package net.shadow.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.shadow.tutorialmod.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlock();

	}
}
