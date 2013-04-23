package com.astorian.exc.core.helper;

import cpw.mods.fml.common.Loader;

public class CheckHelper {

    public static boolean isIndustrialCraftLoaded() {
	return Loader.isModLoaded("IC2");
    }

    public static boolean isThaumCraftLoaded() {
	return Loader.isModLoaded("Thaumcraft");
    }

    public static boolean isThermalExpansionLoaded() {
	return Loader.isModLoaded("ThermalExpansion");
    }

    public static boolean isForestryLoaded() {
	return Loader.isModLoaded("Forestry");
    }

    public static boolean isCompactCraftingLoaded() {
        return Loader.isModLoaded("CCMain");
    }
        
}
