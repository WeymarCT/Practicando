/*Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.*/

public class tema8 {
    public static void main(String[] args){
        persona ciudadano1=new persona();
        persona ciudadano2=new persona();
        ciudadano1.setEdad(35);
        ciudadano1.setNombre("WEYMAR");
        ciudadano1.setTelefono(71971234);
        ciudadano2.setEdad(20);
        ciudadano2.setNombre("SOLEDAD");
        ciudadano2.setTelefono(73833484);

        System.out.println(ciudadano1.getEdad()+","+ciudadano1.getNombre()+","+ciudadano1.getTelefono());
        System.out.println(ciudadano2.getEdad()+","+ciudadano2.getNombre()+","+ciudadano2.getTelefono());
    }
}
class persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }

}
