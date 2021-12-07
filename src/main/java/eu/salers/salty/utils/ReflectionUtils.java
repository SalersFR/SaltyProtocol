package eu.salers.salty.utils;

public class ReflectionUtils {

    public static Object getClassByPackage(final String packageName, final String className) {
        try {
            return Class.forName(packageName + "." + className);
        } catch (ClassNotFoundException e) {
            System.out.println("class not found:" + packageName + "." + className);


        }

        return null;

    }

}
