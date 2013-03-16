package com.astorian.exc.core.helper;

import com.astorian.exc.lib.Reference;

public class StartupHelper { 
	
	public static void initAddonCheck() {
		CheckHelper.checkIC2();
		CheckHelper.checkBC();
	}

}
