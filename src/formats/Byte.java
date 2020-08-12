package formats;

public class Byte {
    public static Boolean isByte(String value) {
        if (value == null) return false;
        try {
            java.lang.Byte.parseByte(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public static Boolean isByte(Object value) {
        return isByte(value.toString());
    }

    public static Boolean isByte(Character value) {
        return isByte(value.toString());
    }
}
