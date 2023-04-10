package Clases;

public class Usuarios {
    public String name;
    public String rol;
    private int telefono;
    private long DPI;
    private double sueldo;
    private String correo;
    private int edad;
    private int correlativo;
    private String user;
    private String password;
    private Usuarios sig;

    public Usuarios (String nombre, String rol, int telefono, long dpi, double sueldo, String correo, int edad, String user, String password){
        this.name = nombre;
        this.rol = rol;
        this.telefono = telefono;
        this.DPI = dpi;
        this.sueldo = sueldo;
        this.correo = correo;
        this.edad = edad;
        this.user = user;
        this.password = password;
        this.sig = null;
    }

    public Usuarios (){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {
        this.DPI = DPI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Usuarios getSig() {
        return sig;
    }

    public void setSig(Usuarios sig) {
        this.sig = sig;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
