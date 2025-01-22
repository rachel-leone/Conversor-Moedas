import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        try {
            // Obter taxas de câmbio da API
            String jsonResponse = APIClient.getRates();
            JsonObject rates = CurrencyDataParser.parseRates(jsonResponse);

            // Mostrar o menu interativo
            Menu.display();
            String[] choice = Menu.getUserChoice();

            // Validar escolha
            if (choice.length != 2) {
                System.out.println("Escolha inválida! Use o formato: 'USD BRL'");
                return;
            }

            String from = choice[0].toUpperCase();
            String to = choice[1].toUpperCase();

            // Obter o valor para conversão
            double amount = Menu.getAmount();

            // Realizar a conversão
            CurrencyConverter.convert(from, to, amount, rates);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
