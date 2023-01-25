package com.invxrt.firstmod.item;

import com.invxrt.firstmod.firstmod;
import com.invxrt.firstmod.item.custom.EightBallItem;
import com.mojang.brigadier.LiteralMessage;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, firstmod.MOD_ID);

    public static final RegistryObject<Item> JAKE = ITEMS.register("jake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INVXRTS_CREATIVE_TAB)));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INVXRTS_TAB)));
    public static final RegistryObject<Item> RAW_TANZANITE = ITEMS.register("raw_tanzanite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INVXRTS_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.INVXRTS_CREATIVE_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
