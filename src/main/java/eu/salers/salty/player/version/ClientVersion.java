package eu.salers.salty.player.version;

public class ClientVersion {


    //the protocol id (eg: 1.7.10's id is 5)
    private int protocolID;

    public ClientVersion(int protocolID) {
        this.protocolID = protocolID;
    }

    /**
     * just to have a more easy-to-understand version display
     *
     * @return the version name (like 1.8) associated to the protocol version
     */

    public String getDisplayName() {
        switch (protocolID) {
            case 5:
                return "1.7.10";
            case 47:
                return "1.8"; //1.8 - 1.8.9 exactly*
            case 107:
                return "1.9";
            case 108:
                return "1.9.1";
            case 109:
                return "1.9.2";
            case 110:
                return "1.9.4"; //1.9.3 also use that protocol id, but since 1.9.4 is more used...
            case 210:
                return "1.10";
            case 315:
                return "1.11";
            case 316:
                return "1.11.2"; //1.11.1 also use that protocol id, but since 1.11.2 is more used...
            case 335:
                return "1.12";
            case 338:
                return "1.12.1";
            case 340:
                return "1.12.2";
            case 393:
                return "1.13";
            case 401:
                return "1.13.1";
            case 404:
                return "1.13.2";
            case 477:
                return "1.14";
            case 480:
                return "1.14.1";
            case 485:
                return "1.14.2";
            case 490:
                return "1.14.3";
            case 498:
                return "1.14.4";
            case 573:
                return "1.15";
            case 575:
                return "1.15.1";
            case 578:
                return "1.15.2";
            case 735:
                return "1.16";
            case 736:
                return "1.16.1";
            case 751:
                return "1.16.2";
            case 753:
                return "1.16.3";
            case 754:
                return "1.16.5"; //1.16.5 also use that protocol id, but since 1.16.5 is more used...
            case 755:
                return "1.17";
            case 756:
                return "1.17.1";
            case 757:
                return "1.18";

        }

        return "";
    }

    public int getProtocolId() {
        return protocolID;
    }

    /**
     * can be useful
     *
     * @param name the name that we use to get the protocolId
     * @return the protocolId related to the version name
     */

    public int getProtocolIdByName(final String name) {
        switch (name) {
            case "1.7.10:":
                return 5;
            case "1.8":
                return 47;
            case "1.9":
                return 107;
            case "1.9.1":
                return 108;
            case "1.9.2":
                return 109;
            case "1.9.3":
            case "1.9.4":
                return 110;
            case "1.10":
                return 210;
            case "1.11":
                return 315;
            case "1.11.1":
            case "1.11.2":
                return 316;
            case "1.12":
                return 335;
            case "1.12.1":
                return 338;
            case "1.12.2":
                return 340;
            case "1.13":
                return 393;
            case "1.13.1":
                return 401;
            case "1.13.2":
                return 404;
            case "1.14":
                return 477;
            case "1.14.1":
                return 480;
            case "1.14.2":
                return 485;
            case "1.14.3":
                return 490;
            case "1.14.4":
                return 498;
            case "1.15":
                return 573;
            case "1.15.1":
                return 575;
            case "1.15.2":
                return 578;
            case "1.16":
                return 735;
            case "1.16.1":
                return 736;
            case "1.16.2":
                return 751;
            case "1.16.3":
                return 754;
            case "1.16.4":
            case "1.16.5":
                return 754;
            case "1.17":
                return 755;
            case "1.17.1":
                return 756;
            case "1.18":
                return 757;


        }

        return 0;

    }

    /**
     * check if a version is newer than an another one
     *
     * @param protocolID       the compared protocol ID
     * @param targetProtocolID the protocolID that will compare to the other one
     * @return if the protocol's version is more recent than the targeted one
     */

    public boolean isMoreRecentThan(final int protocolID, final int targetProtocolID) {
        if (protocolID > targetProtocolID) return true;

        return false;

    }

}
