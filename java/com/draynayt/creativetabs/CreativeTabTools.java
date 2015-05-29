package com.draynayt.creativetabs;

import com.draynayt.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTools extends CreativeTabs {

	public CreativeTabTools(String lable) {
		super(lable);

	}

	@Override
	public Item getTabIconItem() {

		return MItems.rStick;
	}

}
