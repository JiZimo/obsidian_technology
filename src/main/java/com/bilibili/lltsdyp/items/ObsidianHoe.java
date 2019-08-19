package com.bilibili.lltsdyp.items;

import com.bilibili.lltsdyp.ObsidianTechnology;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianHoe extends ItemHoe {
    public ObsidianHoe(){
        super(EnumHelper.addToolMaterial("obsidian",3,2047,10.0F,1.0F,10));
        this.setUnlocalizedName("ObsidianHoe").setRegistryName(ObsidianTechnology.MODID+":"+"obsidian_hoe").setCreativeTab(CreativeTabs.TOOLS);
    }
}
