package fr.atesab.xray;


import net.minecraft.block.BlockState;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

@FunctionalInterface
public interface SideRenderer {
	public void shouldSideBeRendered(BlockState adjacentState, BlockView blockState, BlockPos blockAccess, Direction pos,
									 CallbackInfo<Boolean> ci);
}
