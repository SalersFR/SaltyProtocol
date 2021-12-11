package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;
import net.minecraft.server.v1_16_R3.EnumProtocol;

public class V1_16_R3 extends SProtocolVersion {


    @Override
    public String getDisplayName() {
        return "v1.16_R3";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_16_R3";
    }

    //will make these methods abstract later
    public EnumProtocol getPlayEnumProtocol() {
        return EnumProtocol.PLAY;
    }


}
