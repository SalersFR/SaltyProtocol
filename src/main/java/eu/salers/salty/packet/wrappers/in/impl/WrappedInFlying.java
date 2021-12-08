package eu.salers.salty.packet.wrappers.in.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.in.WrappedInPacket;
import eu.salers.salty.utils.ReflectionUtils;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayInFlying;

public class WrappedInFlying extends WrappedInPacket {

    private double x,y,z;
    private float yaw, pitch;
    private boolean onGround ,hasPos, hasLook;

    public WrappedInFlying(Packet<?> instance) {
        super(instance, (Class<? extends Packet<?>>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayInFlying"));

        x = get("x");
        y = get("y");
        z = get("z");
        yaw = get("yaw");
        pitch = get("pitch");
        onGround = get("f");
        hasPos = get("hasPos");
        hasLook = get("hasLook");

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public boolean isHasPos() {
        return hasPos;
    }

    public boolean isHasLook() {
        return hasLook;
    }
}
