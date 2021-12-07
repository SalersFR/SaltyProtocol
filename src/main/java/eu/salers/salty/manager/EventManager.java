package eu.salers.salty.manager;

import eu.salers.salty.event.impl.SaltyPacketInReceiveEvent;
import eu.salers.salty.event.impl.SaltyPacketOutSendEvent;
import eu.salers.salty.event.listener.SaltyPacketListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class EventManager {

    private final List<SaltyPacketListener> listeners;

    public EventManager() {
        this.listeners = new LinkedList<>();
    }

    public void registerListener(final SaltyPacketListener saltyPacketListener) {
        this.listeners.add(saltyPacketListener);
    }

    public void unregisterListener(final SaltyPacketListener saltyPacketListener) {
        this.listeners.remove(saltyPacketListener);
    }

    public void handleReceive(final Object packet , final Player player) {
        for(final SaltyPacketListener listeners : listeners)
            listeners.onPacketInReceive(new SaltyPacketInReceiveEvent(packet, player));

    }

    public void handleSend(final Object packet , final Player player) {
        for(final SaltyPacketListener listeners : listeners)
            listeners.onPacketOutSend(new SaltyPacketOutSendEvent(packet, player));
    }
}
