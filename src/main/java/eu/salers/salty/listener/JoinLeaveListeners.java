package eu.salers.salty.listener;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.handle.GeneralPacketHandler;
import eu.salers.salty.player.profile.ProfilePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class JoinLeaveListeners implements Listener {

    public JoinLeaveListeners(final JavaPlugin javaPlugin) {
        javaPlugin.getServer().getPluginManager().registerEvents(this, javaPlugin);
    }

    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {

        GeneralPacketHandler.inject(event.getPlayer());

    }
}
