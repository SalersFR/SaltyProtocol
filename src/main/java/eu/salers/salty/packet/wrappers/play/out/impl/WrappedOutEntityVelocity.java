package eu.salers.salty.packet.wrappers.play.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;

public class WrappedOutEntityVelocity extends WrappedOutPacket {

    public WrappedOutEntityVelocity(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayOutEntityVelocity"));


    }

    public double getX() {
        return ((int) get("b") / 8000.D);
    }

    public double getY() {
        return ((int) get("c") / 8000.D);
    }

    public double getZ() {
        return ((int) get("d") / 8000.D);
    }

}
