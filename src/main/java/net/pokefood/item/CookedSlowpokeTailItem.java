
package net.pokefood.item;

import net.pokefood.procedures.CookingUnlockAdvProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.Entity;

public class CookedSlowpokeTailItem extends Item {
	public CookedSlowpokeTailItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(1.5f).meat().build()));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CookingUnlockAdvProcedure.execute(entity);
	}
}
