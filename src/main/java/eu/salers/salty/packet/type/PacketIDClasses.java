package eu.salers.salty.packet.type;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.utils.ReflectionUtils;
import eu.salers.salty.versions.ServerVersion;
import net.minecraft.server.v1_7_R4.PacketPlayOutPosition;
import net.minecraft.server.v1_9_R2.PacketPlayOutEntity;

import java.sql.Ref;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PacketIDClasses {

    /**
     * @key the packet class
     * @value the packet's id
     */
    private final Map<Class<?>, Integer> packetPlayInMap = new ConcurrentHashMap<>();
    private final Map<Class<?>, Integer> packetPlayOutMap = new ConcurrentHashMap<>();
    private final String NMS_PACKAGE;

    public PacketIDClasses(final SaltyAPI saltyAPI) {
        NMS_PACKAGE = saltyAPI
                .getServerVersion()
                .getProtocolVersionClass()
                .getPackageName();

    }

    //NB : i only added the most important packets for now
    public void loadPlayIn() {
        final ServerVersion serverVersion = SaltyAPI.get().getServerVersion();

        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTeleportAccept"), 0x00);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInEntityNBTQuery"), 0x01);
        if (serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyChange"), 0x02);

        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInChat"), 0x03);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTabComplete"), 0x06);
        if (serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118()) {
            //TODO INTERACT ENTITY PACKET
        } else {
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUseEntity"), 0x07);
        }

        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInWindowClick"), 0x08);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInCloseWindow"), 0x09);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBEdit"), 0x0B);

        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInKeepAlive"), 0x0F);

        if (serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyLock"), 0x10);

        //fuck 1.7
        if (serverVersion.isMC17())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPosition"), 0x11);
        else
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInPosition"), 0x11);


        if (serverVersion.isMC17())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPositionLook"), 0x12);
        else
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInPositionLook"), 0x12);

        if (serverVersion.isMC17())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInLook"), 0x13);
        else
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInLook"), 0x13);

        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying"), 0x14);

        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInVehicleMove"), 0x15);
        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPickItem"), 0x17);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInAbilities"), 0x19);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBlockDig"), 0x1A);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInEntityAction"), 0x1B);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInSteerVehicle"), 0x1C);


        if (serverVersion.isMC117() || serverVersion.isMC118()) {
            //TODO pong packet
        } else {
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTransaction"), 0x1D);
        }

        if (serverVersion.isMC112() || serverVersion.isMC113() ||
                serverVersion.isMC114())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInRecipeDisplayed"), 0x1F);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInItemName"), 0x20);
        if (!serverVersion.isMC17())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInResourcePackStatus"), 0x21);
        if (serverVersion.isMC112() || serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInAdvancements"), 0x22);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInHeldItemSlot"), 0x25);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUpdateSign"), 0x2B);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInArmAnimation"), 0x2C);
        if (!serverVersion.isMC17())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInSpectate"), 0x2D);
        packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBlockPlace"), 0x2E);
        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetPlayInMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUseItem"), 0x2F);

    }

    //NB : i only added the most important packets for now
    public void loadPlayOut() {
        final ServerVersion serverVersion = SaltyAPI.get().getServerVersion();

        //wrong ids but idfc
        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutSpawnEntity"), 0x00);
        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutSpawnEntityLiving"), 0x01);
        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutChat"), 0x0F);
        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutExplosion"), 0x1C);
        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutKeepAlive"), 0x20);

        if (serverVersion.isMC17())
            packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityRelMove"), 0x29);
        else
            packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE,
                    "PacketPlayOutEntity$PacketPlayOutEntityRelMove"), 0x29);

        if (serverVersion.isMC17())
            packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityRelMoveLook"), 0x2A);
        else
            packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE,
                    "PacketPlayOutEntity$PacketPlayOutEntityRelMoveLook"), 0x2A);

        if (serverVersion.isMC17())
            packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityLook"), 0x2B);
        else
            packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE,
                    "PacketPlayOutEntity$PacketPlayOutEntityLook"), 0x2B);

        if (serverVersion.isMC117() || serverVersion.isMC118()) {
            //TODO ping packet
        } else {
            packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutTransaction"), 0x30);
        }


        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityTeleport"), 0x62);
        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityVelocity"), 0x4F);
        packetPlayOutMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutPosition"), 0x65); //ik, it's wrong, but idfc












    }


    public Map<Class<?>, Integer> getPacketPlayInMap() {
        return packetPlayInMap;
    }

    public Map<Class<?>, Integer> getPacketPlayOutMap() {
        return packetPlayOutMap;
    }
}