package eu.salers.salty.packet;

public class PacketType {


    enum Client {
        TELEPORT_ACCEPT(0x00),
        TILE_NBT_QUERY(0x01),
        DIFFICULTY_CHANGE(0x02),
        CHAT(0x03),
        CLIENT_COMMAND(0x04),
        SETTINGS(0x05),
        TAB_COMPLETE(0x06),
        TRANSACTION(0x07),
        ENCHANT_ITEM(0x08);

        final int id;

        Client(int id) {
            this.id = id;
        }
    }

    enum Server {


    }



    }


}
