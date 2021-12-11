package eu.salers.salty.packet.wrappers.play.in.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.in.WrappedInPacket;
import eu.salers.salty.utils.ReflectionUtils;


public class WrappedInFlying extends WrappedInPacket {


    public WrappedInFlying(Object instance) {
        super(instance, (Class<?>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayInFlying"));


    }

    public double getX() {
        return get("x");
    }

    public double getY() {
        return get("y");
    }

    public double getZ() {
        return get("z");
    }

    public float getYaw() {
        return get("yaw");
    }

    public float getPitch() {
        return get("pitch");
    }

    public boolean isOnGround() {
        return get("f");
    }

    public boolean isHasPos() {
        return get("hasPos");
    }

    public boolean isHasLook() {
        return get("hasLook");
    }
}
