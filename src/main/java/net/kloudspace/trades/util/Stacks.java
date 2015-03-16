package net.kloudspace.trades.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ObjectIntIdentityMap;

public class Stacks {
	
	static Random random = new Random();
	public static ItemStack stack;
	protected ObjectIntIdentityMap cost = new ObjectIntIdentityMap();
    
	
	//Foods
	public static ItemStack apples = new ItemStack(Items.apple, 64);
	public static ItemStack beefs = new ItemStack(Items.beef,64);
	public static ItemStack baked = new ItemStack(Items.baked_potato,64);
	public static ItemStack bread = new ItemStack(Items.bread,64);
	public static ItemStack cake = new ItemStack(Items.cake,64);
	public static ItemStack carrot = new ItemStack(Items.carrot,64);
	public static ItemStack chicken = new ItemStack(Items.chicken,64);
	public static ItemStack cookedBeef = new ItemStack(Items.cooked_beef,64);
	public static ItemStack cookedChicken = new ItemStack(Items.cooked_chicken,64);
	public static ItemStack cookedFish = new ItemStack(Items.cooked_fished,64);
	public static ItemStack potatoes = new ItemStack(Items.potato,64);
	public static ItemStack porkchops = new ItemStack(Items.porkchop,64);
	public static ItemStack cookedPorkchops = new ItemStack(Items.cooked_porkchop,64);
	public static ItemStack cookies = new ItemStack(Items.cookie,64);
	public static ItemStack fish = new ItemStack(Items.fish,64);
	public static ItemStack melonslices = new ItemStack(Items.melon,64);
	public static ItemStack pumpkinpie = new ItemStack(Items.pumpkin_pie,64);
	public static ItemStack wheats = new ItemStack(Items.wheat,64);
	public static ItemStack mushroomStew = new ItemStack(Items.mushroom_stew,64);
	//Tools
	public static ItemStack arrows = new ItemStack(Items.arrow,64);
	public static ItemStack woodSword = new ItemStack(Items.wooden_sword);
	public static ItemStack woodAxe = new ItemStack(Items.wooden_axe);
	public static ItemStack woodPick = new ItemStack(Items.wooden_pickaxe);
	public static ItemStack woodSpade = new ItemStack(Items.wooden_shovel);
	public static ItemStack woodHoe = new ItemStack(Items.wooden_hoe);
	public static ItemStack stoneAxe = new ItemStack(Items.stone_axe);
	public static ItemStack stonePick = new ItemStack(Items.stone_pickaxe);
	public static ItemStack stoneSpade = new ItemStack(Items.stone_shovel);
	public static ItemStack stoneHoe = new ItemStack(Items.stone_hoe);
	public static ItemStack stoneSword = new ItemStack(Items.stone_sword);
	public static ItemStack ironAxe = new ItemStack(Items.iron_axe);
	public static ItemStack ironHoe = new ItemStack(Items.iron_hoe);
	public static ItemStack ironSpade = new ItemStack(Items.iron_shovel);
	public static ItemStack ironPick = new ItemStack(Items.iron_pickaxe);
	public static ItemStack ironSword = new ItemStack(Items.iron_sword);
	public static ItemStack diamondAxe = new ItemStack(Items.diamond_axe);
	public static ItemStack diamondHoe = new ItemStack(Items.diamond_hoe);
	public static ItemStack diamondPick = new ItemStack(Items.diamond_pickaxe);
	public static ItemStack diamondSpade = new ItemStack(Items.diamond_shovel);
	public static ItemStack diamondSword = new ItemStack(Items.diamond_sword);
	public static ItemStack shears = new ItemStack(Items.shears);
	//Armor
	public static ItemStack leatherBoots = new ItemStack(Items.leather_boots);
	public static ItemStack leatherChest = new ItemStack(Items.leather_chestplate);
	public static ItemStack leatherHelm = new ItemStack(Items.leather_helmet);
	public static ItemStack leatherLegs = new ItemStack(Items.leather_leggings);
	public static ItemStack goldBoots = new ItemStack(Items.golden_boots);
	public static ItemStack goldChest = new ItemStack(Items.golden_chestplate);
	public static ItemStack goldHelm = new ItemStack(Items.golden_helmet);
	public static ItemStack goldLegs = new ItemStack(Items.golden_leggings);
	public static ItemStack ironBoots = new ItemStack(Items.iron_boots);
	public static ItemStack ironChest = new ItemStack(Items.iron_chestplate);
	public static ItemStack ironHelm = new ItemStack(Items.iron_helmet);
	public static ItemStack ironLegs = new ItemStack(Items.iron_leggings);
	public static ItemStack diamondBoots = new ItemStack(Items.diamond_boots);
	public static ItemStack diamondChest = new ItemStack(Items.diamond_chestplate);
	public static ItemStack diamondHelm = new ItemStack(Items.diamond_helmet);
	public static ItemStack diamondLegs = new ItemStack(Items.diamond_leggings);
	public static ItemStack chainBoots = new ItemStack(Items.chainmail_boots);
	public static ItemStack chainChest = new ItemStack(Items.chainmail_chestplate);
	public static ItemStack chainHelm = new ItemStack(Items.chainmail_helmet);
	public static ItemStack chainLegs = new ItemStack(Items.chainmail_leggings);
	//Mob Drops
	public static ItemStack rottenFlesh = new ItemStack(Items.rotten_flesh,64);
	public static ItemStack string = new ItemStack(Items.string,64);
	public static ItemStack gunpowder = new ItemStack(Items.gunpowder,64);
	public static ItemStack bones = new ItemStack(Items.bone,64);
	public static ItemStack leatherDrop = new ItemStack(Items.leather,64);
//	public static ItemStack wools = t;
	public static ItemStack eggs = new ItemStack(Items.egg,64);
	public static ItemStack blazeRod = new ItemStack(Items.blaze_rod,64);
	public static ItemStack blazePowder = new ItemStack(Items.blaze_powder,64);
	public static ItemStack magma = new ItemStack(Items.magma_cream,64);
	public static ItemStack ender = new ItemStack(Items.ender_pearl,64);
	public static ItemStack spiderEyes = new ItemStack(Items.spider_eye,64);
	public static ItemStack witherSkull = new ItemStack(Items.skull,64,1);
	public static ItemStack witherBone = new ItemStack(Items.bone,64);
	//Materials
	public static ItemStack diamonds = new ItemStack(Items.diamond,3);
	public static ItemStack iron = new ItemStack(Items.iron_ingot,6);
	public static ItemStack gold = new ItemStack(Items.gold_ingot,4);
	public static ItemStack emeralds = new ItemStack(Items.emerald,2);
	public static ItemStack coal = new ItemStack(Items.coal,18);
	public static ItemStack sticks = new ItemStack(Items.stick,10);
	public static ItemStack neatherStar = new ItemStack(Items.nether_star,1);
	public static ItemStack flint = new ItemStack(Items.flint,10);
	public static ItemStack leather = new ItemStack(Items.leather,7);
	public static ItemStack papers = new ItemStack(Items.paper,3);
	public static ItemStack books = new ItemStack(Items.book,6);
	public static ItemStack spawnEggs = new ItemStack(Items.spawn_egg,1);
	public static ItemStack redstone = new ItemStack(Items.redstone,4);
	public static ItemStack glowstonedust = new ItemStack(Items.glowstone_dust,4);
	//Items
	public static ItemStack compass = new ItemStack(Items.compass);
	public static ItemStack bed = new ItemStack(Items.bed);
	public static ItemStack boat = new ItemStack(Items.boat);
	public static ItemStack bowl = new ItemStack(Items.bowl);
	public static ItemStack brick = new ItemStack(Items.brick);
	public static ItemStack bucket = new ItemStack(Items.bucket);
	public static ItemStack clayball = new ItemStack(Items.clay_ball);
	public static ItemStack clock = new ItemStack(Items.clock);
	public static ItemStack enderEye = new ItemStack(Items.ender_eye);
	public static ItemStack expBottle = new ItemStack(Items.experience_bottle);
	public static ItemStack fireCharge = new ItemStack(Items.fire_charge);
	public static ItemStack ghastTear = new ItemStack(Items.ghast_tear);
	//blocks
	public static ItemStack anvils = new ItemStack(Blocks.anvil,1);
	public static ItemStack bookshelf = new ItemStack(Blocks.bookshelf,1);
	public static ItemStack brewer = new ItemStack(Blocks.brewing_stand,1);
	public static ItemStack cactus = new ItemStack(Blocks.cactus,5);
	public static ItemStack cobble = new ItemStack(Blocks.cobblestone,12);
	public static ItemStack cauldron = new ItemStack(Blocks.cauldron,1);
	public static ItemStack chest = new ItemStack(Blocks.chest,3);
	public static ItemStack dirt = new ItemStack(Blocks.dirt,22);
	public static ItemStack dispenser = new ItemStack(Blocks.dispenser,1);
	public static ItemStack dropper = new ItemStack(Blocks.dropper,1);
	public static ItemStack enchanter = new ItemStack(Blocks.enchanting_table,1);
	public static ItemStack endstone = new ItemStack(Blocks.end_stone,3);
	public static ItemStack entportal = new ItemStack(Blocks.end_portal_frame,1);
	public static ItemStack furnace = new ItemStack(Blocks.furnace,6);
	public static ItemStack glass = new ItemStack(Blocks.glass,6);
	public static ItemStack glowstone = new ItemStack(Blocks.glowstone,1);
	public static ItemStack gravel = new ItemStack(Blocks.gravel,10);
	public static ItemStack hay = new ItemStack(Blocks.hay_block,3);
	public static ItemStack hopper = new ItemStack(Blocks.hopper,1);
	public static ItemStack ice = new ItemStack(Blocks.ice,3);
	public static ItemStack jukebox = new ItemStack(Blocks.jukebox,1);
	public static ItemStack log = new ItemStack(Blocks.log,3);
	public static ItemStack melon = new ItemStack(Blocks.melon_block,3);
	public static ItemStack mossy = new ItemStack(Blocks.mossy_cobblestone,7);
	public static ItemStack obsidian = new ItemStack(Blocks.obsidian,1);
	public static ItemStack packedice = new ItemStack(Blocks.packed_ice,1);
	public static ItemStack planks = new ItemStack(Blocks.planks,3);
	public static ItemStack pumpkins = new ItemStack(Blocks.pumpkin,1);
	public static ItemStack piston = new ItemStack(Blocks.piston,1);
	public static ItemStack quartz = new ItemStack(Blocks.quartz_block,1);
	public static ItemStack redstonelamp = new ItemStack(Blocks.redstone_lamp,1);
	public static ItemStack sandstone = new ItemStack(Blocks.sandstone,6);
	public static ItemStack snow = new ItemStack(Blocks.snow,3);
	public static ItemStack soulsand = new ItemStack(Blocks.soul_sand,1);
	public static ItemStack stone = new ItemStack(Blocks.stone,6);
	public static ItemStack stonebrick = new ItemStack(Blocks.stonebrick,6);
	public static ItemStack stickypiston = new ItemStack(Blocks.sticky_piston,1);
	public static ItemStack sand = new ItemStack(Blocks.sand,3);
	public static ItemStack tnt = new ItemStack(Blocks.tnt,1);
	public static ItemStack torch = new ItemStack(Blocks.torch,4);
	public static ItemStack t = new ItemStack(Blocks.wool,5);
	
	public void costMap() {

	}
}
