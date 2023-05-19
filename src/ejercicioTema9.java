/*Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.*/
public class ejercicioTema9 {
    public static void main(String[]args){
        Cliente obj1=new Cliente();
        Trabajador obj2=new Trabajador();
        obj1.setEdad(35);
        obj1.setNombre("WEYMAR");
        obj1.setTelefono(71997409);
        obj1.setCredito(1200);
        System.out.println(obj1.getEdad()+" "+obj1.getNombre()+" "+obj1.getTelefono()+" "+obj1.getCredito());

        obj2.setEdad(25);
        obj2.setNombre("Soledad");
        obj2.setTelefono(7384445);
        obj2.setSalario(3500);
        System.out.println(obj2.getEdad()+" "+obj2.getNombre()+" "+obj2.getTelefono()+" "+obj2.getSalario());
    }
}

class Persona1{
    int edad;
    String nombre;
    int telefono;
    public Persona1(){
        /*System.out.println("Estoy en el constructor");*/
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona1{
    int credito;
    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona1{
    int salario;
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
