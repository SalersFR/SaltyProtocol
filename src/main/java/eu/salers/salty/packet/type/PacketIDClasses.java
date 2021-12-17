package eu.salers.salty.packet.type;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.utils.ReflectionUtils;
import eu.salers.salty.versions.ServerVersion;

import java.sql.Ref;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PacketIDClasses {

    /**
     * @key the packet class
     * @value the packet's id
     */
    private final Map<Class<?>, Integer> packetMap = new ConcurrentHashMap<>();
    private final String NMS_PACKAGE;

    public PacketIDClasses(final SaltyAPI saltyAPI) {
        NMS_PACKAGE = saltyAPI
                .getServerVersion()
                .getProtocolVersionClass()
                .getPackageName();

    }

    //NB : i only added the most important packets for now
    public void loadPlay() {
        final ServerVersion serverVersion = SaltyAPI.get().getServerVersion();

        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTeleportAccept"), 0x00);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInEntityNBTQuery"), 0x01);
        if (serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyChange"), 0x02);

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInChat"), 0x03);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTabComplete"), 0x06);
        if (serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118()) {
            //TODO INTERACT ENTITY PACKET
        } else {
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUseEntity"), 0x07);
        }

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInWindowClick"), 0x08);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInCloseWindow"), 0x09);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBEdit"), 0x0B);

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInKeepAlive"), 0x0F);

        if (serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyLock"), 0x10);

        //fuck 1.7
        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPosition"), 0x11);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInPosition"), 0x11);


        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPositionLook"), 0x12);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInPositionLook"), 0x12);

        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInLook"), 0x13);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInLook"), 0x13);

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying"), 0x14);

        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInVehicleMove"), 0x15);
        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPickItem"), 0x17);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInAbilities"), 0x19);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBlockDig"), 0x1A);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInEntityAction"), 0x1B);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInSteerVehicle"), 0x1C);


        if (serverVersion.isMC117() || serverVersion.isMC118()) {
            //TODO pong packet
        } else {
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTransaction"), 0x1D);
        }

        if (serverVersion.isMC112() || serverVersion.isMC113() ||
                serverVersion.isMC114())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInRecipeDisplayed"), 0x1F);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInItemName"), 0x20);
        if (!serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInResourcePackStatus"), 0x21);
        if (serverVersion.isMC112() || serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInAdvancements"), 0x22);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInHeldItemSlot"), 0x25);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUpdateSign"), 0x2B);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInArmAnimation"), 0x2C);
        if (!serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInSpectate"), 0x2D);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBlockPlace"), 0x2E);
        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUseItem"), 0x2F);

        //wrong ids but idfc
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutSpawnEntity"), 0x100);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutNamedEntitySpawn"), 0x101);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutSpawnEntityLiving"), 0x102);


        /**
        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityRelMove"), 0x103);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntity$PacketPlayOutEntityRelMove"), 0x103);

        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityRelMoveLook"), 0x104);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntity$PacketPlayOutEntityRelMoveLook"), 0x104);
         **/

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutEntityVelocity"), 0x105);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutExplosion"), 0x106);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutBlockChange"), 0x107);

        if (serverVersion.isMC117() || serverVersion.isMC118()) {
            //TODO pong packet
        } else {
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutTransaction"), 0x108);
        }

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayOutPosition"), 0x109);

    }




    public Map<Class<?>, Integer> getPacketMap() {
        return packetMap;
    }
}