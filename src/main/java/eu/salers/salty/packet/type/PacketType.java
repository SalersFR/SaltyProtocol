package eu.salers.salty.packet.type;

import eu.salers.salty.execptions.PacketTypeNotFoundException;

import java.util.Arrays;
import java.util.Optional;

public enum PacketType {

    IN_TELEPORT_ACCEPT(0x00),
    IN_ENTITY_NBT_QUERY(0x01),
    IN_DIFFICULTY_CHANGE(0x02),
    IN_CHAT(0x03),
    IN_TAB_COMPLETE(0x04)
    ;

    final int id;

    PacketType(int id) {
        this.id = id;
    }

    /**
     * @param id the packet's id
     * @return the packet related to the id
     */
    public static PacketType getById(final int id) {
        final Optional<PacketType> toReturn = Arrays.stream(values()).filter(i -> i.id == id).findAny();
        if (toReturn.isPresent())
            return toReturn.get();
        else new PacketTypeNotFoundException().printStackTrace();

        return null;
    }
}
