import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;
        System.out.println("doubleValue: " + doubleValue);
            // 1.000000053E7

        var numF = NumberFormat.getNumberInstance();
        System.out.println("doubleValue: " + numF.format(doubleValue));
            // 10,000,000.53

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("doubleValue: " + intF.format(doubleValue));
            // 10,000,001

        intF.setGroupingUsed(false);
        System.out.println("doubleValue: " + intF.format(doubleValue));
            // 10000001

        var locale = Locale.getDefault();
        System.out.println(locale);
            // en_US

        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("doubleValue: " + localeFormatter.format(doubleValue));
            // 10,000,000.53

        var deLocale = new Locale("de", "DE");
        var deLocaleFormatter = NumberFormat.getNumberInstance(deLocale);
        System.out.println(String.format("doubleValue: ")+ deLocaleFormatter.format(doubleValue));
            // 10.000.000,53

        var currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatter.format(doubleValue));
            // $10,000,000.53

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(doubleValue));
            // $10000000.53
    }
}