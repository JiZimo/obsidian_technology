package com.bilibili.lltsdyp.items;

import com.bilibili.lltsdyp.ObsidianTechnology;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianSword extends ItemSword {
    public ObsidianSword(){
        super(EnumHelper.addToolMaterial("Obsidian",3,2047,10.0F,3.0F,10));
        this.setUnlocalizedName("ObsidianSword").setRegistryName(ObsidianTechnology.MODID+":"+"obsidian_sword").setCreativeTab(CreativeTabs.COMBAT);
    }
}
