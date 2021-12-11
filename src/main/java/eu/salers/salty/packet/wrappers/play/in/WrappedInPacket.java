package eu.salers.salty.packet.wrappers.play.in;

import eu.salers.salty.packet.wrappers.WrappedPacket;

public abstract class WrappedInPacket extends WrappedPacket {


    public WrappedInPacket(Object instance, Class<?> clazz) {
        super(instance, clazz);
    }
}
