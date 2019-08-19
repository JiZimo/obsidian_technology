package com.bilibili.lltsdyp.items;

import com.bilibili.lltsdyp.ObsidianTechnology;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianShovel extends ItemSpade {
    public ObsidianShovel(){
        super(EnumHelper.addToolMaterial("obsidian",3,2047,10.0F,2.5F,10));
        this.setUnlocalizedName("ObsidianShovel").setRegistryName(ObsidianTechnology.MODID+":"+"obsidian_shovel").setCreativeTab(CreativeTabs.TOOLS);
    }
}
