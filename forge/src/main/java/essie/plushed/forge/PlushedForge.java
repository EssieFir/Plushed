package essie.plushed.forge;

import dev.architectury.platform.forge.EventBuses;
import essie.plushed.Plushed;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Plushed.MOD_ID)
public class PlushedForge {
    public PlushedForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Plushed.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            Plushed.init();
    }
}