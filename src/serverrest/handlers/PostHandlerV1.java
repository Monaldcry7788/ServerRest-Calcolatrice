/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package serverrest.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import serverrest.CalcolatriceServiceV1;
import serverrest.parser.OperazioneRequestV1;
import serverrest.parser.OperazioneResponseV1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author delfo
 */


public class PostHandlerV1 extends BaseCalculatorPostHandler {

    private final CalcolatriceServiceV1 calcolatriceService = new CalcolatriceServiceV1();

    @Override
    protected CalcolatriceServiceV1 getCalcolatriceService() {
        return calcolatriceService;
    }

     @Override
    protected void elabora(HttpExchange exchange, OperazioneRequestV1 request, OperazioneResponseV1 response) throws IOException {
        super.inviaRisposta(exchange, 200, gson.toJson(response));
    }
}
