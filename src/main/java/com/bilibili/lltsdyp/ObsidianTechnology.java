package com.bilibili.lltsdyp;

import com.bilibili.lltsdyp.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid=ObsidianTechnology.MODID,name=ObsidianTechnology.NAME,version=ObsidianTechnology.VERSION,acceptedMinecraftVersions = ObsidianTechnology.MCVERSION)
public class ObsidianTechnology {
    public static final String MODID="ot";
    public static final String NAME="ObsidianTechnology";
    public static final String MCVERSION="1.12.2";
    public static final String VERSION="1.0.0";

    @Mod.Instance(ObsidianTechnology.MODID)
    public static ObsidianTechnology instance;

    @SidedProxy(clientSide="com.bilibili.lltsdyp.proxy.ClientProxy",
        serverSide="com.bilibili.lltsdyp.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}
