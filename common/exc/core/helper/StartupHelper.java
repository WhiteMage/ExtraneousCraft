package exc.core.helper;

import exc.lib.Reference;

public class StartupHelper { 
	
	public static void initAddonCheck() {
		CheckHelper.checkIC2();
		CheckHelper.checkBC();
	}

}
