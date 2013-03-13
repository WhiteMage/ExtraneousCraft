package astorian.exc.core.helper;

import cpw.mods.fml.common.Loader;

public class CheckHelper {
	
	public static boolean isIC2Loaded() {
		if(Loader.isModLoaded("IndustrialCraft 2")) {
			return true;
		} else
		return false;
	}
	
	public static boolean isBuildcraftLoaded() {
		if(Loader.isModLoaded("BuildCraft")) {
			return true;
		} else
		return false;
	}
	
	public static void checkIC2() {
		
		if(isIC2Loaded() == false) {
		    System.out.println("IC2 Not found Addon Terminating.");
		} else if(isIC2Loaded() == true) {
			System.out.println("IC2 Found Addon Loaded.");
		}
		
	}
	
	public static void checkBC() {
		
		if(isBuildcraftLoaded()) {
			System.out.println("BC Not found Addon Terminating");
		} else if(!isBuildcraftLoaded()) {
			System.out.println("BC Found Addon Loaded.");
		}
		
	}

}
