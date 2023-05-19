public class Tema9 {
    public static void main(String[] args){
        Coche coche=new Coche();
        coche.setSonido("brrr");
        System.out.println(coche.getSonido());
    }
}
abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;
    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }
    abstract public String getSonido();
    abstract public void setSonido(String sonido);
}

class Coche extends Vehiculo{
    public String getSonido(){
        return "Soy un supersonido: "+ this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido=sonido;
    }

}
class Moto extends Vehiculo {
    public String getSonido() {
        return this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

