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
	
	public static Block RaiBlock, PCrystal, DIronOre, NetherDIronOre;
	
	public static void initializeBlock(){
		RaiBlock = new RaiBlock(Material.iron).setBlockName("RaiBlock").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":RaiBlock");
		PCrystal = new PCrystal(Material.rock).setBlockName("PCrystal").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":PCrystal");
		DIronOre = new PCrystal(Material.rock).setBlockName("DIronOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":DIronOre");
		NetherDIronOre = new NetherDIronOre(Material.rock).setBlockName("NetherDIronOre").setCreativeTab(MCreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":NetherDIronOre");
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(RaiBlock, RaiBlock.getUnlocalizedName());
		GameRegistry.registerBlock(PCrystal, PCrystal.getUnlocalizedName());
		GameRegistry.registerBlock(DIronOre, DIronOre.getUnlocalizedName());
		GameRegistry.registerBlock(NetherDIronOre, NetherDIronOre.getUnlocalizedName());
	}
}
