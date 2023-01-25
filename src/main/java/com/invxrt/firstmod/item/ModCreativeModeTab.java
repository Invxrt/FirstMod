package com.invxrt.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab INVXRTS_TAB = new CreativeModeTab("firstmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TANZANITE.get());
        }
    };
    public static final CreativeModeTab INVXRTS_CREATIVE_TAB = new CreativeModeTab("firstmodcreative") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JAKE.get());
        }
    };
}
