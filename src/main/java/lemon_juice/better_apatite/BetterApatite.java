package lemon_juice.better_apatite;

import lemon_juice.better_apatite.block.BetterApatiteBlocks;
import lemon_juice.better_apatite.creativetab.BetterApatiteCreativeTab;
import lemon_juice.better_apatite.item.BetterApatiteItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterApatite.MOD_ID)
public class BetterApatite {
    public static final String MOD_ID = "better_apatite";

    public BetterApatite(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items
        BetterApatiteItems.register(modEventBus);
        BetterApatiteBlocks.register(modEventBus);

        // Register Creative Tab
        BetterApatiteCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterApatiteCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
