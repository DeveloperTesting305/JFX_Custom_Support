package formats;

public class Short {
    public static Boolean isShort(String value) {
        if (value == null) return false;
        try {
            java.lang.Short.parseShort(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public static Boolean isShort(Object value) {
        return isShort(value.toString());
    }

    public static Boolean isShort(Character value) {
        return isShort(value.toString());
    }
}
