package essie.plushed.fabric;

import essie.plushed.Plushed;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class PlushedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Plushed.init();
    }
}