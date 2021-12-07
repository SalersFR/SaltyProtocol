package eu.salers.salty.event;

import org.bukkit.entity.Player;

public abstract class SaltyPacketEvent {

    private final Object packet;
    private final Player player;

    public SaltyPacketEvent(final Object packet, final Player player) {
        this.packet = packet;
        this.player = player;
    }

    public Object getPacket() {
        return packet;
    }

    public Player getPlayer() {
        return player;
    }
}
