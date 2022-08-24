
public class ReflectionGateway {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> stringClass = String.class;
        Class<?> squareClass = Class.forName("ReflectionGateway$Square");
        printClassInfo(stringClass,squareClass);
    }

    private static void printClassInfo(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            System.out.println(String.format("class name: %s; class package: %s", clazz.getSimpleName(), clazz.getPackage()));
            Class<?>[] implementedInterfaces = clazz.getInterfaces();
            for (Class<?> imlementedInterace : implementedInterfaces) {
                System.out.println(String.format(" class %s implements: %s", clazz.getSimpleName(), imlementedInterace.getSimpleName()));
            }
            System.out.println();
        }
    }

    private static class Square implements Drawable {
        @java.lang.Override
        public int getNumberOfCorners() {
            return 0;
        }
    }

    private static interface Drawable {
        int getNumberOfCorners();
    }

    private enum Color {
        BLUE,
        RED,
        GREEN
    }
}