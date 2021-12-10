package eu.salers.salty.event.impl;

import eu.salers.salty.event.SaltyPacketEvent;
import eu.salers.salty.packet.type.PacketType;
import org.bukkit.entity.Player;

public class SaltyPacketOutSendEvent extends SaltyPacketEvent {


    public SaltyPacketOutSendEvent(Object packet, Player player, PacketType packetType) {
        super(packet, player, packetType);
    }
}
