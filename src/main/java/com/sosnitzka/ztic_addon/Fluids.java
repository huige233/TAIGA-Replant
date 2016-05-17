package com.sosnitzka.ztic_addon;


import com.sosnitzka.ztic_addon.generic.BasicTinkerFluid;
import com.sosnitzka.ztic_addon.util.Utils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;

public class Fluids {

    public static BasicTinkerFluid arcaniteFluid = new BasicTinkerFluid("arcanite", 0xFF272354, true, 200, 10, 4000);
    public static BasicTinkerFluid titaniteFluid = new BasicTinkerFluid("titanite", 0xFFe0ede7, true, 200, 10, 4000);
    public static BasicTinkerFluid adamantiteFluid = new BasicTinkerFluid("adamantite", 0xFFc45c82, true, 200, 10, 4000);
    public static BasicTinkerFluid violiumFluid = new BasicTinkerFluid("violium", 0xFF264c4f, true, 200, 10, 4000);
    public static BasicTinkerFluid bismuthFluid = new BasicTinkerFluid("bismuth", 0xFF555555, true, 200, 10, 4000);
    public static BasicTinkerFluid eterniteFluid = new BasicTinkerFluid("eternite", 0xFFfafa98, true, 200, 10, 4000);
    public static BasicTinkerFluid ignititeFluid = new BasicTinkerFluid("ignitite", 0xFFff6642, true, 200, 10, 4000);
    public static BasicTinkerFluid karmesineFluid = new BasicTinkerFluid("karmesine", 0xFFc16d6d, true, 200, 10, 4000);
    public static BasicTinkerFluid meteoriteFluid = new BasicTinkerFluid("meteorite", 0xFF6e6a62, true, 200, 10, 4000);
    public static BasicTinkerFluid mindoriteFluid = new BasicTinkerFluid("mindorite", 0xFF6bbbbf, true, 200, 10, 4000);
    public static BasicTinkerFluid mythrilFluid = new BasicTinkerFluid("mythril", 0xFFa8c0ba, true, 200, 10, 4000);
    public static BasicTinkerFluid palladiumFluid = new BasicTinkerFluid("palladium", 0xFFfe5c05, true, 200, 10, 4000);
    public static BasicTinkerFluid prometheumFluid = new BasicTinkerFluid("prometheum", 0xFF2b282f, true, 200, 10, 4000);
    public static BasicTinkerFluid tiberiumFluid = new BasicTinkerFluid("tiberium", 0xFF5f9e2d, true, 200, 10, 4000);
    public static BasicTinkerFluid vibraniumFluid = new BasicTinkerFluid("vibranium", 0xFFc4ddc8, true, 200, 10, 4000);
    public static BasicTinkerFluid rubiumFluid = new BasicTinkerFluid("rubium", 0xFFe371b0, true, 200, 10, 4000);

    public static BasicTinkerFluid astriumFluid = new BasicTinkerFluid("astrium", 0xFF7a3b74, true, 200, 10, 4000);
    public static BasicTinkerFluid nitroniteFluid = new BasicTinkerFluid("nitronite", 0xFFdfe553, true, 200, 10, 4000);
    public static BasicTinkerFluid proxideumFluid = new BasicTinkerFluid("proxideum", 0xFF2f7177, true, 200, 10, 4000);
    public static BasicTinkerFluid noctunyxFluid = new BasicTinkerFluid("noctunyx", 0xFF5f5081, true, 200, 10, 4000);
    public static BasicTinkerFluid imperomiteFluid = new BasicTinkerFluid("imperomite", 0xFFff6642, true, 200, 10, 4000);
    public static BasicTinkerFluid cryptogenFluid = new BasicTinkerFluid("cryptogen", 0xFF9f8a4a, true, 200, 10, 4000);
    public static BasicTinkerFluid fractoryteFluid = new BasicTinkerFluid("fractoryte", 0xFF983f11, true, 200, 10, 4000);
    public static BasicTinkerFluid seismodiumFluid = new BasicTinkerFluid("seismodium", 0xFF46131D, true, 200, 10, 4000);
    public static BasicTinkerFluid terramiteFluid = new BasicTinkerFluid("terramite", 0xFFa6b27a, true, 200, 10, 4000);
    public static BasicTinkerFluid lumixylFluid = new BasicTinkerFluid("lumixyl", 0xFFfbe8cb, true, 200, 10, 4000);
    public static BasicTinkerFluid solariumFluid = new BasicTinkerFluid("solarium", 0xFFffc81d, true, 200, 10, 4000);
    public static BasicTinkerFluid dyoniteFluid = new BasicTinkerFluid("dyonite", 0xFFff6743, true, 200, 10, 4000);
    public static BasicTinkerFluid ultraniteFluid = new BasicTinkerFluid("ultranite", 0xFFf5f294, true, 200, 10, 4000);
    public static BasicTinkerFluid nucleumFluid = new BasicTinkerFluid("nucleum", 0xFFa8ea3b, true, 200, 10, 4000);
    public static BasicTinkerFluid aegisaltFluid = new BasicTinkerFluid("aegisalt", 0xFFb6af74, true, 200, 10, 4000);
    public static BasicTinkerFluid bysmuidFluid = new BasicTinkerFluid("bysmuid", 0xFF7b97b0, true, 200, 10, 4000);


    static void register() {
        Field[] declaredFields = Fluids.class.getDeclaredFields();
        for (Field field : declaredFields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                Class<?> targetType = field.getType();
                try {
                    BasicTinkerFluid fluid = (BasicTinkerFluid) field.get(targetType);

                    Utils.registerTinkerFluid(StringUtils.capitalize(fluid.getName()), fluid, fluid.isToolForge());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
