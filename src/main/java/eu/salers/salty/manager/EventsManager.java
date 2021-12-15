package eu.salers.salty.manager;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.event.impl.SaltyPacketInReceiveEvent;
import eu.salers.salty.event.impl.SaltyPacketOutSendEvent;
import eu.salers.salty.event.listener.SaltyPacketListener;
import eu.salers.salty.packet.type.PacketType;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class EventsManager {

    private final List<SaltyPacketListener> listeners;

    public EventsManager() {
        this.listeners = new LinkedList<>();
    }

    public void registerListener(final SaltyPacketListener saltyPacketListener) {
        this.listeners.add(saltyPacketListener);
    }

    public void unregisterListener(final SaltyPacketListener saltyPacketListener) {
        this.listeners.remove(saltyPacketListener);
    }

    public void handleReceive(final Object packet, final Player player) {
        if (SaltyAPI.get().getPacketIDClasses().getPacketMap().values().isEmpty()) return;

        final PacketType packetType = PacketType.getById(SaltyAPI.get().getPacketIDClasses().getPacketMap().get(packet.getClass()));

        if (packetType == null) return;

        for (final SaltyPacketListener listeners : listeners)
            listeners.onPacketInReceive(new SaltyPacketInReceiveEvent(packet, player,
                    packetType, System.currentTimeMillis()));


    }

    public void handleSend(final Object packet, final Player player) {
        if (SaltyAPI.get().getPacketIDClasses().getPacketMap().values().isEmpty()) {
            return;
        } else {
            if (packet == null) {
                Objects.requireNonNull(packet).toString();
            }
        }

        final Integer packetIDClass = SaltyAPI.get().getPacketIDClasses().getPacketMap().get(packet.getClass());

        if(packetIDClass == null || packetIDClass == 0) return;

        final PacketType packetType = PacketType.getById(SaltyAPI.get().getPacketIDClasses().getPacketMap().get(packet.getClass()));

        if (packetType == null) return;

        for (final SaltyPacketListener listeners : listeners)
            listeners.onPacketOutSend(new SaltyPacketOutSendEvent(packet, player, packetType, System.currentTimeMillis()));


    }

}
