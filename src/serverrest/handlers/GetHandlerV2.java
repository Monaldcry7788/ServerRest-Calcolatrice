/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package serverrest.handlers;

import com.sun.net.httpserver.HttpExchange;
import serverrest.CalcolatriceServiceV1;
import serverrest.CalcolatriceServiceV2;
import serverrest.ServerRest;
import serverrest.parser.OperazioneRequestV1;
import serverrest.parser.OperazioneResponseV1;
import serverrest.parser.OperazioneResponseV2;

import java.io.IOException;

/**
 *
 * @author delfo
 */
public class GetHandlerV2 extends BaseCalculatorGetHandler {

    private final CalcolatriceServiceV1 calcolatriceService = new CalcolatriceServiceV2();

    @Override
    protected CalcolatriceServiceV1 getCalcolatriceService() {
        return calcolatriceService;
    }

    @Override
    protected void elabora(HttpExchange exchange, OperazioneRequestV1 request, OperazioneResponseV1 response) throws IOException {
        OperazioneResponseV2 responseV2 = new OperazioneResponseV2(response.getOperando1(), response.getOperando2(), response.getOperazione(), response.getRisultato());
        ServerRest.operazioni.put(responseV2.getId(), request);
        super.inviaRisposta(exchange, 200, gson.toJson(response));
    }
}
