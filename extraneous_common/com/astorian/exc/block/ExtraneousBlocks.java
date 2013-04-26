package com.astorian.exc.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.astorian.exc.ExtraneousCraft;
import com.astorian.exc.lib.BlockIDs;
import com.astorian.exc.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class ExtraneousBlocks extends Block {

    public ExtraneousBlocks(int id, Material par2Material) {
        super(id, par2Material);
    }

    public static Block voidHeliograph;
    // public static Block voidContainer;

    public static Block corruptedGrass;

    public static void init() {
        defineBlocks();
        registerBlocks();
        registerTabs();
    }

    public static void defineBlocks() {

        voidHeliograph = new BlockVoidHeliograph(BlockIDs.VoidHeliograph,
                Material.rock);
        // voidContainer = new BlockVoidContainer(BlockIDs.VoidContainer);

        // corruptedGrass = new BlockCorruptedGrass(BlockIDs.CorruptedGrass).setUnlocalizedName("corruptedGrass");

    }

    public static void registerBlocks() {
        
        // GameRegistry.registerBlock(corruptedGrass, corruptedGrass.getUnlocalizedName());
        GameRegistry.registerBlock(voidHeliograph, voidHeliograph.getUnlocalizedName());

    }

    public static void registerTabs() {
        voidHeliograph.setCreativeTab(ExtraneousCraft.tabEXC);
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID
                .toLowerCase()
                + ":"
                + this.getUnlocalizedName().substring(
                        this.getUnlocalizedName().indexOf(".") + 1));
    }

}
