package eu.salers.salty.packet.wrappers.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayOutEntity;

public class WrappedOutEntityRelMove extends WrappedOutPacket {


    public WrappedOutEntityRelMove(Packet<?> instance) {
        super(instance, (Class<? extends Packet<?>>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), " PacketPlayOutEntity.PacketPlayOutRelEntityMove"));


    }


}
