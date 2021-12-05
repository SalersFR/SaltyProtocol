package eu.salers.salty.packet.wrappers;

import net.minecraft.server.v1_8_R3.Packet;

public abstract class WrappedPacket {

    private final Object handle;

    public WrappedPacket(final Object handle) {
        this.handle = handle;
    }

    public Packet getNMSPacket() {
        return (Packet) handle;
    }

}
