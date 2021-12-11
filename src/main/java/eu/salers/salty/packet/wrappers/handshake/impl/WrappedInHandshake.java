package eu.salers.salty.packet.wrappers.handshake.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.handshake.WrappedHandshakePacket;
import eu.salers.salty.utils.ReflectionUtils;


public class WrappedInHandshake extends WrappedHandshakePacket {

    public WrappedInHandshake(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().getProtocolVersionClass()
                .getPackageName(), "PacketHandshakingInSetProtocol").getClass());
    }

    public int getProtocolID() {
        return get("a");
    }



}
