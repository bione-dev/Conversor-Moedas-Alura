package bione.exchange;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;

public class ConversorApp {

    private static String API_KEY;

    static {
        try (InputStream input = ConversorApp.class.getClassLoader().getResourceAsStream("api.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            API_KEY = prop.getProperty("API_KEY");
        } catch (IOException ex) {
            throw new RuntimeException("Erro ao carregar a API_KEY", ex);
        }
    }

    public static double getExchangeRate(String from, String to) throws Exception {
        String apiUrl = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + from + "/" + to;
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        JsonObject json = JsonParser.parseReader(new InputStreamReader(con.getInputStream())).getAsJsonObject();
        if (!"success".equals(json.get("result").getAsString())) {
            throw new RuntimeException("Erro ao buscar taxa: " + json.toString());
        }

        return json.get("conversion_rate").getAsDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1. USD -> BRL");
            System.out.println("2. BRL -> USD");
            System.out.println("3. EUR -> BRL");
            System.out.println("4. BRL -> EUR");
            System.out.println("5. GBP -> BRL");
            System.out.println("6. BRL -> GBP");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 0) break;

            String from = "", to = "";

            switch (opcao) {
                case 1: from = "USD"; to = "BRL"; break;
                case 2: from = "BRL"; to = "USD"; break;
                case 3: from = "EUR"; to = "BRL"; break;
                case 4: from = "BRL"; to = "EUR"; break;
                case 5: from = "GBP"; to = "BRL"; break;
                case 6: from = "BRL"; to = "GBP"; break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.print("Digite o valor a converter: ");
            double valor = scanner.nextDouble();

            try {
                double taxa = getExchangeRate(from, to);
                double convertido = valor * taxa;
                System.out.printf("%.2f %s = %.2f %s (Taxa: %.4f)%n", valor, from, convertido, to, taxa);
            } catch (Exception e) {
                System.out.println("Erro ao obter taxa: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Até a próxima!");
    }
}


