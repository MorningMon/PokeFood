
package net.pokefood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OtherbookItem extends Item {
	public OtherbookItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
