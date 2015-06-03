package com.draynayt.blocks;

import com.draynayt.creativetabs.MCreativeTabs;
import com.draynayt.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class MBlocks {
	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
	}
	
	public static Block RaiBlock, PCrystal, DIronOre, NetherDIronOre, NetherBlazeOre, FrostStone;
	
	public static void initializeBlock(){
		RaiBlock = new RaiBlock(Material.iron).setBlockName("RaiBlock").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":RaiBlock");
		PCrystal = new PCrystal(Material.glass).setBlockName("PCrystal").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PCrystal");
		DIronOre = new PCrystal(Material.rock).setBlockName("DIronOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":DIronOre");
		NetherDIronOre = new NetherDIronOre(Material.rock).setBlockName("NetherDIronOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":NetherDIronOre");
		NetherBlazeOre = new NetherBlazeOre(Material.rock).setBlockName("NetherBlazeOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":NetherBlazeOre");
		FrostStone = new FrostStone(Material.glass).setBlockName("FrostStone").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":FrostStone");
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(RaiBlock, RaiBlock.getUnlocalizedName());
		GameRegistry.registerBlock(PCrystal, PCrystal.getUnlocalizedName());
		GameRegistry.registerBlock(DIronOre, DIronOre.getUnlocalizedName());
		GameRegistry.registerBlock(NetherDIronOre, NetherDIronOre.getUnlocalizedName());
		GameRegistry.registerBlock(NetherBlazeOre, NetherBlazeOre.getUnlocalizedName());
		GameRegistry.registerBlock(FrostStone, FrostStone.getUnlocalizedName());
	}
}
