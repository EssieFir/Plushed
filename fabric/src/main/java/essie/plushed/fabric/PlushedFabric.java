package essie.plushed.fabric;

import essie.plushed.Plushed;
import net.fabricmc.api.ModInitializer;

public class PlushedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Plushed.init();
    }
}