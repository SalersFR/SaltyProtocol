package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;
import net.minecraft.server.v1_10_R1.EntityPlayer;
import net.minecraft.server.v1_10_R1.NetworkManager;
import net.minecraft.server.v1_10_R1.PlayerConnection;
import net.minecraft.server.v1_10_R1.EnumProtocol;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class V1_10_R1 extends SProtocolVersion {
    
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
        return "v1.10_R1";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_10_R1.";
    }

    //will make these methods abstract later
    public EnumProtocol getPlayEnumProtocol() {
        return EnumProtocol.PLAY;
    }


}
