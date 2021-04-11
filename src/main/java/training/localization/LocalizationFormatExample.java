package training.localization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationFormatExample {
    public static void main(String[] args) {
        Locale locale = Locale.JAPAN;
        System.out.println(locale);
        ResourceBundle msg = ResourceBundle.getBundle("messages",locale);
        String offerPatter = msg.getString("offer");

        System.out.println(
            MessageFormat.format(offerPatter,"Teaa", "price","rate","time"));
    }
}
