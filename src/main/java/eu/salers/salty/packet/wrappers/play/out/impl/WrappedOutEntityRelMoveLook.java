package eu.salers.salty.packet.wrappers.play.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;

public class WrappedOutEntityRelMoveLook extends WrappedOutPacket {

    public WrappedOutEntityRelMoveLook(Object instance) {
        super(instance, (Class<?>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), SaltyAPI.get().getServerVersion().isMC17()
                ? "PacketPlayOutEntityRelMoveLook" : "PacketPlayOutEntity$PacketPlayOutEntityRelMoveLook"));
    }

    public int getEntityId() {
        return get("a");
    }

    private double getRawDeltaX() {
        return get("b");
    }

    private double getRawDeltaY() {
        return get("c");
    }

    private double getRawDeltaZ() {
        return get("d");
    }

    public float getYaw() {
        return get("e");
    }

    public float getPitch() {
        return get("f");
    }


    public double getDeltaX() {
        return getRawDeltaX() / 32.D;
    }

    public double getDeltaY() {
        return getRawDeltaY() / 32.D;
    }

    public double getDeltaZ() {
        return getRawDeltaZ() / 32.D;
    }


}
