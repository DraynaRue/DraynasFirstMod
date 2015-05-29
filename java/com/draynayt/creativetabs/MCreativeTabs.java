package com.draynayt.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	
	public static CreativeTabs tabBlock;
	public static CreativeTabs tabItems;
	public static CreativeTabs tabTools;
	
	public static void initializeTabs(){
		tabBlock = new CreativeTabBlock("BlockTab");
		tabItems = new CreativeTabItems("ItemTab");
		tabTools = new CreativeTabTools("ToolTab");
	}
}
