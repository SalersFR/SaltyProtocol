package eu.salers.salty;

import eu.salers.salty.event.impl.SaltyPacketInReceiveEvent;
import eu.salers.salty.event.impl.SaltyPacketOutSendEvent;
import eu.salers.salty.event.listener.SaltyPacketListener;
import eu.salers.salty.packet.type.PacketType;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        SaltyAPI.get().load(this);
        SaltyAPI.get().getEventManager().registerListener(new SaltyPacketListener() {
            @Override
            public void onPacketInReceive(SaltyPacketInReceiveEvent event) {
                if(event.getPacketType() == PacketType.IN_CHAT)
                    Bukkit.broadcastMessage("you're awesome !");
            }

            @Override
            public void onPacketOutSend(SaltyPacketOutSendEvent event) {

            }
        });
    }

    @Override
    public void onDisable() {
        SaltyAPI.get().disable(this);
    }
}
