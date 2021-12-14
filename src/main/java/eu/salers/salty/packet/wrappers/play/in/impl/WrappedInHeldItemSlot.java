package eu.salers.salty.packet.wrappers.play.in.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.in.WrappedInPacket;
import eu.salers.salty.utils.ReflectionUtils;

public class WrappedInHeldItemSlot extends WrappedInPacket {

    public WrappedInHeldItemSlot(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayInHeldItemSlot"));
    }

    public int getSlot() {
        return get("itemInHandIndex");
    }


}
