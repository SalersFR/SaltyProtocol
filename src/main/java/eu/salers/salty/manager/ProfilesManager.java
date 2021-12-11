package eu.salers.salty.manager;

import eu.salers.salty.player.profile.ProfilePlayer;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProfilesManager {

    /**
     * Data cache
     **/
    private final Map<Player, ProfilePlayer> playerDataMap = new ConcurrentHashMap<>();

    /**
     * Getting a PlayerData from the cache
     *
     * @param player the player for getting a PlayerData
     * @return a PlayerData from the param player
     **/

    public ProfilePlayer getPlayerData(final Player player) {
        return this.playerDataMap.get(player);
    }

    /**
     * Adding a PlayerData to a cache
     *
     * @param player the player to add in the cache and a new instance of a PlayerData
     */

    public void add(final Player player) {
        this.playerDataMap.put(player, new ProfilePlayer(player));
    }

    /**
     * Removing a PlayerData from the cache
     *
     * @param player the player to remove in the cache and also remove the PlayerData reliated to the player
     */

    public void remove(final Player player) {
        this.playerDataMap.remove(player, this.getPlayerData(player));
    }

}
