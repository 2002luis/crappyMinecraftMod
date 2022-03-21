package net.feldspar.feldsparmod.item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroup;

import net.feldspar.feldsparmod.FeldsparMod;
import net.feldspar.feldsparmod.sounds.ModSounds;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;





public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FeldsparMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FeldsparMod.LOGGER.info("Registering Mod Items for " + FeldsparMod.MOD_ID);
    }


    public static final Item KUDURO_MUSIC_DISC = registerItem("kuduro_music_disc", new ModMusicDisc(0, ModSounds.KUDURO_DISC, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

}

