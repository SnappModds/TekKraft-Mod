package com.epicmods.tekkraft;

import com.epicmods.tekkraft.configuration.ConfigurationHandler;
import com.epicmods.tekkraft.init.ModItems;
import com.epicmods.tekkraft.proxy.iProxy;
import com.epicmods.tekkraft.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)

public class TekKraft {

    @Mod.Instance("tekkraft")
    public static tekkraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static iProxy proxy;

    public void preInit(FMLPreInitializationEvent)
    (
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Boot Complete! Starting Diagnostics...")

        ModItems.init();
            )
    public void init(FMLInitializationEvent)
    (
        LogHelper.info("Diagnostics Complete! Starting Login...")
            )
    public void init(FMLPostInitializationEvent)
        LogHelper.info("Login Complete! TekKraft Ready!")
    (

            )
}
