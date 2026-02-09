package org.inmopx.dbh_core;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DBHMod.MODID)
public class DBHMod {

    public static final String MODID = "dbh_core";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DBHMod() {
        LOGGER.info("[DBCH-Core] Mod cargado correctamente.");
    }
}
