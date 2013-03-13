package astorian.exc.energy;

public enum EnergyType {

	RAW(1d, false, 0), 
	CONCENTRATED(1.5d, true, 2),
	CONDENSED(2d, true, 3), 
	COMPRESSED(5d, true, 5), 
	NOVA(10d, true, 7);
	
	public double multiplier;
	
	public int overchargeValue;
	
	public boolean isUsable;
	
	
    private	EnergyType(double par1multiplier, boolean par2usable, int par3overcharge) {
		this.multiplier = par1multiplier;
		this.isUsable = par2usable;
		this.overchargeValue = par3overcharge;
	}

}
