package com.astorian.exc.item;

import java.util.Random;

import com.astorian.exc.addon.AddonIC2;
import com.astorian.exc.core.helper.CheckHelper;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemHerbalAccumulator extends ItemTool {

    public static Block[] blocksEffectiveAgainst = { Block.leaves,
            Block.sapling, Block.grass };

    private int saplingMetadata;

    private static Random random = new Random();

    public ItemHerbalAccumulator(int id, int par2,
            EnumToolMaterial toolMaterial, Block[] blocksEffectiveAgainst) {
        super(id, par2, toolMaterial, blocksEffectiveAgainst);
        maxStackSize = 1;
        this.setMaxDamage(24);
        damageVsEntity = 0;
        this.setUnlocalizedName("herbalAccumulator");
    }

    @Override
    public String getItemDisplayName(ItemStack itemStack) {
        return EnumChatFormatting.YELLOW + super.getItemDisplayName(itemStack);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World,
            int blockID, int x, int y, int z, EntityLiving par7EntityLiving) {
        if (super.onBlockDestroyed(par1ItemStack, par2World, blockID, x, y, z,
                par7EntityLiving)) {
            if (!par2World.isRemote) {

                int dropRate;

                if (blockID == Block.leaves.blockID) {

                    dropRate = 1 + random.nextInt(2);

                    /*
                     * Finds and Returns right sapling of Corresponding trees
                     */
                    if (Block.leaves.getDamageValue(par2World, x, y, z) == 0) {
                        saplingMetadata = 0; // Oak
                        par2World.spawnEntityInWorld(new EntityItem(par2World,
                                x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(
                                        Block.sapling, dropRate,
                                        saplingMetadata)));
                    } else if (Block.leaves.getDamageValue(par2World, x, y, z) == 1) {
                        saplingMetadata = 1; // Spruce
                        par2World.spawnEntityInWorld(new EntityItem(par2World,
                                x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(
                                        Block.sapling, dropRate,
                                        saplingMetadata)));
                    } else if (Block.leaves.getDamageValue(par2World, x, y, z) == 2) {
                        saplingMetadata = 2; // Birch
                        par2World.spawnEntityInWorld(new EntityItem(par2World,
                                x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(
                                        Block.sapling, dropRate,
                                        saplingMetadata)));
                    } else if (Block.leaves.getDamageValue(par2World, x, y, z) == 3) {
                        saplingMetadata = 3; // Jungle
                        par2World.spawnEntityInWorld(new EntityItem(par2World,
                                x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(
                                        Block.sapling, dropRate,
                                        saplingMetadata)));
                    }

                } else if (blockID == Block.tallGrass.blockID) {
                    par2World.spawnEntityInWorld(new EntityItem(par2World,
                            x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(
                                    Item.seeds, 1)));
                } else if (blockID == Block.vine.blockID) {
                    par2World.spawnEntityInWorld(new EntityItem(par2World,
                            x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(
                                    Block.vine, 1)));
                } else

                if (CheckHelper.isIC2Loaded()) {
                    if (blockID == AddonIC2.getItem("rubberLeaves").itemID) {

                        par2World.spawnEntityInWorld(new EntityItem(par2World,
                                x + 0.5D, y + 0.5D, z + 0.5D, AddonIC2
                                        .getItem("rubberLeaves")));

                    }
                }
            }
        }
        return true;
    }

}
