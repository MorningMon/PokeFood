
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;
import net.pokefood.init.PokefoodModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

public class CurryDuckFItem extends Item {
	public CurryDuckFItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.9f)

				.meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(PokefoodModItems.PLATE.get());
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
