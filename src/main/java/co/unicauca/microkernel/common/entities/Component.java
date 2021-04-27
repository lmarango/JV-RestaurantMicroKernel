package co.unicauca.microkernel.common.entities;

/**
 * Clase que define al componente
 * @author Luis Arango
 */
public class Component {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Identificador del componente
     */
    private int compId;
    /**
     * nombre del componente
     */
    private String compName;
    /**
     * Precio del componente
     */
    private int compPrice;
    /**
     * Tipo del componente
     */
    private String compType;
    /**
     * imagen que describe el componente
     */
    private byte [] CompImage;
//</editor-fold>  
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * Constructor por defecto
     */
    public Component(){}
    /**
     * COnstructor parametrizado de la clase Component
     * @param compId Identificador
     * @param compNombre Nombre
     * @param precio Precio
     * @param Tipo Tipo 
     * @param CompImage Imagen
     */
    public Component(int compId, String compNombre, int precio, String Tipo, byte[] CompImage) {
        this.compId = compId;
        this.compName = compNombre;
        this.compPrice = precio;
        this.compType = Tipo;
        this.CompImage = CompImage;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getCompId() {
        return compId;
    }
    
    public String getCompName() {
        return compName;
    }
    
    public int getCompPrice() {
        return compPrice;
    }
    
    public String getCompType() {
        return compType;
    }
    
    public byte[] getCompImage() {
        return CompImage;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setCompId(int compId) {
        this.compId = compId;
    }
    
    public void setCompName(String compName) {
        this.compName = compName;
    }
    
    public void setCompPrice(int compPrice) {
        this.compPrice = compPrice;
    }
    
    public void setCompType(String compType) {
        this.compType = compType;
    }
    
    public void setCompImage(byte[] CompImage) {
        this.CompImage = CompImage;
    }
//</editor-fold>

    
}
