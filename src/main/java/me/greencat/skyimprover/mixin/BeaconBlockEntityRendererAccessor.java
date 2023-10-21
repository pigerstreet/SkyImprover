package me.greencat.skyimprover.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BeaconBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BeaconBlockEntityRenderer.class)
public interface BeaconBlockEntityRendererAccessor {
    @Invoker("renderBeam")
    static void renderBeam(MatrixStack matrices, VertexConsumerProvider vertexConsumers, float tickDelta, long worldTime, int yOffset, int maxY, float[] color) {
        throw new RuntimeException("恭喜你，你的Mixin炸啦！");
    }
}
