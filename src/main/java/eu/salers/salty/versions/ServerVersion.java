package eu.salers.salty.versions;

import eu.salers.salty.versions.server.SProtocolVersion;
import eu.salers.salty.versions.server.impl.*;
import org.bukkit.Bukkit;

//determine the server version
public class ServerVersion {

    public boolean isMC118() {
        return Bukkit.getBukkitVersion().contains("1.18");
    }

    public boolean isMC117() {
        return Bukkit.getBukkitVersion().contains("1.17");
    }

    public boolean isMC116() {
        return Bukkit.getBukkitVersion().contains("1.16");
    }

    public boolean isMC115() {
        return Bukkit.getBukkitVersion().contains("1.15");
    }

    public boolean isMC114() {
        return Bukkit.getBukkitVersion().contains("1.14");
    }

    public boolean isMC113() {
        return Bukkit.getBukkitVersion().contains("1.13");
    }

    public boolean isMC112() {
        return Bukkit.getBukkitVersion().contains("1.12");
    }

    public boolean isMC111() {
        return Bukkit.getBukkitVersion().contains("1.11");
    }

    public boolean isMC110() {
        return Bukkit.getBukkitVersion().contains("1.10");
    }

    public boolean isMC19() {
        return Bukkit.getBukkitVersion().contains("1.9");
    }

    public boolean isMC18() {
        return Bukkit.getBukkitVersion().contains("1.8");
    }

    public boolean isMC17() {
        return Bukkit.getBukkitVersion().contains("1.7");
    }

    /**
     * get the protocol class by the server version
     *
     * @return the protocol class related to the server's version
     */

    public SProtocolVersion getProtocolVersionClass() {

        if (isMC17())
            return new V1_7_R4();

        if (isMC18())
            return new V1_8_R3();

        if (isMC19())
            return new V1_9_R2(); //this one cuz it's 1.9.4 and 1.9.4 is more used than others 1.9.X

        if (isMC110())
            return new V1_10_R1();

        if (isMC111())
            return new V1_11_R1();

        if (isMC112())
            return new V1_12_R1();

        if (isMC113())
            return new V1_13_R2();  //this one cuz it's 1.13.2 and 1.13.2 is more used than others 1.13.X

        if (isMC114())
            return new V1_14_R1();

        if (isMC115())
            return null; //TODO SUPPORT 1.15

        if (isMC116())
            return new V1_16_R3();

        if (isMC117())
            return null; //TODO SUPPORT 1.17

        if (isMC118())
            return null; //TODO SUPPORT 1.18


        return new V1_8_R3(); //idk lol

    }


}
