package net.pokefood.procedures;

import net.pokefood.init.PokefoodModItems;
import net.pokefood.init.PokefoodModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

public class PotBlackTeaCookedDestroyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), PokefoodModBlocks.BLACK_TEA.get().defaultBlockState(), 3);
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PokefoodModItems.BURNT_BAG.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}