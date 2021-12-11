package eu.salers.salty.player.profile;

import eu.salers.salty.packet.wrappers.handshake.impl.WrappedInHandshake;
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

    public void handleHandshake(final WrappedInHandshake wrappedHandshakePacket) {
        this.clientVersion = new ClientVersion(wrappedHandshakePacket.getProtocolID());
    }

    public Player getPlayer() {
        return player;
    }

    public ClientVersion getClientVersion() {
        return clientVersion;
    }
}
