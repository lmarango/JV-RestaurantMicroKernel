package co.unicauca.microkernel.common.entities;

/**
 * Clase que define al menú especial
 * @author Luis Arango
 */
public class SpecialMenu {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int smenID;
    private String smenDay;
    private String resID;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public SpecialMenu(int smenID, String smenDay, String resID) {
        this.smenID = smenID;
        this.smenDay = smenDay;
        this.resID = resID;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getSmenID() {
        return smenID;
    }
    
    public String getSmenDay() {
        return smenDay;
    }
    
    public String getResID() {
        return resID;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setSmenID(int smenID) {
        this.smenID = smenID;
    }
    
    public void setSmenDay(String smenDay) {
        this.smenDay = smenDay;
    }
    
    public void setResID(String resID) {
        this.resID = resID;
    }
//</editor-fold>
    
    
    
}