package serverrest.handlers.version;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import serverrest.Extensions;

import java.io.IOException;

public class VersionGetHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // Verifica che sia una richiesta GET
        if (!exchange.getRequestMethod().equalsIgnoreCase("GET")) {
            String response = "Metodo non consentito. Usa GET";
            Extensions.inviaErrore(exchange, 405, response);
            return;
        }


    }
}
