package serverrest.parser;

import java.sql.Timestamp;
import java.util.UUID;

public class OperazioneResponseV2 extends OperazioneResponseV1{

    private Timestamp timestamp;
    private String id;

    public OperazioneResponseV2() {
        super();
    }

    public OperazioneResponseV2(double operando1, double operando2, String operatore, double risultato) {
        super(operando1, operando2, operatore, risultato);
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
