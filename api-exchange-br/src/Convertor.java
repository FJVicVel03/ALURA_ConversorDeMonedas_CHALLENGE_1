import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;

public class Convertor {
    private final String apiKey = "7d8f32cf75a5beb0daf53519";
    public LinkedList<Historial> historial = new LinkedList<>();

    public double convertirMonedas(String actual, String objetivo, double cantidad){
        try{
            String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + actual;
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            double conversionRate = root.getAsJsonObject().getAsJsonObject("conversion_rates").get(objetivo).getAsDouble();
            historial.add(new Historial(actual, objetivo, cantidad, conversionRate * cantidad));
            return conversionRate * cantidad;
        }catch(IOException e){
            e.printStackTrace();
            return 0;
        }
    }

    public LinkedList<Historial> obtenerConversiones(){
        return historial;
    }
}
