package net.aaron.tutorialmod.item;

import net.aaron.tutorialmod.TutorialMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,
                    TutorialMod.MODID);

    public static final RegistryObject<Item> ACMIUM =
            ITEMS.register("acmium", () -> new Item(new
                    Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

}
