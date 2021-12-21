package controll;
import java.util.*;

import model.Volleyballplatz;

public class VolleyballplatzController {

    MainController mc;
    ArrayList<Volleyballplatz> volleyballplaetze;



    public VolleyballplatzController(MainController mc){
        setMc(mc);
        volleyballplaetze = new ArrayList<Volleyballplatz>();
    }


    public void createVolleyballplaetze(){
        getVolleyballplaetze().add(new Volleyballplatz("String", 2, "String"));
    }

    public void setVolleyballplaetze(ArrayList<Volleyballplatz> volleyballplaetze) {
        this.volleyballplaetze = volleyballplaetze;
    }

    public ArrayList<Volleyballplatz> getVolleyballplaetze() {
        return volleyballplaetze;
    }


    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }

    
}

