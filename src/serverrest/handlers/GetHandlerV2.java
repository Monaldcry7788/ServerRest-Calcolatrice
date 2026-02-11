/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package serverrest.handlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import serverrest.CalcolatriceServiceV1;
import serverrest.CalcolatriceServiceV2;
import serverrest.ServerRest;
import serverrest.parser.OperazioneRequestV1;
import serverrest.parser.OperazioneResponseV1;
import serverrest.parser.OperazioneResponseV2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author delfo
 */
public class GetHandlerV2 extends GetHandlerV1 {

    public GetHandlerV2() {
        super();
        this.service = new CalcolatriceServiceV2();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        super.handle(exchange);
    }

    @Override
    public boolean inviaRisposta() throws IOException {
        return true;
    }
}
