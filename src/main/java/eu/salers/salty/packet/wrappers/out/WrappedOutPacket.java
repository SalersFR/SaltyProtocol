package eu.salers.salty.packet.wrappers.out;

import eu.salers.salty.packet.wrappers.WrappedPacket;
import net.minecraft.server.v1_8_R3.Packet;

public abstract class WrappedOutPacket extends WrappedPacket {


    public WrappedOutPacket(Packet<?> instance, Class<? extends Packet<?>> clazz) {
        super(instance, clazz);
    }
}
