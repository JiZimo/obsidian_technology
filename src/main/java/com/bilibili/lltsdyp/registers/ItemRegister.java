package com.bilibili.lltsdyp.registers;

import com.bilibili.lltsdyp.ItemsList;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemRegister {
    public ItemRegister(){
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public static void Registry(RegistryEvent.Register<Item> event){
        for(Item item: ItemsList.itemsList){
            event.getRegistry().register(item);
        }
    }
}
