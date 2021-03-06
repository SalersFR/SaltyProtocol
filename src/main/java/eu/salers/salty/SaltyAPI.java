package eu.salers.salty;

import eu.salers.salty.listener.JoinLeaveListeners;
import eu.salers.salty.manager.EventsManager;
import eu.salers.salty.manager.ProfilesManager;
import eu.salers.salty.packet.type.PacketIDClasses;
import eu.salers.salty.versions.ServerVersion;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SaltyAPI {


    private final static SaltyAPI INSTANCE = new SaltyAPI();
    private final ServerVersion serverVersion = new ServerVersion();
    private final ProfilesManager profilesManager = new ProfilesManager();
    private final EventsManager eventManager = new EventsManager();

    private final PacketIDClasses packetIDClasses = new PacketIDClasses(this);

    private final ExecutorService handlerService = Executors.newSingleThreadExecutor();

    public static SaltyAPI get() {
        return INSTANCE;
    }

    /**
     * i call this method to setup the whole thing
     *
     * @param javaPlugin the provided plugin instance
     */

    public void load(final JavaPlugin javaPlugin) {
        new JoinLeaveListeners(javaPlugin);
        this.packetIDClasses.loadPlay();


    }

    /**
     * i call this method to just disable it and prevent memory leaks
     *
     * @param javaPlugin the provided plugin instance
     */
    public void disable(final JavaPlugin javaPlugin) {


    }

    public ServerVersion getServerVersion() {
        return serverVersion;
    }

    public ProfilesManager getProfilesManager() {
        return profilesManager;
    }

    public ExecutorService getHandlerService() {
        return handlerService;
    }

    public EventsManager getEventManager() {
        return eventManager;
    }

    public PacketIDClasses getPacketIDClasses() {
        return packetIDClasses;
    }
}
