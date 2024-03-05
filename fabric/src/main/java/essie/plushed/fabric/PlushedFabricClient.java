package essie.plushed.fabric;

import essie.plushed.Plushed;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class PlushedFabricClient implements ClientModInitializer {
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Plushed.STINKY_BOTTLE_BOY_PLUSH_BLOCK.get(), RenderType.cutout());
    }
}
