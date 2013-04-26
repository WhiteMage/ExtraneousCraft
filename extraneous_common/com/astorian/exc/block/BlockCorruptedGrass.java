package com.astorian.exc.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.astorian.exc.ExtraneousCraft;
import com.astorian.exc.item.ExtraneousItems;

public class BlockCorruptedGrass extends Block {
	
	private Random rand = new Random();

	public BlockCorruptedGrass(int id) {
		super(id, Material.grass);
		this.setUnlocalizedName("corruptedGrass");
		this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.8F, 0.9F);
		this.setCreativeTab(ExtraneousCraft.tabEXC);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		int random = rand.nextInt(100);
		int meta = 0;
		
		if(random < 5) {
			meta = 3;
		} else if(random < 25 && random > 4) {
			meta = 0;
		} else if(random < 50 && random > 24) {
			meta = 1;
		} else {
			meta = 2;
		}
		

		return ExtraneousItems.infusedSeed.itemID;
	}
	

}
