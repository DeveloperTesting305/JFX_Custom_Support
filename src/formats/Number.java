package formats;

public class Number {

    public static void limitedToNumber(javafx.scene.control.TextField field){
        field.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("")) {field.setText(""); return;}
            if (isNumber(newValue)){}
            else field.setText(oldValue);
        });
    }

    public static Boolean isNumber(String value) {
        if (value == null) return false;
        if(value.charAt(value.length()-1) == 'd') return false;
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static Boolean isNumber(Object value) {
        return isNumber(value.toString());
    }

    public static Boolean isNumber(Character value) {
        return isNumber(value.toString());
    }
}
