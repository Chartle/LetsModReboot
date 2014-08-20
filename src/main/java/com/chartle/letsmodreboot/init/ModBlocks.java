package com.chartle.letsmodreboot.init;

import com.chartle.letsmodreboot.block.BlockFlag;
import com.chartle.letsmodreboot.block.BlockLMRB;
import com.chartle.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Hilko on 8/20/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
