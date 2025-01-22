import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyDataParser {
    public static JsonObject parseRates(String jsonResponse) {
        return JsonParser.parseString(jsonResponse).getAsJsonObject();
    }

    public static double getRate(String currency, JsonObject rates) {
        return rates.getAsJsonObject("rates").get(currency).getAsDouble();
    }
}
