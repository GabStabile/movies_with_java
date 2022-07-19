import java.net.URI;
import java.net.http.HttpClient;

public class App {
    public static void main(String[] args) throws Exception {
        
        // fazer uma conexao HTTP e buscar os top 250 filmes
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060"; // usando endereço alternativo pois o MDB esta fora doar
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpReponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body(body);

        
        // pegar os dados interessam: titulo, poster e classificacao

        // exibir e manipular os dados

    }
}
