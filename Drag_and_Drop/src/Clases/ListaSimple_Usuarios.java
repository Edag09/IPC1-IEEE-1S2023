package Clases;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class ListaSimple_Usuarios {
    private Usuarios root;
    private int tamanio;
    Scanner sn = new Scanner(System.in);
    Scanner decimal = new Scanner(System.in);
    
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
                if (contra.equals(aux.getPassword())) {
                    return aux;
                }
                aux = aux.getSig();
            }
        }
        return null;
    }

    public void Eliminar(String users){
        Usuarios aux = getRoot();
        if (this.root == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }else if(this.getRoot().getUser().equals(users)){
            this.setRoot(root.getSig());
        }else{
            while(aux.getSig() != null){
                if (aux.getSig().getUser().equals(users)) {
                    aux.setSig(aux.getSig().getSig());
                    break;
                }else if(aux.getSig().getUser().equals(users)){
                    aux.setSig(null);
                }
                aux = aux.getSig();
            }
        }
    }

    public void editar(String usuario){
        Usuarios aux = this.getRoot();
        if(aux != null){
            
            while(aux != null){
                if (usuario.equals(aux.getUser())) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresa los nuevos datos");
                    System.out.println("INGRESA LOS NUEVOS DATOS");
                    System.out.println("Ingresa el nuevo Rol: ");
                    String nuevo_rol = sn.nextLine();
                    System.out.println("Ingresa el nuevo Sueldo: ");
                    double nuevo_sueldo = decimal.nextDouble();
                    System.out.println("Ingresa el nuevo Usuario: ");
                    String nuevo_usuario = sn.nextLine();
                    System.out.println("Ingresa la nueva contrasenia: ");
                    String nueva_contrasenia = sn.nextLine();
                    
                    aux.setRol(nuevo_rol);
                    aux.setSueldo(nuevo_sueldo);
                    aux.setUser(nuevo_usuario);
                    aux.setPassword(nueva_contrasenia);

                    JOptionPane.showMessageDialog(null, "El usuario ha sido modificado");
                    
                }
                aux = aux.getSig();
            }
        }
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
