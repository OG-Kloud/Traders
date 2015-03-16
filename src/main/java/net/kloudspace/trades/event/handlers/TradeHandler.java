package net.kloudspace.trades.event.handlers;
import static net.kloudspace.trades.util.Stacks.*;
import static net.kloudspace.trades.util.Stacks.apples;
import static net.kloudspace.trades.util.Stacks.arrows;
import static net.kloudspace.trades.util.Stacks.beefs;
import static net.kloudspace.trades.util.Stacks.bookshelf;
import static net.kloudspace.trades.util.Stacks.bread;
import static net.kloudspace.trades.util.Stacks.cake;
import static net.kloudspace.trades.util.Stacks.carrot;
import static net.kloudspace.trades.util.Stacks.chainBoots;
import static net.kloudspace.trades.util.Stacks.chainChest;
import static net.kloudspace.trades.util.Stacks.chainHelm;
import static net.kloudspace.trades.util.Stacks.chainLegs;
import static net.kloudspace.trades.util.Stacks.chicken;
import static net.kloudspace.trades.util.Stacks.coal;
import static net.kloudspace.trades.util.Stacks.cookedChicken;
import static net.kloudspace.trades.util.Stacks.cookedFish;
import static net.kloudspace.trades.util.Stacks.cookedPorkchops;
import static net.kloudspace.trades.util.Stacks.cookies;
import static net.kloudspace.trades.util.Stacks.diamondAxe;
import static net.kloudspace.trades.util.Stacks.diamondChest;
import static net.kloudspace.trades.util.Stacks.diamondPick;
import static net.kloudspace.trades.util.Stacks.diamonds;
import static net.kloudspace.trades.util.Stacks.ender;
import static net.kloudspace.trades.util.Stacks.fish;
import static net.kloudspace.trades.util.Stacks.flint;
import static net.kloudspace.trades.util.Stacks.gold;
import static net.kloudspace.trades.util.Stacks.gravel;
import static net.kloudspace.trades.util.Stacks.gunpowder;
import static net.kloudspace.trades.util.Stacks.iron;
import static net.kloudspace.trades.util.Stacks.ironAxe;
import static net.kloudspace.trades.util.Stacks.ironChest;
import static net.kloudspace.trades.util.Stacks.ironHelm;
import static net.kloudspace.trades.util.Stacks.ironPick;
import static net.kloudspace.trades.util.Stacks.ironSpade;
import static net.kloudspace.trades.util.Stacks.ironSword;
import static net.kloudspace.trades.util.Stacks.leather;
import static net.kloudspace.trades.util.Stacks.leatherLegs;
import static net.kloudspace.trades.util.Stacks.melon;
import static net.kloudspace.trades.util.Stacks.neatherStar;
import static net.kloudspace.trades.util.Stacks.papers;
import static net.kloudspace.trades.util.Stacks.porkchops;
import static net.kloudspace.trades.util.Stacks.potatoes;
import static net.kloudspace.trades.util.Stacks.pumpkinpie;
import static net.kloudspace.trades.util.Stacks.pumpkins;
import static net.kloudspace.trades.util.Stacks.rottenFlesh;
import static net.kloudspace.trades.util.Stacks.shears;
import static net.kloudspace.trades.util.Stacks.spiderEyes;
import static net.kloudspace.trades.util.Stacks.string;
import static net.kloudspace.trades.util.Stacks.t;
import static net.kloudspace.trades.util.Stacks.wheats;
import static net.kloudspace.trades.util.Stacks.witherBone;
import static net.kloudspace.trades.util.Stacks.witherSkull;

import java.util.Random;

import net.kloudspace.trades.util.CostToItemStack;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class TradeHandler {// implements IVillageTradeHandler {
	/*

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
//		int flint = 4 + random.nextInt(6);
		int glasspane = 3 + random.nextInt(7);
//		int coal = 16 + random.nextInt(8);
//		int iron = 7 + random.nextInt(3);
//		int diamond = 3 + random.nextInt(1);
		CostToItemStack CTIS = new CostToItemStack();
		
		switch(villager.getProfession()) {
		case 6: // FARMER
			recipeList.add(new MerchantRecipe(wheats, CTIS.getPrice(20)));
			recipeList.add(new MerchantRecipe(potatoes, CTIS.getPrice(16)));
			recipeList.add(new MerchantRecipe(carrot, CTIS.getPrice(16)));
			recipeList.add(new MerchantRecipe(pumpkins, CTIS.getPrice(32)));
			recipeList.add(new MerchantRecipe(melon, CTIS.getPrice(64)));
			recipeList.add(new MerchantRecipe(beefs, CTIS.getPrice(16)));
			recipeList.add(new MerchantRecipe(chicken, CTIS.getPrice(16)));
			recipeList.add(new MerchantRecipe(porkchops, CTIS.getPrice(16)));
			recipeList.add(new MerchantRecipe(CTIS.getCost(128), CTIS.getsecondCost(128),bread));
			recipeList.add(new MerchantRecipe(CTIS.getCost(100), CTIS.getsecondCost(100), pumpkinpie));
			recipeList.add(new MerchantRecipe(CTIS.getCost(100), CTIS.getsecondCost(100), apples));
			recipeList.add(new MerchantRecipe(CTIS.getCost(16), carrot));
			recipeList.add(new MerchantRecipe(CTIS.getCost(22), melonslices));
			recipeList.add(new MerchantRecipe(CTIS.getCost(78), CTIS.getsecondCost(78), cookies));
			recipeList.add(new MerchantRecipe(CTIS.getCost(220), CTIS.getsecondCost(220), cake));
			recipeList.add(new MerchantRecipe(beefs , CTIS.getCost(120), cookedBeef));
			recipeList.add(new MerchantRecipe(porkchops, CTIS.getCost(120), cookedPorkchops));
			recipeList.add(new MerchantRecipe(chicken, CTIS.getCost(120), cookedChicken));
			recipeList.add(new MerchantRecipe(pumpkins, CTIS.getCost(64), pumpkinpie));
			recipeList.add(new MerchantRecipe(wheats, CTIS.getCost(80), bread));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.bowl), CTIS.getCost(30), mushroomStew));
			
			break;
		case 7: // LIBRARIAN
			int k;
			Enchantment ench = Enchantment.enchantmentsBookList[random.nextInt(Enchantment.enchantmentsBookList.length)];
			int i1 = MathHelper.getRandomIntegerInRange(random, ench.getMinLevel(), ench.getMaxLevel());
			ItemStack itemstack = Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(ench, i1));
			k = 2 + random.nextInt(5 + i1 * 10) + 3 * i1;
			
			recipeList.add(new MerchantRecipe(papers, CTIS.getPrice(100)));
			recipeList.add(new MerchantRecipe(CTIS.getCost(230), books));
			recipeList.add(new MerchantRecipe(CTIS.getCost(600), CTIS.getsecondCost(600), compass));
			recipeList.add(new MerchantRecipe(CTIS.getCost(550), CTIS.getsecondCost(550), clock));
			recipeList.add(new MerchantRecipe(CTIS.getCost(200), CTIS.getsecondCost(200), expBottle));
			recipeList.add(new MerchantRecipe(books, CTIS.getCost(600), itemstack));
			recipeList.add(new MerchantRecipe(CTIS.getCost(145), CTIS.getsecondCost(145),bookshelf));
			recipeList.add(new MerchantRecipe(CTIS.getCost(80), CTIS.getsecondCost(80), new ItemStack(Blocks.glass_pane,glasspane, random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(2000), CTIS.getsecondCost(2000), new ItemStack(Items.name_tag,1,0)));
			break;
		case 8: // PRIEST
			recipeList.add(new MerchantRecipe(rottenFlesh, CTIS.getPrice(200)));
			recipeList.add(new MerchantRecipe(CTIS.getCost(140), redstone));
			recipeList.add(new MerchantRecipe(CTIS.getCost(400), CTIS.getsecondCost(400), enderEye));
			recipeList.add(new MerchantRecipe(CTIS.getCost(70), CTIS.getsecondCost(70), glowstonedust));
			recipeList.add(new MerchantRecipe(CTIS.getCost(4500),CTIS.getsecondCost(4500),diamonds));
			recipeList.add(new MerchantRecipe(CTIS.getCost(2500), CTIS.getsecondCost(2500),iron));
			recipeList.add(new MerchantRecipe(CTIS.getCost(3500), CTIS.getsecondCost(3500), gold));
			recipeList.add(new MerchantRecipe(CTIS.getCost(4000), CTIS.getsecondCost(4000),emeralds));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1900), CTIS.getsecondCost(1900), coal));
			recipeList.add(new MerchantRecipe(CTIS.getCost(200), CTIS.getsecondCost(200), sticks));
			recipeList.add(new MerchantRecipe(CTIS.getCost(14000), CTIS.getsecondCost(14000), neatherStar));
			recipeList.add(new MerchantRecipe(CTIS.getCost(64), flint));
			
			break;
		case 9: // BLACKSMITH
			recipeList.add(new MerchantRecipe(coal, CTIS.getPrice(30)));
			recipeList.add(new MerchantRecipe(iron, CTIS.getPrice(500)));
			recipeList.add(new MerchantRecipe(diamonds, CTIS.getPrice(5000)));
			recipeList.add(new MerchantRecipe(CTIS.getCost(2000), CTIS.getsecondCost(2000), ironHelm));
			recipeList.add(new MerchantRecipe(CTIS.getCost(3500), CTIS.getsecondCost(3500), ironChest));
			recipeList.add(new MerchantRecipe(CTIS.getCost(10000), CTIS.getsecondCost(10000),EnchantmentHelper.addRandomEnchantment(random, diamondChest, 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1200), CTIS.getsecondCost(1200), chainBoots));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1800), CTIS.getsecondCost(1800), chainChest));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1000), CTIS.getsecondCost(1000), chainHelm));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1300), CTIS.getsecondCost(1300), chainLegs));
			recipeList.add(new MerchantRecipe(CTIS.getCost(700), CTIS.getsecondCost(700), ironAxe));
			recipeList.add(new MerchantRecipe(CTIS.getCost(2000), CTIS.getsecondCost(2000),EnchantmentHelper.addRandomEnchantment(random, ironSword, 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(5000), CTIS.getsecondCost(5000),EnchantmentHelper.addRandomEnchantment(random, ironSword, 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(4500), CTIS.getsecondCost(4500),EnchantmentHelper.addRandomEnchantment(random, diamondAxe, 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1000), CTIS.getsecondCost(1000),EnchantmentHelper.addRandomEnchantment(random, ironSpade, 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1750), CTIS.getsecondCost(1750),EnchantmentHelper.addRandomEnchantment(random, ironPick, 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(4500), CTIS.getsecondCost(4500),EnchantmentHelper.addRandomEnchantment(random, diamondPick, 5 + random.nextInt(15))));
			break;
		case 10: // BUTCHER
			recipeList.add(new MerchantRecipe(porkchops, CTIS.getPrice(60)));
			recipeList.add(new MerchantRecipe(chicken, CTIS.getPrice(55)));
			recipeList.add(new MerchantRecipe(coal, CTIS.getPrice(95)));
			recipeList.add(new MerchantRecipe(CTIS.getCost(120), CTIS.getsecondCost(120),cookedPorkchops));
			recipeList.add(new MerchantRecipe(CTIS.getCost(120),CTIS.getsecondCost(120), cookedChicken));
			recipeList.add(new MerchantRecipe(leather, CTIS.getPrice(300)));
			recipeList.add(new MerchantRecipe(CTIS.getCost(400), CTIS.getsecondCost(400), leatherLegs));
			recipeList.add(new MerchantRecipe(CTIS.getCost(900), CTIS.getsecondCost(900),EnchantmentHelper.addRandomEnchantment(random,new ItemStack(Items.leather_chestplate), 5 + random.nextInt(15))));
			recipeList.add(new MerchantRecipe(CTIS.getCost(4000), CTIS.getsecondCost(4000), new ItemStack(Items.saddle,1)));
			break;
		case 11: //Mob Specialist
			recipeList.add(new MerchantRecipe(rottenFlesh, CTIS.getPrice(20)));
			recipeList.add(new MerchantRecipe(string, CTIS.getPrice(20)));
			recipeList.add(new MerchantRecipe(ender, CTIS.getPrice(75)));
			recipeList.add(new MerchantRecipe(neatherStar, CTIS.getPrice(500)));
			recipeList.add(new MerchantRecipe(spiderEyes, CTIS.getPrice(20)));
			recipeList.add(new MerchantRecipe(gunpowder, CTIS.getPrice(35)));
			recipeList.add(new MerchantRecipe(leather, CTIS.getPrice(40)));
			recipeList.add(new MerchantRecipe(t, CTIS.getPrice(40)));
			recipeList.add(new MerchantRecipe(witherBone, CTIS.getPrice(250)));
			recipeList.add(new MerchantRecipe(witherSkull, CTIS.getPrice(340)));
			recipeList.add(new MerchantRecipe(CTIS.getCost(20), rottenFlesh));
			recipeList.add(new MerchantRecipe(CTIS.getCost(20), string));
			recipeList.add(new MerchantRecipe(CTIS.getCost(75),CTIS.getsecondCost(75), ender));
			recipeList.add(new MerchantRecipe(CTIS.getCost(1000), CTIS.getsecondCost(1000), neatherStar));
			recipeList.add(new MerchantRecipe(CTIS.getCost(20), spiderEyes));
			recipeList.add(new MerchantRecipe(CTIS.getCost(35), gunpowder));
			recipeList.add(new MerchantRecipe(CTIS.getCost(40), leather));
			recipeList.add(new MerchantRecipe(CTIS.getCost(40), t));
			recipeList.add(new MerchantRecipe(CTIS.getCost(250), CTIS.getsecondCost(250), witherBone));
			recipeList.add(new MerchantRecipe(CTIS.getCost(340), CTIS.getsecondCost(340), witherSkull));
		default:
			break;

		}	
	}
	*/
}
