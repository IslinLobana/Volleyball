package controll;

import java.util.ArrayList;

import model.Buchung;

public class BuchungsController {
    
    MainController mc;
    ArrayList<Buchung> buchungen;


    public BuchungsController(MainController mc){
        setBuchungen(new ArrayList<Buchung>());
        setMc(mc);
    }
    

    public void createBuchungen(){
        getBuchungen().add(new Buchung(getMc().getVc().getVolleyballplaetze().get(0), getMc().getGc().getGruppen().get(0), "Irgendwas"));
    }

    public void setBuchungen(ArrayList<Buchung> buchungen) {
        this.buchungen = buchungen;
    }

    public ArrayList<Buchung> getBuchungen() {
        return buchungen;
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
}