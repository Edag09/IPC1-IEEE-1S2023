package drag_and_drop;

import Clases.ListaSimple_Usuarios;
import Clases.ListaProductos_Doble;
import java.util.Scanner;

public class Drag_and_Drop {

    public static void main(String[] args) {
        /*Ventana vn = new Ventana();
        vn.setVisible(true);*/

        /*Scanner sn = new Scanner(System.in);
        String u = "";
        
        ListaSimple_Usuarios  usuario = new ListaSimple_Usuarios();
        usuario.add_User("Eduardo Rene", "Coordinador", 25638471, 300684088, 4500.00, "rene.agus@gmail.com", 23, "eduren", "eduren1");
        usuario.add_User("Andrea Valenzuela", "Coordinadora", 23659140, 458216982, 4500.00, "andre.val@gmail.com", 23, "andval", "andval2");
        usuario.add_User("Ammy Toledo", "Reclutadora", 23655984, 302514056, 5000.00, "ammy.tol@gmail.com", 25, "ammtol", "ammtol3");
        usuario.add_User("José Alvarez", "Encargado de Limpieza", 21584602, 350214269, 4000.00, "jose.alv@gmail.com", 26, "josalv", "josalv4");
        usuario.add_User("Diego Juarez", "Empleado", 12369845, 402159763, 4000.00, "diego.jr@gmail.com", 24, "digjua", "digjua5");

        usuario.imprimir();
        System.out.println("Ingresa el usuairo a cambiar: ");
        u = sn.nextLine();
        usuario.editar(u);
        System.out.println("Ingresa el usuario a eliminar: ");
        u = sn.nextLine();
        usuario.Eliminar(u);
        usuario.imprimir();*/

        ListaProductos_Doble producto = new ListaProductos_Doble();
        producto.add_productos("Memoria Ram 8 GB 2600 Hz", 500.00, "Tecnologia");
        producto.add_productos("Teclado", 400.00, "Tecnologia");
        producto.add_productos("Lapiceros", 2.00, "Papeleria");

    }
    
}
