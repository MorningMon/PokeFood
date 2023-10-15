
package net.pokefood.item;

import net.pokefood.init.PokefoodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CalcuimBoxEmpty5Item extends Item {
	public CalcuimBoxEmpty5Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
