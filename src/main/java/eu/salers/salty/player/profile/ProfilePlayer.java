package eu.salers.salty.player.profile;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.player.version.ClientVersion;
import org.bukkit.entity.Player;

/**
 * Object used to store info such as client/protocol version and other stuff
 */
public class ProfilePlayer {

    //the original bukkit player
    private final Player player;

    //client version (displayed)
    private ClientVersion clientVersion;


    public ProfilePlayer(Player player) {
        this.player = player;
    }

    public void setup() throws NoSuchFieldException, IllegalAccessException {
        this.clientVersion = new ClientVersion(SaltyAPI.get().getServerVersion().getProtocolVersionClass().getProtocolID(player));


    }


}
