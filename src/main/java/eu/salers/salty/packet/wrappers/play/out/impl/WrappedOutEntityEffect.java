package eu.salers.salty.packet.wrappers.play.out.impl;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.packet.wrappers.play.out.WrappedOutPacket;
import eu.salers.salty.utils.ReflectionUtils;
import org.bukkit.potion.PotionEffectType;

public class WrappedOutEntityEffect extends WrappedOutPacket {

    public WrappedOutEntityEffect(Object instance) {
        super(instance, ReflectionUtils.getClassByPackage(SaltyAPI.get().getServerVersion().
                getProtocolVersionClass().getPackageName(), "PacketPlayOutEntityEffect"));
    }

    public int getEntityId() {
        return get("a");
    }


    public PotionEffectType getEffectType() {
        return PotionEffectType.getById(get("b"));
    }

    public int getAmplifier() {
        return get("c");
    }
}
