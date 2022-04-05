package com.hellobryan.mysticalmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYSTICAL_TAB = new CreativeModeTab("mysticaltab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.ELENITE_INGOT.get());
        }
    };


}