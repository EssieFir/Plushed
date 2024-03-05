package essie.plushed;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import essie.plushed.blocks.CuddlyBlockEntity;
import essie.plushed.blocks.cuddlyblocks.CuddlyBearBlock;
import essie.plushed.blocks.cuddlyblocks.CuddlyFoxBlock;
import essie.plushed.blocks.cuddlyblocks.CuddlyOctoBlock;
import essie.plushed.blocks.cuddlyblocks.CuddlyStinkyBottleBoyBlock;
import essie.plushed.mixinreplacement.AllayEventListener;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class Plushed
{
	public static final String MOD_ID = "plushed";
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(MOD_ID, Registry.BLOCK_ENTITY_TYPE_REGISTRY);

	public static final RegistrySupplier<Block> FOX_PLUSH_BLOCK = BLOCKS.register("fox_plush", () ->
			new CuddlyFoxBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
					.strength(0.5F, 0.1F)
					.sound(SoundType.WOOL)
					.noOcclusion()));

	public static final RegistrySupplier<Block> STINKY_BOTTLE_BOY_PLUSH_BLOCK = BLOCKS.register("stinky_bottle_boy_plush", () ->
			new CuddlyStinkyBottleBoyBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
					.strength(0.5F, 0.1F)
					.sound(SoundType.WOOL)
					.noOcclusion()));

	public static final RegistrySupplier<Block> OCTO_PLUSH_BLUE_BLOCK = BLOCKS.register("octo_plush_blue", () ->
			new CuddlyOctoBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
					.strength(0.5F, 0.1F)
					.sound(SoundType.WOOL)
					.noOcclusion()));

	public static final RegistrySupplier<Block> OCTO_PLUSH_PINK_BLOCK = BLOCKS.register("octo_plush_pink", () ->
			new CuddlyOctoBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
					.strength(0.5F, 0.1F)
					.sound(SoundType.WOOL)
					.noOcclusion()));

	public static final RegistrySupplier<Block> SOFT_BEAR_BLOCK = BLOCKS.register("toy_bear", () ->
			new CuddlyBearBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
					.strength(0.5F, 0.1F)
					.sound(SoundType.WOOL)
					.noOcclusion()));

	public static final RegistrySupplier<Item> SOFT_BEAR_ITEM = ITEMS.register("toy_bear", () -> new CuddlyItem(SOFT_BEAR_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistrySupplier<Item> FOX_PLUSH_ITEM = ITEMS.register("fox_plush", () -> new CuddlyItem(FOX_PLUSH_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistrySupplier<Item> STINKY_BOTTLE_BOY_PLUSH_ITEM = ITEMS.register("stinky_bottle_boy_plush", () -> new CuddlyItem(STINKY_BOTTLE_BOY_PLUSH_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistrySupplier<Item> OCTO_PLUSH_BLUE_ITEM = ITEMS.register("octo_plush_blue", () -> new CuddlyOctoItem(OCTO_PLUSH_BLUE_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));
	public static final RegistrySupplier<Item> OCTO_PLUSH_PINK_ITEM = ITEMS.register("octo_plush_pink", () -> new CuddlyOctoItem(OCTO_PLUSH_PINK_BLOCK.get(), new Item.Properties().stacksTo(1).tab(CreativeTab.PLUSHED_ITEMS_TAB), null));

	public static final RegistrySupplier<BlockEntityType<CuddlyBlockEntity>> CUDDLY_BLOCK_ENTITY = BLOCK_ENTITIES.register("cuddly_block_entity", () ->
			BlockEntityType.Builder.of(CuddlyBlockEntity::new,
					SOFT_BEAR_BLOCK.get(), OCTO_PLUSH_PINK_BLOCK.get(), OCTO_PLUSH_BLUE_BLOCK.get(),STINKY_BOTTLE_BOY_PLUSH_BLOCK.get(),FOX_PLUSH_BLOCK.get()).build(null));

	public static void init() {
		BLOCKS.register();
		BLOCK_ENTITIES.register();

		

		ITEMS.register();

		AllayEventListener.onEntityInteract();
	}
}
