package eu.salers.salty.packet.wrappers.in.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.in.WrappedInPacket;
import eu.salers.salty.utils.ReflectionUtils;
import net.minecraft.server.v1_8_R3.Packet;

public class WrappedInFlying extends WrappedInPacket {

    public WrappedInFlying(Packet<?> instance) {
        super(instance, (Class<? extends Packet<?>>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayInFlying"));

    }


}
