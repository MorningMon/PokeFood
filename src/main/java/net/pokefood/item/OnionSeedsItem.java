
package net.pokefood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OnionSeedsItem extends Item {
	public OnionSeedsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
