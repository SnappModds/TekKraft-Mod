package com.epicmods.tekkraft.init;

import com.epicmods.tekkraft.item.ItemTek;
import com.epicmods.tekkraft.item.ItemTekkanium;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by SnappGamez on 8/31/2014.
 */
public class ModItems {
    public static final ItemTek tekkanium = new ItemTekkanium()

    public static void init()
    (
            GameRegistry.registerItem(tekkanium,"Tekkanium")
            )
}
