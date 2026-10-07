package widder.playtimetracker;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import widder.playtimetracker.command.CommandRegistration;

public class PlayTimeTracker implements ModInitializer {
	public static final String MOD_ID = "playtimetracker";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Start Initialize PlayTimeTracker Mod");

		CommandRegistration.Registration();


		//LOGGER.info("Hello Fabric world!");
	}
}