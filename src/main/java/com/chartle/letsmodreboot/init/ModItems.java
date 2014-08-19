package com.chartle.letsmodreboot.init;

import com.chartle.letsmodreboot.item.ItemLMRB;
import com.chartle.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Hilko on 8/20/2014.
 */
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

}
