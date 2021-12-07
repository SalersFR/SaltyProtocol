package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;
import net.minecraft.server.v1_9_R2.EntityPlayer;
import net.minecraft.server.v1_9_R2.NetworkManager;
import net.minecraft.server.v1_9_R2.PlayerConnection;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class V1_9_R2 extends SProtocolVersion {

    @Override
    public int getProtocolID(Player player) throws IllegalAccessException, NoSuchFieldException {
        final CraftPlayer craftPlayer = (CraftPlayer) player;
        final EntityPlayer entityPlayer = craftPlayer.getHandle();
        final PlayerConnection connection = entityPlayer.playerConnection;
        final NetworkManager networkManager = connection.networkManager;
        final Class networkManagerClass = networkManager.getClass();
        final Field protocolVersionField = networkManagerClass.getDeclaredField("protocolVersion");
        protocolVersionField.setAccessible(true);
        return protocolVersionField.getInt(networkManager);
    }

    @Override
    public String getDisplayName() {
        return "v1.9_R2";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_9_R2";
    }


}
