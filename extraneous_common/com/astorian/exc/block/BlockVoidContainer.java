package com.astorian.exc.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVoidContainer extends BlockContainer {

    @SideOnly(Side.CLIENT)
    private Icon[][] icons;

    public BlockVoidContainer(int id) {
        super(id, Material.iron);
        this.setUnlocalizedName("voidContainer");
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return null;
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
        return 22;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return null; // TODO Add a tileEntity Switch here...
    }

}
