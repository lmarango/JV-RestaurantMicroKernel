package co.unicauca.microkernel.common.entities;

/**
 *
 * @author Usuario
 */
public class Delivery {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Codigo del envío a domicilio
     */
    private String delCode;
    /**
     * Distancia del envio
     */
    private int delDistance;
    /**
     * Costo del envio
     */
    private int delPrice;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * Constructor parametrizado de la clase Delivey
     * @param delCode codigo (ID)
     * @param delDistance Distancia
     * @param delPrice Precio
     */
    public Delivery(String delCode, int delDistance, int delPrice) {
        this.delCode = delCode;
        this.delDistance = delDistance;
        this.delPrice = delPrice;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getDelCode() {
        return delCode;
    }
    
    public int getDelDistance() {
        return delDistance;
    }
    
    public int getDelPrice() {
        return delPrice;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setDelCode(String delCode) {
        this.delCode = delCode;
    }
    
    public void setDelDistance(int delDistance) {
        this.delDistance = delDistance;
    }
    
    public void setDelPrice(int delPrice) {
        this.delPrice = delPrice;
    }
//</editor-fold>
}
