package model;

public class Buchung {
    

    Volleyballplatz platz;

    Gruppe gruppe;

    String zeitraum;



    public Buchung(Volleyballplatz platz, Gruppe gruppe, String zeitraum){
        setVolleyballplatz(platz);
        setGruppe(gruppe);
        setZeitraum(zeitraum);
    }

    public void setGruppe(Gruppe gruppe) {
        this.gruppe = gruppe;
    }

    public Gruppe getGruppe() {
        return gruppe;
    }

    public void setVolleyballplatz(Volleyballplatz platz) {
        this.platz = platz;
    }

    public Volleyballplatz getVolleyballplatz() {
        return platz;
    }
    public void setZeitraum(String zeitraum) {
        this.zeitraum = zeitraum;
    }

    public String getZeitraum() {
        return zeitraum;
    }
    



    
}