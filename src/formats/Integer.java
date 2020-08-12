package formats;

public class Integer {

    public static void limitedToInteger(javafx.scene.control.TextField field){
        field.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("")) {field.setText(""); return;}
            if (isInteger(newValue)){}
            else field.setText(oldValue);
        });
    }

    public static Boolean isInteger(String value) {
        if (value == null) return false;
        try {
            java.lang.Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static Boolean isInteger(Object value) {
        return isInteger(value.toString());
    }

    public static Boolean isInteger(Character value) {
        return isInteger(value.toString());
    }
}
