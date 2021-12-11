package eu.salers.salty.versions.server.impl;

import eu.salers.salty.versions.server.SProtocolVersion;

import net.minecraft.server.v1_8_R3.EnumProtocol;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.NetworkManager;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class V1_8_R3 extends SProtocolVersion {


    @Override
    public String getDisplayName() {
        return "v1.8_R3";
    }

    @Override
    public String getPackageName() {
        return "net.minecraft.server.v1_8_R3";
    }

    //will make these methods abstract later
    public EnumProtocol getPlayEnumProtocol() {
        return EnumProtocol.PLAY;
    }


}
