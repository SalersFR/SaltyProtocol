package eu.salers.salty.packet.wrappers.play.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;

public class WrappedOutPosition extends WrappedOutPacket {

    public WrappedOutPosition(Object instance, Class<?> clazz) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().getProtocolVersionClass().
                getPackageName(), "PacketPlayOutPosition"));
    }

    public double getX() {
        return get("a");
    }

    public double getY() {
        return get("b");
    }

    public double getZ() {
        return get("c");
    }

    public float getYaw() {
        return get("d");
    }

    public float getPitch() {
        return get("e");
    }
}
