package controll;

import model.Gruppe;
import java.util.*;

public class GruppenController {

    MainController mc;
    ArrayList<Gruppe> gruppen;


    public GruppenController(MainController mc){
        setMc(mc);
        gruppen = new ArrayList<Gruppe>();
    }

    public void createGruppe(){
        getGruppen().add(new Gruppe(2, "Leo", "Wöhler"));
      
    }

    public void printGruppen(){
        for(Gruppe g : getGruppen()){
            getMc().getOutput().printData(g.getGlNa() + " " + g.getGlVo());
        }
    }



    public void setGruppen(ArrayList<Gruppe> gruppen) {
        this.gruppen = gruppen;
    }

    public ArrayList<Gruppe> getGruppen() {
        return gruppen;
    }


    public void setMc(MainController mc) {
        this.mc = mc;
    }

    public MainController getMc() {
        return mc;
    }

    
}
