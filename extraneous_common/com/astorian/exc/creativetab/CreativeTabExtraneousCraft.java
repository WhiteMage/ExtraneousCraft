package com.astorian.exc.creativetab;

import net.minecraft.creativetab.CreativeTabs;

import com.astorian.exc.lib.BlockIDs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabExtraneousCraft extends CreativeTabs {

    public CreativeTabExtraneousCraft(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {

        return BlockIDs.VoidHeliograph;
    }

}
