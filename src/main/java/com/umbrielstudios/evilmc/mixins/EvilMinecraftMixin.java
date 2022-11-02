package com.umbrielstudios.evilmc.mixins;

import com.umbrielstudios.evilmc.EvilMinecraftMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class EvilMinecraftMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        EvilMinecraftMod.LOGGER.info("Evil Minecraft Revival Mixins generated");
    }
}
