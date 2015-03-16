package net.kloudspace.trades.event.handlers;

import static net.kloudspace.trades.util.Stacks.coal;
import static net.kloudspace.trades.util.Stacks.diamonds;
import static net.kloudspace.trades.util.Stacks.emeralds;
import static net.kloudspace.trades.util.Stacks.glowstonedust;
import static net.kloudspace.trades.util.Stacks.gold;
import static net.kloudspace.trades.util.Stacks.iron;
import static net.kloudspace.trades.util.Stacks.redstone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.kloudspace.trades.util.CostMap;
import net.kloudspace.trades.util.CostToItemStack;
import net.kloudspace.trades.util.Reference;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class KloudMaterials implements IVillageTradeHandler{
	
	private final List<ItemStack> mat = new ArrayList<ItemStack>();
	
	protected int min = 1;
	protected int max = 6;
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
	private int stacksize2;
	private int randomNumber;
	static Random rand = new Random();
	public KloudMaterials() {
		super();
		addMaterials();
	}
	
	@Override
    public void manipulateTradesForVillager (EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		addMaterials();
		switch(villager.getProfession()) {
		case 7:
				getStack();
				getStack2();
				getCost(ingredient);
				getCost2(ingredient2);
				stackCost(modified, modified2,cost,cost2);
				getResultStack(total);
				Reference.logger.info("Stack size = " + modified.stackSize +"for Item: " + modified);
	            if(ingredient.stackSize < 10 && ingredient2 != null) {
	            	recipeList.addToListWithCheck(new MerchantRecipe(modified,modified2,result));
	            }
	            else {
	            	stackCost(modified,cost);
	            	getResultStack(total);
	            recipeList.addToListWithCheck(new MerchantRecipe(modified, result));
	            }
			
		case 12:
					getStack();
					getCost(ingredient);
					stackCost(modified, cost);
					getResultStackSell(total);
					if(sell2 != null) {
						recipeList.addToListWithCheck(new MerchantRecipe(sell1,sell2,modified));
					}
					else {
						recipeList.addToListWithCheck(new MerchantRecipe(sell1,modified));
					}
		}
	}
	public void buySell() {
		randomNumber = rand.nextInt(1);
	}
	public int getRandomNumber() {
		return (min + rand.nextInt(max));
	}
	public void getStack() {
		ingredient = mat.get(rand.nextInt(mat.size() - 1));
		stacksize = getRandomNumber();
		modified = ingredient.copy().splitStack(stacksize);
		
	}
	public void getStack2() {
		ingredient2 = mat.get(rand.nextInt(mat.size() - 1));
		modified2 = ingredient2.copy().splitStack(stacksize2);
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
	
	
	
	public void addMaterials() {
		mat.add(diamonds);
		mat.add(iron);
		mat.add(gold);
		mat.add(emeralds);
		mat.add(coal);
		mat.add(redstone);
		mat.add(glowstonedust);
	}

}