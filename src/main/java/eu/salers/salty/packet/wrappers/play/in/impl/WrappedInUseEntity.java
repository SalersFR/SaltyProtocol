package eu.salers.salty.packet.wrappers.play.in.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.in.WrappedInPacket;
import eu.salers.salty.utils.ReflectionUtils;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;

import java.util.Locale;

public class WrappedInUseEntity extends WrappedInPacket {


    public WrappedInUseEntity(Object instance) {
        super(instance, (Class<?>) ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion()
                .getProtocolVersionClass().getPackageName(), "PacketPlayInUseEntity"));


    }

    /**
     * this method is more optimized than the one just down
     *
     * @param world the world which contains the entity
     * @return the hurt entity
     */

    public Entity getHurtEntity(final World world) {
        for (final Entity entities : world.getEntities()) {
            if (entities.getEntityId() == getEntityId())
                return entities;

        }
        return null;
    }

    //same as above but it's a lag bomb
    public Entity getHurtEntity() {
        for (World worlds : Bukkit.getWorlds()) {
            return getHurtEntity(worlds);
        }
        return null;
    }

    public UseEntityAction getUseAction() {
        return UseEntityAction.get(get("action").toString());
    }

    public int getEntityId() {
        return get("a");
    }

    public static enum UseEntityAction {
        INTERACT,
        ATTACK,
        INTERACT_AT;

        public static UseEntityAction get(final String name) {
            if (name.toLowerCase(Locale.ROOT).contains("interact"))
                return INTERACT;
            if (name.toLowerCase(Locale.ROOT).contains("attack"))
                return ATTACK;
            if (name.toLowerCase(Locale.ROOT).contains("interact_at"))
                return INTERACT_AT;

            return ATTACK;//idk
        }


    }

}
