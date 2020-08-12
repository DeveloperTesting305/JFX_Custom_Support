package formats;

public class Long {
    public static Boolean isLong(String value) {
        if (value == null) return false;
        try {
            java.lang.Long.parseLong(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public static Boolean isLong(Object value) {
        return isLong(value.toString());
    }

    public static Boolean isLong(Character value) {
        return isLong(value.toString());
    }
}
