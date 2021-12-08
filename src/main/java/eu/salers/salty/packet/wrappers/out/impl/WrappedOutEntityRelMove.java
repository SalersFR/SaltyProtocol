package eu.salers.salty.packet.wrappers.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;

public class WrappedOutEntityRelMove extends WrappedOutPacket {

    private double deltaX, deltaY, deltaZ;


    public WrappedOutEntityRelMove(Object instance) {
        super(instance, (Class<?>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), " PacketPlayOutEntity.PacketPlayOutRelEntityMove"));

        this.deltaX = get("b");
        this.deltaY = get("c");
        this.deltaZ = get("d");


    }

    public double getDeltaX() {
        return deltaX / 32.D;
    }

    public double getDeltaY() {
        return deltaY / 32.D;
    }

    public double getDeltaZ() {
        return deltaZ / 32.D;
    }
}
