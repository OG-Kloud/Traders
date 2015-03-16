package net.kloudspace.trades.replacers;

import net.kloudspace.trades.event.handlers.KloudArmor;
import net.kloudspace.trades.event.handlers.KloudDrops;
import net.kloudspace.trades.event.handlers.KloudFarmer;
import net.kloudspace.trades.event.handlers.KloudMaterials;
import net.kloudspace.trades.event.handlers.KloudTools;
import net.kloudspace.trades.util.Reference;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class VillagerReplacer {
	
	public static void call() {
		 VillagerRegistry.instance().registerVillagerId(6);
		 VillagerRegistry.instance().registerVillagerId(7);
		 VillagerRegistry.instance().registerVillagerId(8);
		 VillagerRegistry.instance().registerVillagerId(9);
		 VillagerRegistry.instance().registerVillagerId(10);
		 
		 VillagerRegistry.instance().registerVillageTradeHandler(6, new KloudFarmer());
		 VillagerRegistry.instance().registerVillageTradeHandler(7, new KloudMaterials());
		 VillagerRegistry.instance().registerVillageTradeHandler(8, new KloudDrops());
		 VillagerRegistry.instance().registerVillageTradeHandler(9, new KloudTools());
		 VillagerRegistry.instance().registerVillageTradeHandler(10, new KloudArmor());
		 
		 
		 VillagerRegistry.instance().registerVillagerSkin(6, Reference.getVillager(6));
		 VillagerRegistry.instance().registerVillagerSkin(7, Reference.getVillager(7));
		 VillagerRegistry.instance().registerVillagerSkin(8, Reference.getVillager(8));
		 VillagerRegistry.instance().registerVillagerSkin(9, Reference.getVillager(9));
		 VillagerRegistry.instance().registerVillagerSkin(10, Reference.getVillager(10));
		 
		 registerVillager(11, new KloudFarmer());
		 registerVillager(12, new KloudMaterials());
		 registerVillager(13, new KloudDrops());
		 registerVillager(14, new KloudTools());
		 registerVillager(15, new KloudArmor());
	}
	
	@SubscribeEvent
	public void replaceVanillaVillagers(EntityJoinWorldEvent event){
	    if (event.entity instanceof EntityVillager && ((EntityVillager)event.entity).getProfession() == 0){
	        ((EntityVillager)event.entity).setProfession(6);
	    }
	    if (event.entity instanceof EntityVillager && ((EntityVillager)event.entity).getProfession() == 1) {
	    	((EntityVillager)event.entity).setProfession(7);
	    }
	    if(event.entity instanceof EntityVillager && ((EntityVillager)event.entity).getProfession() == 2) {
	    	((EntityVillager)event.entity).setProfession(8);
	    }
	    if(event.entity instanceof EntityVillager && ((EntityVillager)event.entity).getProfession() == 3) {
	    	((EntityVillager)event.entity).setProfession(9);
	    }
	    if(event.entity instanceof EntityVillager && ((EntityVillager)event.entity).getProfession() == 4) {
	    	((EntityVillager)event.entity).setProfession(10);
	    }
	    
	}
	
	public static void registerVillager(int professionId, IVillageTradeHandler trades) {
		VillagerRegistry.instance().registerVillagerId(professionId);
		VillagerRegistry.instance().registerVillageTradeHandler(professionId, trades);
		VillagerRegistry.instance().registerVillagerSkin(professionId, Reference.getVillager(professionId));
		
	}
}