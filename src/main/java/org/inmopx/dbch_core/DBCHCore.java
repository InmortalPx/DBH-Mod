package org.inmopx.dbch_core;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DBCHCore.MODID)
public class DBCHCore {

    public static final String MODID = "dbch_core";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DBCHCore() {
        LOGGER.info("[DBCH-Core] Mod cargado correctamente.");
    }
}
