package com.astorian.exc.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.astorian.exc.ExtraneousCraft;
import com.astorian.exc.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemInfusedSeeds extends ItemSeeds {

	public static String[] seedNames = { "Void", "Light", "Neutral", "Unstable" };

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	public ItemInfusedSeeds(int id, int blockType, int soilID) {
		super(id, blockType, soilID);
		this.setHasSubtypes(true);
		this.setCreativeTab(ExtraneousCraft.tabEXC);
		this.setUnlocalizedName("infusedSeeds");
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {

		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 3);
		return super.getUnlocalizedName() + seedNames[meta];
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        int j = MathHelper.clamp_int(meta, 0, 3);
        return icons[j];
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        icons = new Icon[seedNames.length];

        for (int i = 0; i < seedNames.length; ++i) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "infusedSeeds" + seedNames[i]);
        }
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {

        int meta = MathHelper.clamp_int(stack.getItemDamage(), 0, 3);

        if (meta == 3)
            return true;
        else
            return false;
    }
	
	@Override
    public String getItemDisplayName(ItemStack itemStack) {

        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 3);

        switch (meta) {
            case 0:
                return EnumChatFormatting.DARK_BLUE + super.getItemDisplayName(itemStack);
            case 1:
                return EnumChatFormatting.YELLOW + super.getItemDisplayName(itemStack);
            case 2:
                return EnumChatFormatting.WHITE + super.getItemDisplayName(itemStack);
            case 3:
                return EnumChatFormatting.LIGHT_PURPLE + super.getItemDisplayName(itemStack);
            default:
            	return EnumChatFormatting.WHITE + super.getItemDisplayName(itemStack);
        }
    }

	@Override
	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int par4, int par5,
			int par6, int par7, float par8, float par9, float par10) {

		return false;

	}
	
	@Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    @SideOnly(Side.CLIENT)
    public void getSubItems(int id, CreativeTabs creativeTab, List list) {

        for (int meta = 0; meta < 4; ++meta) {
            list.add(new ItemStack(id, 1, meta));
        }
    }

}
