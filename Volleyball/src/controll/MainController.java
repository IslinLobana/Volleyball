package controll;

import view.Output;

public class MainController {

    BuchungsController bc;
    GruppenController gc;
    VolleyballplatzController vc;
    Output output;

    public MainController(){
        setBc(new BuchungsController(this));
        setGc(new GruppenController(this));
        setVc(new VolleyballplatzController(this));
        setOutput(new Output());
        	

        createDemoData();
        printDemoData();



    }

    public void createDemoData(){
        getBc().createBuchungen();
        getGc().createGruppe();
        getVc().createVolleyballplaetze();
    }

    public void printDemoData(){
        getGc().printGruppen();
    }
    

    public void setBc(BuchungsController bc) {
        this.bc = bc;
    }

    public void setGc(GruppenController gc) {
        this.gc = gc;
    }
    public void setVc(VolleyballplatzController vc) {
        this.vc = vc;
    }
    public BuchungsController getBc() {
        return bc;
    }
    public GruppenController getGc() {
        return gc;
    }
    public VolleyballplatzController getVc() {
        return vc;
    }
    public void setOutput(Output output) {
        this.output = output;
    }

    public Output getOutput() {
        return output;
    }


            /*
        Du hast einen MainController und in dem erstellst du dann den Output, den Buchungscontroller, den VolleyballplatzController und den Gruppencontroller.
        */

        /*
        Für Jordan:
        Er hat sich übrigens dazu entschieden die Unterstriche zu ändern(er meinte das magst du nicht)
        Neue Controller wie BC oder VC im Constructor des MainControllers erstellen.
        Dafür die Controller, um sie zwischenspeichern zu können, als Klassenvariablen speichern.
        BuchungsController b als Klassenvariable bc setten
        Jetzt wird es in den andreren Klassen so eingerichtet, dass man man den MainController im BuchungsController hat und andersherum
        Im Constructor muss man das this schreiben, da er sich selbst übergeben muss
        Dann erstellen wir Demodaten in den jeweiligen Controllern dafür 
        Mann muss die Sachen in ArrayLists speichern, da man dann später bei den Buchungen darauf zugreifen soll
        Achso keine Ahnung ob du das hast aber keine String für Volleyballplatz und so machen in der Buchungsklasse, wurde angeschrien dafür :(
        

        
        */
}
