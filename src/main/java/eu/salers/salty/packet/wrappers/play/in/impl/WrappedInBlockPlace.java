package eu.salers.salty.packet.wrappers.play.in.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.in.WrappedInPacket;
import eu.salers.salty.utils.ReflectionUtils;

import net.minecraft.server.v1_8_R3.BaseBlockPosition;
import org.bukkit.util.Vector;

import java.lang.reflect.Field;

public class WrappedInBlockPlace extends WrappedInPacket {

    public WrappedInBlockPlace(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayInBlockPlace"));
    }


    public Object getBlockPosition() {
        final Object blockPosField = get("b");
        final Class<?> baseBlockPosition = ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "BaseBlockPosition");
        final Class<?> blockPosition = getBlockPosition().getClass().cast(baseBlockPosition).getClass();
        return blockPosition;
    }

    private Field getBlockFieldX() throws NoSuchFieldException {
        return getBlockPosition().getClass().getDeclaredField("a");
    }

    private Field getBlockFieldY() throws NoSuchFieldException {
        return getBlockPosition().getClass().getDeclaredField("c");
    }

    private Field getBlockFieldZ() throws NoSuchFieldException {
        return getBlockPosition().getClass().getDeclaredField("d");
    }

    public double getBlockX() throws NoSuchFieldException, IllegalAccessException {
        return getBlockFieldX().getDouble(getBlockPosition());
    }

    public double getBlockY() throws NoSuchFieldException, IllegalAccessException {
        return getBlockFieldY().getDouble(getBlockPosition());
    }

    public double getBlockZ() throws NoSuchFieldException, IllegalAccessException {
        return getBlockFieldZ().getDouble(getBlockPosition());
    }






}
