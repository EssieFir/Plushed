package essie.plushed.mixin;

import essie.plushed.CuddlyItem;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HumanoidModel.class)
public class HumanoidModelMixin {
    @Shadow
    public @Final ModelPart rightArm;

    @Shadow
    public @Final ModelPart leftArm;

    @Inject(
            method = {"poseRightArm", "poseLeftArm"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/model/AnimationUtils;animateCrossbowHold(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Z)V",
                    shift = At.Shift.AFTER
            ),
            cancellable = true
    )
    public void poseArms(LivingEntity entity, CallbackInfo ci) {
        if(entity.getMainHandItem().getItem() instanceof CuddlyItem || entity.getOffhandItem().getItem() instanceof CuddlyItem) {
            this.rightArm.xRot = -0.95F;
            this.rightArm.yRot = (float) (-Math.PI / 8);
            this.leftArm.xRot = -0.90F;
            this.leftArm.yRot = (float) (Math.PI / 8);
            ci.cancel();
        }
    }
}
