package com.astorian.exc.tile;

import net.minecraft.tileentity.TileEntity;

public class TileEntityVoidHeliograph extends TileEntity {
	
	public boolean isNightTime() {
		if(!worldObj.isRemote) {
			if(worldObj.isDaytime() && !worldObj.canBlockSeeTheSky(xCoord, yCoord+1, zCoord)){
				return true;
			} else
				return false;
		}
		return false;
	} 
	
	public boolean isWorking() {
		if(!isNightTime()) {
			return true;
		} else
			return false;
	}

}
