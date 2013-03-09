package exc.lib;

public class Reference {
	
	public static final String MOD_NAME = "ExtraneousCraft";
	public static final String MOD_ID = "EXC";
	public static final String VERSION = "0.01a"; //TODO Have a remote version check instead of this
	
	public static final String MOD_PREFIX = "[" + MOD_NAME + "]";
	
	public static final String TEXTURE_LOCATION = "/resources/art/sprites/";
	public static final String BLOCK_TEXTURES = TEXTURE_LOCATION + "blocks.png";
	public static final String ITEM_TEXTURES = TEXTURE_LOCATION + "items.png";
	public static final String MISC_TEXTURES = TEXTURE_LOCATION + "misc.png";
	
	public static final String PROXY_LOCATION = "exc.core.proxy.";
	public static final String COMMON_PROXY = PROXY_LOCATION + "CommonProxy";
	public static final String CLIENT_PROXY = PROXY_LOCATION + "ClientProxy";
	

}
