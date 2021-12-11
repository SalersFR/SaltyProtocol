package eu.salers.salty.utils;

public class ReflectionUtils {

    public static Class getClassByPackage(final String packageName, final String className) {
        try {
            return Class.forName(packageName + "." + className);
        } catch (ClassNotFoundException e) {
            System.out.println("class not found:" + packageName + "." + className);


        }

        return null;

    }

    public static Class<? extends Enum<?>> getEnumSubClass(Class<?> cls, String name) {
        return (Class<? extends Enum<?>>) getSubClass(cls, name);
    }


    public static Class<?> getSubClass(Class<?> cls, String name) {
        if (cls == null) {
            return null;
        }
        for (Class<?> subClass : cls.getDeclaredClasses()) {
            if (subClass.getSimpleName().equals(name)) {
                return subClass;
            }
        }
        return null;
    }

}
