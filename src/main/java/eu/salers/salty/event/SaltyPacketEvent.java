package eu.salers.salty.event;

import eu.salers.salty.packet.type.PacketType;
import org.bukkit.entity.Player;

public abstract class SaltyPacketEvent {

    private final Object packet;
    private final Player player;
    private final PacketType packetType;

    public SaltyPacketEvent(final Object packet, final Player player, final PacketType packetType) {
        this.packet = packet;
        this.player = player;
        this.packetType = packetType;
    }

    public Object getPacket() {
        return packet;
    }

    public Player getPlayer() {
        return player;
    }

    public PacketType getPacketType() {
        return packetType;
    }
}
