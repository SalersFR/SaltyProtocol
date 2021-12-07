package eu.salers.salty.event.impl;

import eu.salers.salty.event.SaltyPacketEvent;
import org.bukkit.entity.Player;

public class SaltyPacketOutSendEvent extends SaltyPacketEvent {

    public SaltyPacketOutSendEvent(Object packet, Player player) {
        super(packet, player);
    }
}
