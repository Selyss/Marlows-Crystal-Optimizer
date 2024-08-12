package selyss.marlowscrystaloptimizer;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarlowsCrystalOptimizer implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("marlows-crystal-optimizer");

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized Marlow's Crystal Optimizer!");
	}
}