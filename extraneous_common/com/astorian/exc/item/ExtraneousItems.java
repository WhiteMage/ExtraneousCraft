package com.astorian.exc.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

import com.astorian.exc.ExtraneousCraft;
import com.astorian.exc.lib.ItemIDs;
import com.astorian.exc.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExtraneousItems extends Item {

	private static int placeHolder = 0;

	public ExtraneousItems(int par1) {
		super(par1);
	}

	public static Item ingotEterneous;
	public static Item chunkEterneous;
	public static Item eterneousFallBoots;
	public static Item herbalAccumulator;
	public static Item infusedSeeds;

	public static void init() {

		registerItems();
		registerTabs();

	}

	public static void registerItems() {

		ingotEterneous = new Item(ItemIDs.EterneousIngot)
				.setUnlocalizedName("ingotEterneous");

		herbalAccumulator = new ItemHerbalAccumulator(
				ItemIDs.SaplingAccumulator, 0, EnumToolMaterial.WOOD,
				ItemHerbalAccumulator.blocksEffectiveAgainst);

		infusedSeeds = new ItemInfusedSeeds(ItemIDs.InfusedSeeds, placeHolder,
				Block.tilledField.blockID);
	}

	public static void registerTabs() {

		ingotEterneous.setCreativeTab(ExtraneousCraft.tabEXC);
		herbalAccumulator.setCreativeTab(ExtraneousCraft.tabEXC);

	}

	@Override
	@SideOnly(Side.CLIENT)
	// public void setIconIndex(IconRegister iconRegister)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
				+ ":"
				+ this.getUnlocalizedName().substring(
						this.getUnlocalizedName().indexOf(".") + 1));
	}

}
