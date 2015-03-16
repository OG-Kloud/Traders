package net.kloudspace.trades.item.itemclasses;

import net.kloudspace.trades.util.Reference;
import net.minecraft.item.Item;

public class ItemCoin4 extends Item {
	
	public ItemCoin4()
    {
        super();
        this.setUnlocalizedName("kloud.coinsilver");
        setTextureName(Reference.MODID + ":" + "silver");
    }

}
