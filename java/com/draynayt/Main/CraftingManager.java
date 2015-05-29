package com.draynayt.Main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.draynayt.blocks.MBlocks;
import com.draynayt.item.MItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		GameRegistry.addRecipe(new ItemStack(MBlocks.RaiBlock, 1), new Object[]{"XZX","ZXZ","XZX", 'X', MItems.rFragment,'Z', Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(Blocks.glass, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.rFragment});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{" X ","XZX"," X ", 'X', Blocks.obsidian, 'Z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.rStick, 1), new Object[]{" X ","XZX"," X ", 'X', MItems.rFragment, 'Z',Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 1), new Object[]{"XZX","ZYZ","XZX", 'X',MItems.rFragment, 'Z', MItems.oBrick, 'Y', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.rFragment, 9), new Object[]{"   "," X ","   ", 'X',Blocks.glass});
		GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[]{"XXX","Z Z","   ",'X',Items.leather,'Z',Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[]{"XXX","Z Z","   ",'X',Items.leather,'Z',MItems.dIron});
		GameRegistry.addRecipe(new ItemStack(Items.flint_and_steel,1), new Object[]{"X  "," Z ","   ",'X',Items.flint,'Z',MItems.dIron});
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocks.RaiBlock, new ItemStack( MItems.rFragment, 5), 20.0f);
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(MItems.oBrick, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.DIronOre, new ItemStack( MItems.dIron, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.NetherDIronOre, new ItemStack(MBlocks.DIronOre, 2), 20.0f);
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather, 1), 20.0f);
	}
}
