package com.astorian.exc.block;

import com.astorian.exc.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class ExtraneousBlocks extends Block {
	
	public ExtraneousBlocks(int id, Material par2Material) {
		super(id, par2Material);
	}
	
	public static Block voidHeliograph;

	public static void init() {
		
	}
	
	public static void registerBlocks() {
		
	}
	
	public static void registerTabs() {
		
	}
	
	@Override
    public void registerIcons(IconRegister iconRegister)
    {
            this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
