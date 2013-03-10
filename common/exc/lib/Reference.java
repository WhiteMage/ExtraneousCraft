package exc.lib;

public class Reference {
	
	public static final String MOD_NAME = "ExtraneousCraft";
	public static final String MOD_ID = "EXC";
	
	/**
	 * The current version of ExtraneousCraft. Used when considering whether a new update is actually newer.
	 */
	public static final String CURRENT_VERSION_NUMS_ONLY = "0.0.01";
	
	/**
	 * DOES NOT WORK WITH fenceFoil's PRIMITIVE VersionCompare :(
	 */
	public static final String CURRENT_VERSION = "0.01a";
	
	/**
	 * Current version of Minecraft targeted by this version of ExtraneousCraft. Used by the updater.
	 */
	public static final String MINECRAFT_VERSION = "1.4.6";
	
	public static final String MOD_PREFIX = "[" + MOD_NAME + "]";
	
	public static final String TEXTURE_LOCATION = "/resources/art/sprites/";
	public static final String BLOCK_TEXTURES = TEXTURE_LOCATION + "blocks.png";
	public static final String ITEM_TEXTURES = TEXTURE_LOCATION + "items.png";
	public static final String MISC_TEXTURES = TEXTURE_LOCATION + "misc.png";
	
	public static final String PROXY_LOCATION = "exc.core.proxy.";
	public static final String COMMON_PROXY = PROXY_LOCATION + "CommonProxy";
	public static final String CLIENT_PROXY = PROXY_LOCATION + "ClientProxy";
	

}
