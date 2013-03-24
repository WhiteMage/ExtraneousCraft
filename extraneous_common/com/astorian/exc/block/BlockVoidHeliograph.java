package com.astorian.exc.block;

import java.util.Random;

import com.astorian.exc.lib.ModelIDs;
import com.astorian.exc.tile.TileEntityVoidHeliograph;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class BlockVoidHeliograph extends BlockContainer {

	public BlockVoidHeliograph(int id, Material par2Material) {
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("voidHeliograph");
	}
	
	public int quantityDropped(Random par1Random) {
	    return 1;
	}
	
	@Override
    public boolean isOpaqueCube() {
        return false;
    }
	
	@Override
    public boolean renderAsNormalBlock() {
        return false;
    }
	
	@Override
    public int getRenderType() {
        return ModelIDs.ModelVoidHeliograph;
    }

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityVoidHeliograph();
	}

}
