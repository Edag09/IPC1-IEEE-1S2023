package Clases;
import Clases.NodeCircular;

public class ListaProductos_Doble {
    private NodeCircular root;

    public ListaProductos_Doble() {
        this.root = null;
    }

    public void add_productos(String nombre, double precio, String area){
        NodeCircular nuevo = new NodeCircular(nombre, precio, area);
        if (this.getRoot() == null) {
            this.setRoot(nuevo);
            this.getRoot().setSig(nuevo);
            this.getRoot().setAnt(nuevo);
        }else{
            NodeCircular aux = this.getRoot();
            while(aux.getSig() != this.getRoot()){
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
            nuevo.setAnt(aux);
            nuevo.setSig(this.getRoot());
            this.getRoot().setAnt(nuevo);
        }
    }

    public NodeCircular getRoot() {
        return root;
    }

    public void setRoot(NodeCircular root) {
        this.root = root;
    }


    
}
