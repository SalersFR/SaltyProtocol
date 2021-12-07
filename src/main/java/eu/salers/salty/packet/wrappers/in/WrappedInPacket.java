package eu.salers.salty.packet.wrappers.in;

import eu.salers.salty.packet.wrappers.WrappedPacket;
import net.minecraft.server.v1_8_R3.Packet;

public abstract class WrappedInPacket extends WrappedPacket {


    public WrappedInPacket(Packet<?> instance, Class<? extends Packet<?>> clazz) {
        super(instance, clazz);
    }
}
