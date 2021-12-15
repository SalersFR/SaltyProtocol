package eu.salers.salty.event.impl;

import eu.salers.salty.event.SaltyPacketEvent;
import eu.salers.salty.packet.type.PacketType;
import org.bukkit.entity.Player;

public class SaltyPacketInReceiveEvent extends SaltyPacketEvent {


    public SaltyPacketInReceiveEvent(Object packet, Player player, PacketType packetType, long time) {
        super(packet, player, packetType, time);
    }
}
