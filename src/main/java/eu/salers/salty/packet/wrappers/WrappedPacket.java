package eu.salers.salty.packet.wrappers;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.WeakHashMap;

//CREDITS TO FREQUENCY ANTICHEAT BY ELEVATED THE ELEVATOR
public abstract class WrappedPacket {

    private final Map<String, Field> fields = new WeakHashMap<>();

    private final Object instance;
    private final Class<?> clazz;

    public WrappedPacket(final Object instance, final Class<?> clazz) {
        final Field[] declaredFields = clazz.getDeclaredFields();

        // Loop around all the declared fields and make them accessible
        for (final Field declaredField : declaredFields) {
            final String fieldName = declaredField.getName();

            declaredField.setAccessible(true);
            fields.put(fieldName, declaredField);
        }

        // Set the clazz from constructor
        this.instance = instance;
        this.clazz = clazz;
    }


    /**
     * @param name - The name of the field you want to get
     * @param <T>  - The data-type
     * @return - The value (possibly null) that we got from the field.
     */
    public <T> T get(final String name) {
        try {
            //noinspection unchecked
            return (T) fields.get(name).get(instance);
        } catch (final Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * @param name       - The name of the field you want to edit.
     * @param alteration - The new object to set in the field.
     */
    public void set(final String name, final Object alteration) {
        try {
            fields.get(name).set(clazz, alteration);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
