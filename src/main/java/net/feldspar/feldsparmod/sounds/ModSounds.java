package net.feldspar.feldsparmod.sounds;

import net.feldspar.feldsparmod.FeldsparMod;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent KUDURO_DISC = registerSoundEvent("kuduro");
    public static SoundEvent AMOGUS_DISC = registerSoundEvent("amogus");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FeldsparMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
