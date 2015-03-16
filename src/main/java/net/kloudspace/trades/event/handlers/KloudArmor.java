package net.kloudspace.trades.event.handlers;

import static net.kloudspace.trades.util.Stacks.chainBoots;
import static net.kloudspace.trades.util.Stacks.chainChest;
import static net.kloudspace.trades.util.Stacks.chainHelm;
import static net.kloudspace.trades.util.Stacks.chainLegs;
import static net.kloudspace.trades.util.Stacks.diamondBoots;
import static net.kloudspace.trades.util.Stacks.diamondChest;
import static net.kloudspace.trades.util.Stacks.diamondHelm;
import static net.kloudspace.trades.util.Stacks.diamondLegs;
import static net.kloudspace.trades.util.Stacks.ironBoots;
import static net.kloudspace.trades.util.Stacks.ironChest;
import static net.kloudspace.trades.util.Stacks.ironHelm;
import static net.kloudspace.trades.util.Stacks.ironLegs;
import static net.kloudspace.trades.util.Stacks.leatherBoots;
import static net.kloudspace.trades.util.Stacks.leatherChest;
import static net.kloudspace.trades.util.Stacks.leatherHelm;
import static net.kloudspace.trades.util.Stacks.leatherLegs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.kloudspace.trades.util.CostMap;
import net.kloudspace.trades.util.CostToItemStack;
import net.kloudspace.trades.util.Reference;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class KloudArmor  implements IVillageTradeHandler{
	
	private final List<ItemStack> arm = new ArrayList<ItemStack>();
    private final int max = 1;
    private final int min = 1;
    private ItemStack ingredient;
   	private ItemStack ingredient2;
   	private ItemStack modified;
   	private ItemStack modified2;
   	private ItemStack result;
   	private ItemStack sell1;
   	private ItemStack sell2;
   	private int cost;
   	private int cost2;
   	private int total;
   	private int stacksize;
   	private int randomNumber;
   	static Random rand = new Random();
	
	public KloudArmor() {
		super();
		addArmor();
	}
	
	public void addArmor() {
		arm.add(leatherBoots);
		arm.add(leatherChest);
		arm.add(leatherHelm);
		arm.add(leatherLegs);
		arm.add(ironBoots);
		arm.add(ironChest);
		arm.add(ironHelm);
		arm.add(ironLegs);
		arm.add(diamondBoots);
		arm.add(diamondChest);
		arm.add(diamondHelm);
		arm.add(diamondLegs);
		arm.add(chainBoots);
		arm.add(chainChest);
		arm.add(chainHelm);
		arm.add(chainLegs);
	}
	public void buySell() {
		randomNumber = rand.nextInt(1);
	}

	@Override
	public void manipulateTradesForVillager(EntityVillager villager,
			MerchantRecipeList recipeList, Random random) {
		addArmor();
		switch(villager.getProfession()) {
		case 10:
			buySell();
			
				getStack();
				getStack2();
				getCost(ingredient);
				getCost2(ingredient2);
				stackCost(ingredient, ingredient2,cost,cost2);
				getResultStack(total);
				Reference.logger.info("Stack size = " + modified.stackSize +"for Item: " + modified);
	            if(ingredient.stackSize < 10 && ingredient2 != null) {
	            	recipeList.addToListWithCheck(new MerchantRecipe(modified,modified2,result));
	            }
	            else {
	            recipeList.addToListWithCheck(new MerchantRecipe(modified, result));
	            }
			
		case 15:
					getStack();
					getCost(ingredient);
					stackCost(ingredient, cost);
					getResultStackSell(total);
					if(sell2 != null) {
						recipeList.addToListWithCheck(new MerchantRecipe(sell1,sell2,modified));
					}
					else {
						recipeList.addToListWithCheck(new MerchantRecipe(sell1,modified));
					}
		}		
	}
	public void getStack() {
		ingredient = arm.get(rand.nextInt(arm.size() - 1));
		modified = ingredient;
		
	}
	public void getStack2() {
		ingredient2 = arm.get(rand.nextInt(arm.size() - 1));
		modified2 = ingredient2;;
	}
	public void getCost(ItemStack st1) {
		int c = CostMap.stacks.get(st1);
		cost = c;
	}
	public void getCost2(ItemStack st2) {
		int c= CostMap.stacks.get(st2);
		cost2 = c;
	}
	public void stackCost(ItemStack st1, ItemStack st2, int c, int c1) {
		int ss1 = st1.stackSize;
		int ss2 = st2.stackSize;
		int stack1 = ss1 * c;
		int stack2 = ss2 * c1;
		int total1 = stack1 + stack2;
		total = total1;
	}
	public void stackCost(ItemStack st1, int c) {
		int ss1 = st1.stackSize;
		int stack1 = ss1 * c;
		total = stack1;
	}
	public void getResultStack(int tt) {
		result = CostToItemStack.getPrice(tt);
	}
	public void getResultStackSell(int value) {
		sell1 = CostToItemStack.getCost(value);
		if(value > 64){sell2 = CostToItemStack.getsecondCost(value);}
		else {sell2 = null;}
	}
}