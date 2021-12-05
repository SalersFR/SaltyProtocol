package eu.salers.salty;

import eu.salers.salty.manager.ProfilesManager;
import eu.salers.salty.versions.ServerVersion;
import org.bukkit.plugin.java.JavaPlugin;

public class SaltyAPI {

    private final ServerVersion serverVersion = new ServerVersion();
    private final static SaltyAPI INSTANCE = new SaltyAPI();
    private final ProfilesManager profilesManager = new ProfilesManager();

    /**
     * i call this method to setup the whole thing
     *
     * @param javaPlugin the provided plugin instance
     */

    public void load(final JavaPlugin javaPlugin) {

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

    public static SaltyAPI get() {
        return INSTANCE;
    }


}
