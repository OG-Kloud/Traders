package net.kloudspace.trades.item.itemclasses;

import net.kloudspace.trades.util.Reference;
import net.minecraft.item.Item;

public class ItemCoin2 extends Item {
	
	public ItemCoin2()
    {
        super();
        this.setUnlocalizedName("kloud.coiniron");
        setTextureName(Reference.MODID + ":" + "iron");
    }

}