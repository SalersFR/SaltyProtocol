package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;
import net.minecraft.server.v1_7_R4.EnumProtocol;

public class V1_7_R4 extends SProtocolVersion {


    @Override
    public String getDisplayName() {
        return "v1.7.10_R4";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_7_R4";
    }

    //will make these methods abstract later
    public EnumProtocol getPlayEnumProtocol() {
        return EnumProtocol.PLAY;
    }


}
