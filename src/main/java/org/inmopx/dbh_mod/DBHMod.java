package org.inmopx.dbh_mod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DBHMod.MODID)
public class DBHMod {

    public static final String MODID = "dbh_mod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DBHMod() {
        LOGGER.info("[DBH-Mod] Mod cargado correctamente.");
    }
}
