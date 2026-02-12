package org.inmopx.dbh_mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DBHMod.MOD_ID)
public class DBHMod {
    public static final String MOD_ID = "dbh_mod";
    public static final Logger LOGGER = LogManager.getLogger();

    public DBHMod() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        LOGGER.info("╔═════════════════════════════════════════╗");
        LOGGER.info("║        DBH-Mod  v1.0.0                  ║");
        LOGGER.info("║        InmortalPx e iLalox              ║");
        LOGGER.info("╚═════════════════════════════════════════╝");

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        LOGGER.info("[DBH-Mod] Inicialización completada con éxito.");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("[DBH-Mod] Configuración del servidor completada.");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("[DBH-Mod] Configuración del cliente completada.");
    }
}