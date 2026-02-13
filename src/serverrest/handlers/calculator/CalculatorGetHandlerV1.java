/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package serverrest.handlers.calculator;

import com.sun.net.httpserver.HttpExchange;
import serverrest.CalcolatriceServiceV1;
import serverrest.parser.OperazioneRequestV1;
import serverrest.parser.OperazioneResponseV1;

import java.io.IOException;
/**
 *
 * @author delfo
 */
public class CalculatorGetHandlerV1 extends BaseCalculatorGetHandler {

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
