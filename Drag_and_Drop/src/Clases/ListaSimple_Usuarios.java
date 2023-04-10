package Clases;

import javax.swing.JOptionPane;

public class ListaSimple_Usuarios {
    private Usuarios root;
    private int tamanio; 
    
    public ListaSimple_Usuarios(){
        this.root = null;
        this.tamanio = 1;
    }

    public void add_User(String nombre, String rol, int telefono, long dpi, double sueldo, String correo, int edad, String user, String password){
        Usuarios nuevo = new Usuarios(nombre, rol, telefono, dpi, sueldo, correo, edad, user, password);
        if(this.getRoot() == null){
            this.setRoot(nuevo);
            nuevo.setCorrelativo(tamanio);
            this.tamanio++;
        }else{
            Usuarios aux = this.getRoot();
            while (aux.getSig() != null) {                
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
            nuevo.setCorrelativo(tamanio);
            this.tamanio++;
        }
    }

    public void imprimir(){
        Usuarios aux = this.getRoot();
        while(aux != null){
            System.out.println("Registro N°: "+aux.getCorrelativo()+" Nombre: "+aux.getName()+" Rol: "+aux.getRol()+" Correo Electronico: "+aux.getCorreo()+" Telefono: "+aux.getTelefono() +" Usuario: "+aux.getUser());
            aux = aux.getSig();
        }
    }


    public boolean siexiste(String pass){
        Usuarios aux = this.getRoot();
        if (aux != null) {
            while(aux != null){
                if(pass.equals(aux.getPassword())){
                    return true;    
                }
                aux = aux.getSig();
            }
        }
            return false;
    }

    public Usuarios Datos(String contra){
        Usuarios aux = this.getRoot();
        if (aux != null) {
            while (aux != null) {                
                if (contra.equals(aux.getUser())) {
                    return aux;
                }
                aux = aux.getSig();
            }
        }
        return null;
    }

    public Usuarios getRoot() {
        return root;
    }

    public void setRoot(Usuarios root) {
        this.root = root;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }


}
