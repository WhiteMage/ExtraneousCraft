package com.astorian.exc.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import com.astorian.exc.lib.ItemIDs;
import com.astorian.exc.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExtraneousItems extends Item {
	
	public ExtraneousItems(int par1) {
		super(par1);
	}

	public static Item herbalAccumulator;
	
	public static void init() {
		
		herbalAccumulator = new ItemHerbalAccumulator(ItemIDs.SaplingAccumulator, 0, EnumToolMaterial.WOOD, ItemHerbalAccumulator.blocksEffectiveAgainst);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	// public void setIconIndex(IconRegister iconRegister)
	public void func_94581_a(IconRegister iconRegister) {
        iconIndex = iconRegister.func_94245_a(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

}
