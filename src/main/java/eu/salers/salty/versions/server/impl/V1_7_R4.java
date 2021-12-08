package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;
import net.minecraft.server.v1_7_R4.EntityPlayer;
import net.minecraft.server.v1_7_R4.EnumProtocol;
import net.minecraft.server.v1_7_R4.NetworkManager;
import net.minecraft.server.v1_7_R4.PlayerConnection;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class V1_7_R4 extends SProtocolVersion {

    @Override
    public int getProtocolID(final Player player) throws IllegalAccessException, NoSuchFieldException {
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
        return "v1.7.10_R4";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_7_R4";
    }

    //will make these methods abstract later
    public EnumProtocol getPlayEnumProtocol() {
        return EnumProtocol.PLAY;
    }





}
