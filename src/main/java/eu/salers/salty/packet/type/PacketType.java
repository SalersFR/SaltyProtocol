package eu.salers.salty.packet.type;

import eu.salers.salty.execptions.PacketTypeNotFoundException;

import java.util.Arrays;
import java.util.Optional;

public enum PacketType {

    IN_TELEPORT_ACCEPT(0x00),
    IN_ENTITY_NBT_QUERY(0x01),
    IN_DIFFICULTY_CHANGE(0x02),
    IN_CHAT(0x03),
    IN_TAB_COMPLETE(0x06),
    IN_WINDOW_CLICK(0x08),
    IN_CLOSE_WINDOW(0x09),
    IN_B_EDIT(0x0B),
    IN_KEEP_ALIVE(0x0F),
    IN_DIFFICULTY_LOCK(0x10),
    IN_POSITION(0x11),
    IN_POSITION_LOOK(0x12),
    IN_LOOK(0x13),
    IN_FLYING(0x14),
    IN_VEHICLE_MOVE(0x15),
    IN_PICK_ITEM(0x17),
    IN_ABILITIES(0x19),
    IN_BLOCK_DIG(0x1A),
    IN_ENTITY_ACTION(0x1B),
    IN_STEER_VEHICLE(0x1C),
    IN_TRANSACTION(0x1D),
    IN_RECIPE_DISPLAYED(0x1F),
    IN_ITEM_NAME(0x20),
    IN_RESOURCE_PACK_STATUS(0x21),
    IN_ADVANCEMENTS(0x22),
    IN_HELD_ITEM_SLOT(0x25),
    IN_UPDATE_SIGN(0x2B),
    IN_ARM_ANIMATION(0x2C),
    IN_SPECTATE(0x2D),
    IN_BLOCK_PLACE(0x2E),
    IN_USE_ITEM(0x2F),


    OUT_SPAWN_ENTITY(0x100),
    OUT_NAMED_ENTITY_SPAWN(0x101),
    OUT_SPAWN_ENTITY_LIVING(0x102),
    OUT_REL_ENTITY_MOVE(0x103),
    OUT_REL_ENTITY_MOVE_LOOK(0x104),
    OUT_ENTITY_VELOCITY(0x105),
    OUT_EXPLOSION(0x106),
    OUT_BLOCK_CHANGE(0x107),
    OUT_TRANSACTION(0x108);

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
