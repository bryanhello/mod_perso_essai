package com.hellobryan.mysticalmod.item;

import com.hellobryan.mysticalmod.MysticalMod;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MysticalMod.MOD_ID);

    public static final RegistryObject<Item> ELENITE = ITEMS.register("elenite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
