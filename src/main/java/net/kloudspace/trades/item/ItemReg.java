package net.kloudspace.trades.item;

import net.kloudspace.trades.item.itemclasses.ItemCoin;
import net.kloudspace.trades.item.itemclasses.ItemCoin2;
import net.kloudspace.trades.item.itemclasses.ItemCoin3;
import net.kloudspace.trades.item.itemclasses.ItemCoin4;
import net.kloudspace.trades.item.itemclasses.ItemCoin5;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	
	public static Item itemCoin;
	public static Item itemCoin2;
	public static Item itemCoin3;
	public static Item itemCoin4;
	public static Item itemCoin5;
	
	public static void init() {
		itemCoin = new ItemCoin();
		itemCoin2 = new ItemCoin2();
		itemCoin3 = new ItemCoin3();
		itemCoin4 = new ItemCoin4();
		itemCoin5 = new ItemCoin5();
		GameRegistry.registerItem(itemCoin, itemCoin.getUnlocalizedName());
		GameRegistry.registerItem(itemCoin2, itemCoin2.getUnlocalizedName());
		GameRegistry.registerItem(itemCoin3, itemCoin3.getUnlocalizedName());
		GameRegistry.registerItem(itemCoin4, itemCoin4.getUnlocalizedName());
		GameRegistry.registerItem(itemCoin5, itemCoin5.getUnlocalizedName());

		OreDictionary.registerOre("coinCopper", new ItemStack(itemCoin, 1, 0));
		OreDictionary.registerOre("coinIron", new ItemStack(itemCoin2, 1, 0));
		OreDictionary.registerOre("coinGold", new ItemStack(itemCoin3, 1, 0));
		OreDictionary.registerOre("coinSilver", new ItemStack(itemCoin4, 1, 0));
		OreDictionary.registerOre("coinPlatinum", new ItemStack(itemCoin5, 1, 0));
	}

}
