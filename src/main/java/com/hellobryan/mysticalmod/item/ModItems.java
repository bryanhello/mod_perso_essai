package com.hellobryan.mysticalmod.item;

import com.hellobryan.mysticalmod.MysticalMod;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MysticalMod.MOD_ID);

    public static final RegistryObject<Item> ELENITE_INGOT = ITEMS.register("elenite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTICAL_TAB)));

    public static final RegistryObject<Item> ELENITE_HELMET = ITEMS.register("elenite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ELENITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MYSTICAL_TAB)));
    public static final RegistryObject<Item> ELENITE_CHESTPLATE = ITEMS.register("elenite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ELENITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MYSTICAL_TAB)));
    public static final RegistryObject<Item> ELENITE_LEGGING = ITEMS.register("elenite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ELENITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MYSTICAL_TAB)));
    public static final RegistryObject<Item> ELENITE_BOOTS = ITEMS.register("elenite_boots",
            () -> new ArmorItem(ModArmorMaterials.ELENITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MYSTICAL_TAB)));



    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}