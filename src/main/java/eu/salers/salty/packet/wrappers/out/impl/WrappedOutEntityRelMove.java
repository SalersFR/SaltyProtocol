package eu.salers.salty.packet.wrappers.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;

public class WrappedOutEntityRelMove extends WrappedOutPacket {


    public WrappedOutEntityRelMove(Object instance) {
        super(instance, (Class<?>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), " PacketPlayOutEntity.PacketPlayOutRelEntityMove"));


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
        return get("z");
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
