package com.chartle.letsmodreboot.init;

import com.chartle.letsmodreboot.item.ItemLMRB;
import com.chartle.letsmodreboot.item.ItemMapleLeaf;
import com.chartle.letsmodreboot.item.ItemStroopwafel;
import com.chartle.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Hilko on 8/20/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static final ItemLMRB stroopwafel = new ItemStroopwafel();
    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(stroopwafel, "stroopwafel");
    }

}
