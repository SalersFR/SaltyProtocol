package eu.salers.salty.packet.wrappers.out;

import eu.salers.salty.packet.wrappers.WrappedPacket;


public abstract class WrappedOutPacket extends WrappedPacket {


    public WrappedOutPacket(Object instance, Class<?> clazz) {
        super(instance, clazz);
    }
}
