package net.pokefood.block.entity;

import net.pokefood.init.PokefoodModBlockEntities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

public class LemonStage1BlockEntity extends BlockEntity {
	public LemonStage1BlockEntity(BlockPos pos, BlockState state) {
		super(PokefoodModBlockEntities.LEMON_STAGE_1.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
