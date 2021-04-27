package co.unicauca.microkernel.common.entities;

/**
 * Clase que define el menú del día (DayMenu)
 * @author Luis Arango
 */
public class DayMenu {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    int dmenID;
    String dmenDay;
    String resID;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public DayMenu() {
    }
    
    public DayMenu(int dmenID, String dmenDay, String resID) {
        this.dmenID = dmenID;
        this.dmenDay = dmenDay;
        this.resID = resID;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getDmenID() {
        return dmenID;
    }
    public String getDmenDay() {
        return dmenDay;
    }
    public String getResID() {
        return resID;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setDmenID(int dmenID) {
        this.dmenID = dmenID;
    }
    
    public void setDmenDay(String dmenDay) {
        this.dmenDay = dmenDay;
    }
    
    public void setResID(String resID) {
        this.resID = resID;
    }
//</editor-fold>
}