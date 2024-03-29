package essie.plushed.mixinreplacement;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.InteractionEvent;
import essie.plushed.CuddlyItem;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.player.Player;

public class AllayEventListener {

	public static void onEntityInteract() {
		InteractionEvent.INTERACT_ENTITY.register((Player player, Entity entity, InteractionHand hand) -> {
			if (entity instanceof Allay && player.getItemInHand(hand).getItem() instanceof CuddlyItem) {
				if (player instanceof LocalPlayer localPlayer) {
					localPlayer.sendSystemMessage(Component.translatable("response.plushed.give_away"));
					return EventResult.interruptTrue();
				}
			}

			return EventResult.pass();
		});
	}
}
