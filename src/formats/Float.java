package formats;

public class Float {

    public static void limitedToFloat(javafx.scene.control.TextField field){
        field.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("")) {field.setText(""); return;}
            if (isFloat(newValue)){}
            else field.setText(oldValue);
        });
    }

    public static Boolean isFloat(String value) {
        if (value == null) return false;
        if(value.charAt(value.length()-1) == 'f') return false;
        try {
            java.lang.Float.parseFloat(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public static Boolean isFloat(Object value) {
        return isFloat(value.toString());
    }

    public static Boolean isFloat(Character value) {
        return isFloat(value.toString());
    }
}

