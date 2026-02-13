package serverrest.parser;

import serverrest.enums.VersionType;

import java.util.Date;

public class VersionParser {
    public VersionParser(String versione, VersionType stato, Date data_dismissione) {
        this.versione = versione;
        this.stato = stato;
        this.data_dismissione = data_dismissione;
    }

    private String versione;
    private VersionType stato;
    private Date data_dismissione;

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public VersionType getStato() {
        return stato;
    }

    public void setStato(VersionType stato) {
        this.stato = stato;
    }

    public Date getData_dismissione() {
        return data_dismissione;
    }

    public void setData_dismissione(Date data_dismissione) {
        this.data_dismissione = data_dismissione;
    }
}
