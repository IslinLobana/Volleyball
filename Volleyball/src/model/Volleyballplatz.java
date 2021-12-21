package model;

public class Volleyballplatz{

    String _name;
    int maxPers;
    String zustand;
    



    public Volleyballplatz(String name, int maxPers, String zustand){
        setName(name);
        setMaxPers(maxPers);
        setZustand(zustand);
    }


    public void setMaxPers(int maxPers) {
        this.maxPers = maxPers;
    }
    public void setZustand(String zustand) {
        this.zustand = zustand;
    }
    public void setName(String _name) {
        this._name = _name;
    }
    public int getMaxPers() {
        return maxPers;
    }
    public String getZustand() {
        return zustand;
    }
    public String getName() {
        return _name;
    }



}