package fr.atesab.xray.mixins;

import fr.atesab.xray.XrayMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Block.class)
public abstract class MixinBlock {
	/*@Shadow protected abstract Block asBlock();

	@Inject(at = @At("RETURN"), method = "shouldDrawSide", cancellable = true)
	private static void shouldDrawSide(BlockState state, BlockState otherState, Direction side, CallbackInfoReturnable<Boolean> cir) {
		XrayMain.getMod().shouldSideBeRendered(state, MinecraftClient.getInstance().world, null, side, cir);
	}

	private MixinBlock() {
	}*/
}