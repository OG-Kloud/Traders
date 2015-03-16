package net.kloudspace.trades.item.artproxy;

import java.util.Locale;

import net.kloudspace.trades.util.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class TextureHandler {
	
	public static IIcon registerIcon(IIconRegister reg, String name, String folder)
    {
        return reg.registerIcon(Reference.MODID.toLowerCase(Locale.ENGLISH) + ":" + folder + "/" + name);
    }

}
