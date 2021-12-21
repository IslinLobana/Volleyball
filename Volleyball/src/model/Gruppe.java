package model;

public class Gruppe {


    int anzahl;
    String glNa;
    String glVo;


    public Gruppe(int anzahl, String glNa, String glVo){
        setAnzahl(anzahl);
        setGlNa(glNa);
        setGlVo(glVo);
    }


    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
    public void setGlNa(String glNa) {
        this.glNa = glNa;
    }
    public void setGlVo(String glVo) {
        this.glVo = glVo;
    }
    public int getAnzahl() {
        return anzahl;
    }
    public String getGlNa() {
        return glNa;
    }
    public String getGlVo() {
        return glVo;
    }
    
}

