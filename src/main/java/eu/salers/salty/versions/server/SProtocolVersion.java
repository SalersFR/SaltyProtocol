package eu.salers.salty.versions.server;

import org.bukkit.entity.Player;

public abstract class SProtocolVersion {

    public abstract int getProtocolID(final Player player) throws IllegalAccessException, NoSuchFieldException;

    public abstract String getDisplayName();

    public abstract String getPackageName();


}
