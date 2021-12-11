package eu.salers.salty.packet.type;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.utils.ReflectionUtils;
import eu.salers.salty.versions.ServerVersion;

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
    public void loadPlayIn() {
        final ServerVersion serverVersion = SaltyAPI.get().getServerVersion();

        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTeleportAccept").getClass(), 0x00);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInEntityNBTQuery").getClass(), 0x01);
        if (serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyChange").getClass(), 0x02);

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInChat").getClass(), 0x03);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTabComplete").getClass(), 0x06);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInWindowClick").getClass(), 0x08);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInCloseWindow").getClass(), 0x09);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBEdit").getClass(), 0x0B);

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInKeepAlive").getClass(), 0x0F);

        if (serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyLock").getClass(), 0x10);

        //fuck 1.7
        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPosition").getClass(), 0x11);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInPosition").getClass(), 0x11);


        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPositionLook").getClass(), 0x12);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInPositionLook").getClass(), 0x12);

        if (serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInLook").getClass(), 0x13);
        else
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying$PacketPlayInLook").getClass(), 0x13);

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying").getClass(), 0x14);

        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInVehicleMove").getClass(), 0x15);
        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPickItem").getClass(), 0x17);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInAbilities").getClass(), 0x19);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBlockDig").getClass(), 0x1A);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInEntityAction").getClass(), 0x1B);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInSteerVehicle").getClass(), 0x1C);


        if (SaltyAPI.get().getServerVersion().isMC117() || SaltyAPI.get().getServerVersion().isMC118()) {
            //TODO pong packet
        } else {
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTransaction").getClass(), 0x1D);
        }

        if (serverVersion.isMC112() || serverVersion.isMC113() ||
                serverVersion.isMC114())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInRecipeDisplayed").getClass(), 0x1F);

        if (serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInItemName").getClass(), 0x20);
        if (!serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInResourcePackStatus").getClass(), 0x21);
        if (serverVersion.isMC112() || serverVersion.isMC113() || serverVersion.isMC114() || serverVersion.isMC115() ||
                serverVersion.isMC116() || serverVersion.isMC117() || serverVersion.isMC118())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInAdvancements").getClass(), 0x22);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInHeldItemSlot").getClass(), 0x25);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUpdateSign").getClass(), 0x2B);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInArmAnimation").getClass(), 0x2C);
        if (!serverVersion.isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInSpectate").getClass(), 0x2D);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBlockPlace").getClass(), 0x2E);
        if (!serverVersion.isMC17() && !serverVersion.isMC18())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInUseItem").getClass(), 0x2F);

    }

    public Map<Class<?>, Integer> getPacketMap() {
        return packetMap;
    }
}
