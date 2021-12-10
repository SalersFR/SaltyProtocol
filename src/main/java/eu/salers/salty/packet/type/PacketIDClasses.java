package eu.salers.salty.packet.type;

import eu.salers.salty.SaltyAPI;
import eu.salers.salty.utils.ReflectionUtils;
import net.minecraft.server.v1_13_R1.PacketPlayInFlying;
import net.minecraft.server.v1_7_R4.PacketPlayInPositionLook;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PacketIDClasses {

    /**
     * @key the packet class
     * @value the packet's id
     */
    private final Map<Class<?>, Integer> packetMap = new ConcurrentHashMap<>();
    private final static String NMS_PACKAGE = SaltyAPI.get().getServerVersion().getProtocolVersionClass().getPackageName();

    private void loadPlayIn() {
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTeleportAccept").getClass(), 0x00);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInEntityNBTQuery").getClass(), 0x01);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyChange").getClass(), 0x02);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInChat").getClass(), 0x03);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInTabComplete").getClass(), 0x06);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInWindowClick").getClass(), 0x08);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInCloseWindow").getClass(), 0x09);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInBEdit").getClass(), 0x0B);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInKeepAlive").getClass(), 0x0F);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInDifficultyLock").getClass(), 0x10);

        //fuck 1.7
        if(SaltyAPI.get().getServerVersion().isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPosition").getClass(), 0x11);
        else
            packetMap.put(ReflectionUtils.getSubClass(ReflectionUtils.getClassByPackage(NMS_PACKAGE,
                    "PacketPlayInFlying").getClass(), "PacketPlayInPosition"), 0x11);

        if(SaltyAPI.get().getServerVersion().isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPositionLook").getClass(), 0x11);
        else
            packetMap.put(ReflectionUtils.getSubClass(ReflectionUtils.getClassByPackage(NMS_PACKAGE,
                    "PacketPlayInFlying").getClass(), "PacketPlayInPositionLook"), 0x12);

        if(SaltyAPI.get().getServerVersion().isMC17())
            packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInLook").getClass(), 0x13);
        else
            packetMap.put(ReflectionUtils.getSubClass(ReflectionUtils.getClassByPackage(NMS_PACKAGE,
                    "PacketPlayInFlying").getClass(), "PacketPlayInLook"), 0x13);

        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInFlying").getClass(), 0x14);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInVehicleMove").getClass(), 0x15);
        packetMap.put(ReflectionUtils.getClassByPackage(NMS_PACKAGE, "PacketPlayInPickItem").getClass(), 0x17);















    }


}
