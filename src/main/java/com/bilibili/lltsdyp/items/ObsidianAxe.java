package com.bilibili.lltsdyp.items;

import com.bilibili.lltsdyp.ObsidianTechnology;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianAxe extends ItemAxe {
    public ObsidianAxe(){
        super(EnumHelper.addToolMaterial("obsidian",3,2047,2047,6.0F,10),7.0F,-3.0F);
        this.setUnlocalizedName("ObsidianAxe").setRegistryName(ObsidianTechnology.MODID+":"+"obsidian_axe").setCreativeTab(CreativeTabs.TOOLS);
    }
}
