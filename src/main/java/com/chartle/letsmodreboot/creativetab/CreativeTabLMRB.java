package com.chartle.letsmodreboot.creativetab;

import com.chartle.letsmodreboot.init.ModItems;
import com.chartle.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Hilko on 8/20/2014.
 */
public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Let's Mod Reboot";
        }
    };
}
