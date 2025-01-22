import com.google.gson.JsonObject;

public class CurrencyConverter {
    public static void convert(String from, String to, double amount, JsonObject rates) {
        try {
            double rateFrom = CurrencyDataParser.getRate(from, rates);
            double rateTo = CurrencyDataParser.getRate(to, rates);
            double convertedAmount = (amount / rateFrom) * rateTo;

            System.out.printf("O valor de %.2f %s em %s é: %.2f %s%n", amount, from, to, convertedAmount, to);
        } catch (NullPointerException e) {
            System.out.println("Moeda inválida ou não suportada!");
        }
    }
}
