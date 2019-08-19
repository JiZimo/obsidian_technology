package com.bilibili.lltsdyp.items;

import com.bilibili.lltsdyp.ObsidianTechnology;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianPickaxe extends ItemPickaxe{
    public ObsidianPickaxe(){
        super(EnumHelper.addToolMaterial("obsidian",3,2047,10.0F,2.0F,10));
        this.setUnlocalizedName("ObsidianPickaxe").setRegistryName(ObsidianTechnology.MODID+":"+"obsidian_pickaxe").setCreativeTab(CreativeTabs.TOOLS);
    }
}
