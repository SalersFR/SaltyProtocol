package eu.salers.salty.packet.wrappers.play.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;
import org.bukkit.potion.PotionEffectType;

public class WrappedOutRemoveEntityEffect extends WrappedOutPacket {

    public WrappedOutRemoveEntityEffect(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayOutRemoveEntityEffect"));
    }

    public PotionEffectType getEffectType() {
        return PotionEffectType.getById(get("b"));
    }

    public int getEntityId() {
        return get("a");
    }



}

