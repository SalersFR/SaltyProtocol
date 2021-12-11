package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;
import net.minecraft.server.v1_9_R2.EnumProtocol;

public class V1_9_R2 extends SProtocolVersion {


    @Override
    public String getDisplayName() {
        return "v1.9_R2";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_9_R2";
    }

    //will make these methods abstract later
    public EnumProtocol getPlayEnumProtocol() {
        return EnumProtocol.PLAY;
    }


}
