package eu.salers.salty.packet.wrappers.play.in.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.in.WrappedInPacket;
import eu.salers.salty.utils.ReflectionUtils;

public class WrappedInTransaction extends WrappedInPacket {

    public WrappedInTransaction(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayInTransaction"));

    }

    public int getId() {
        return get("a");
    }

    public short getActionId() {
        return get("b");
    }

}
