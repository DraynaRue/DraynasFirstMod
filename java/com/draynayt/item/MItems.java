package com.draynayt.item;

import com.draynayt.creativetabs.MCreativeTabs;
import com.draynayt.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MItems {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item oStick, oBrick, rStick, rFragment, pDiamond, dIron, pOrb, bDiamond;
	
	public static void initializeItem(){
		oStick = new Item().setUnlocalizedName("oStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":oStick");
		oBrick = new Item().setUnlocalizedName("oBrick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":oBrick");
		rStick = new Item().setUnlocalizedName("rStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":rStick");
		rFragment = new Item().setUnlocalizedName("rFragment").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":rFragment");
		pDiamond = new Item().setUnlocalizedName("pDiamond").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":pDiamond");
		dIron = new Item().setUnlocalizedName("dIron").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":dIron");
		pOrb = new Item().setUnlocalizedName("pOrb").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":pOrb");
		bDiamond = new Item().setUnlocalizedName("bDiamond").setCreativeTab(MCreativeTabs.tabItems).setTextureName(RefStrings.MODID + ":bDiamond");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(oStick, oStick.getUnlocalizedName());
		GameRegistry.registerItem(oBrick, oBrick.getUnlocalizedName());
		GameRegistry.registerItem(rStick, rStick.getUnlocalizedName());
		GameRegistry.registerItem(rFragment, rFragment.getUnlocalizedName());
		GameRegistry.registerItem(pDiamond, pDiamond.getUnlocalizedName());
		GameRegistry.registerItem(dIron, dIron.getUnlocalizedName());
		GameRegistry.registerItem(pOrb, pOrb.getUnlocalizedName());
		GameRegistry.registerItem(bDiamond, bDiamond.getUnlocalizedName());
	}
}
