package com.astorian.exc.energy;

public class VoidEnergy {
	
	public static EnergyType energyType;
	
    /*How many vE Units fade in a machine through Time (in Minecraft Ticks)*/
	public static int inMachineDuration() {
		
		if(energyType != null) {
		
		    if(energyType == EnergyType.RAW) {
			
			    return 100; //5 Seconds IRL
			
		    } else if(energyType == EnergyType.CONCENTRATED) {
			
		    	return 300; //15 Seconds
			
		    } else if(energyType == EnergyType.CONDENSED) {
			
		    	return 700; //35 Seconds
			
		    } else if(energyType == EnergyType.COMPRESSED) {
			
		    	return 1000; //50 Seconds
			
		    } else if(energyType == EnergyType.NOVA) {
		 	
		    	return 1700; //1 Minute 25 Seconds
			
		    } 
	    }
		return 0;	
	}
	
	public static int getDuration() {
		return inMachineDuration();
	}
	
	public static int getOverchargeValue() {
		return energyType.overchargeValue;
	}
	
	public static double getMultiplier() {
		return energyType.multiplier;
	}

}
