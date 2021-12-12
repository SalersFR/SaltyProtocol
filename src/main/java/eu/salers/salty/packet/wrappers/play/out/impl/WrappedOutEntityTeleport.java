package eu.salers.salty.packet.wrappers.play.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;
import net.minecraft.server.v1_9_R2.PacketPlayOutEntityTeleport;

public class WrappedOutEntityTeleport extends WrappedOutPacket {

    public WrappedOutEntityTeleport(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().getProtocolVersionClass()
                .getPackageName(), "PacketPlayOutEntityTeleport"));
    }

    public int getEntityId() {
        return get("a");
    }

    private double getRawX() {
        return get("b");
    }

    private double getRawY() {
        return get("c");
    }

    private double getRawZ() {
        return get("d");
    }

    public double getX() {
        return getRawX() / 32.D;
    }

    public double getY() {
        return getRawY() / 32.D;
    }

    public double getZ() {
        return getRawZ() / 32.D;
    }


}
