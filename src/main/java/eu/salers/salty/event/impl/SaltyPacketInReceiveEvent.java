package eu.salers.salty.event.impl;

import eu.salers.salty.event.SaltyPacketEvent;
import org.bukkit.entity.Player;

public class SaltyPacketInReceiveEvent extends SaltyPacketEvent {

    public SaltyPacketInReceiveEvent(Object packet, Player player) {
        super(packet, player);
    }
}
