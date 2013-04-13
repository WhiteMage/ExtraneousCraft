package com.astorian.exc.block;

import com.astorian.exc.ExtraneousCraft;
import com.astorian.exc.lib.BlockIDs;
import com.astorian.exc.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class ExtraneousBlocks extends Block {
	
	public ExtraneousBlocks(int id, Material par2Material) {
		super(id, par2Material);
	}
	
	public static Block voidHeliograph;
	public static Block voidContainer;

	public static void init() {
		defineBlocks();
		registerBlocks();
		registerTabs();
	}
	
	public static void defineBlocks() {
		
		voidHeliograph = new BlockVoidHeliograph(BlockIDs.VoidHeliograph, Material.rock);
		voidContainer = new BlockVoidContainer(BlockIDs.VoidContainer, Material.iron);
		
	}
	
	public static void registerBlocks() {
		GameRegistry.registerBlock(voidHeliograph, voidHeliograph.getUnlocalizedName());
		GameRegistry.registerBlock(voidContainer, voidContainer.getUnlocalizedName());
	}
	
	public static void registerTabs() {
		voidHeliograph.setCreativeTab(ExtraneousCraft.tabEXC);
		voidContainer.setCreativeTab(ExtraneousCraft.tabEXC);
	}
	
	@Override
    public void registerIcons(IconRegister iconRegister)
    {
            this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
