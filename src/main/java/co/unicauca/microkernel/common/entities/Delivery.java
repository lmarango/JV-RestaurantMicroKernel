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
    /**
     * Obtiene el codigo del envío
     * @return String delCode
     */
    public String getDelCode() {
        return delCode;
    }
    /**
     * Obtiene la distancia del envio
     * @return int delDistance
     */
    public int getDelDistance() {
        return delDistance;
    }
    /**
     * Obtiene precio del envio 
     * @return int delPrice
     */
    public int getDelPrice() {
        return delPrice;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Modifica el código del envío
     * @param delCode nuevo código de envío
     */
    public void setDelCode(String delCode) {
        this.delCode = delCode;
    }
    /**
     * Modifica la distancia del envío 
     * @param delDistance nueva distancia de envío
     */
    public void setDelDistance(int delDistance) {
        this.delDistance = delDistance;
    }
    /**
     * Modifica el precio del envio 
     * @param delPrice Nuevo precio de envío
     */
    public void setDelPrice(int delPrice) {
        this.delPrice = delPrice;
    }
//</editor-fold>
}
