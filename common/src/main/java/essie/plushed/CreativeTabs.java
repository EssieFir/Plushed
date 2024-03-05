package essie.plushed;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static essie.plushed.Plushed.MOD_ID;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> PLUSHIES_TAB = TABS.register("plushed.items_tab", () ->
            CreativeTabRegistry.create(
                    Component.translatable("category.plushed.items_tab"),
                    () -> new ItemStack(Plushed.FOX_PLUSH_ITEM.get()))
    );
}
