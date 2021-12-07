package eu.salers.salty.event.listener;

import eu.salers.salty.event.impl.SaltyPacketInReceiveEvent;
import eu.salers.salty.event.impl.SaltyPacketOutSendEvent;
import org.bukkit.event.Listener;

public abstract class SaltyPacketListener {


    public abstract void onPacketInReceive(final SaltyPacketInReceiveEvent event);

    public abstract void onPacketOutSend(final SaltyPacketOutSendEvent event);
}
