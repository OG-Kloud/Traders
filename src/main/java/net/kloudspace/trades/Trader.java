package net.kloudspace.trades;

import net.kloudspace.trades.common.CommonProxy;
import net.kloudspace.trades.handlers.GuiHandler;
import net.kloudspace.trades.item.ItemReg;
import net.kloudspace.trades.replacers.VillagerReplacer;
import net.kloudspace.trades.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Trader {
	public GuiHandler guiHandler = new GuiHandler();
//	@SidedProxy(clientSide = "net.kloudspace.trades.common.CommonProxy", serverSide = "net.kloudspace.trades.client.ClientProxy")
	public CommonProxy proxy;
	
	@EventHandler
	public void pre(FMLPreInitializationEvent event) {
		ItemReg.init();
		VillagerReplacer.call();
		MinecraftForge.EVENT_BUS.register(new VillagerReplacer());
	}
	@EventHandler
	public void post(FMLPostInitializationEvent event) {
	}
	@EventHandler
	public void load(FMLInitializationEvent event) {
	}
}
