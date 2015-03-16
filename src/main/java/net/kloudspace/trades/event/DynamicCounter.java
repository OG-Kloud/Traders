package net.kloudspace.trades.event;

import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import com.google.common.eventbus.Subscribe;

public class DynamicCounter implements IExtendedEntityProperties{
	
	public int iron = 0;
	@Subscribe
	public void onPickup(EntityItemPickupEvent event) {
		if(event.item.getEntityItem().getItem() == Items.iron_ingot) {
			iron++;
			
		}
	}
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		compound.setInteger("iron", iron);
	}
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		this.iron = compound.getInteger("iron");
	}
	@Override
	public void init(Entity entity, World world) {
		
	}

}
