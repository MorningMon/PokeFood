
package net.pokefood.item;

import net.pokefood.init.PokefoodModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class ApriAlcoholDItem extends BucketItem {
	public ApriAlcoholDItem() {
		super(PokefoodModFluids.APRI_ALCOHOL_D, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
