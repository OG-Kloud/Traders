package net.kloudspace.trades.item.itemclasses;

import net.kloudspace.trades.util.Reference;
import net.minecraft.item.Item;

public class ItemCoin5 extends Item {
	
	public ItemCoin5()
    {
        super();
        this.setUnlocalizedName("kloud.coinplatinum");
        setTextureName(Reference.MODID + ":" + "platinum");
    }

}
