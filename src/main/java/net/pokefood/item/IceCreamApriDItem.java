
package net.pokefood.item;

import net.pokefood.procedures.IceCreamUnlockAdvProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.Entity;

public class IceCreamApriDItem extends Item {
	public IceCreamApriDItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.75f).alwaysEat().build()));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		IceCreamUnlockAdvProcedure.execute(entity);
	}
}
