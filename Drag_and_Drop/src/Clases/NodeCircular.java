package Clases;

public class NodeCircular {
    public String nombre = "";
    public double precio = 0.0;
    public String area = "";
    private NodeCircular sig;
    private NodeCircular ant;

    public NodeCircular(String nombre, double precio, String area) {
        this.nombre =  nombre;
        this.precio = precio;
        this.area = area;
        this.sig = null;
        this.ant = null;
    }

    public NodeCircular() {
    }

    public NodeCircular getSig() {
        return sig;
    }

    public void setSig(NodeCircular sig) {
        this.sig = sig;
    }

    public NodeCircular getAnt() {
        return ant;
    }

    public void setAnt(NodeCircular ant) {
        this.ant = ant;
    }

    
    
}
