package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;
import net.minecraft.server.v1_10_R1.EnumProtocol;

public class V1_10_R1 extends SProtocolVersion {


    @Override
    public String getDisplayName() {
        return "v1.10_R1";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_10_R1.";
    }

    //will make these methods abstract later
    public EnumProtocol getPlayEnumProtocol() {
        return EnumProtocol.PLAY;
    }


}
