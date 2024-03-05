package essie.plushed;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
	public static final CreativeModeTab PLUSHED_ITEMS_TAB = new CreativeModeTab(10, "plushed.items_tab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Plushed.FOX_PLUSH_ITEM.get());
		}
	};
}
