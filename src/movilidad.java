public class movilidad {
    public static void main(String[] args){
        carro obj1=new carro();
        obj1.setTipo("Coupe");
        obj1.setVelocidadMaxima(120);
        obj1.setRapido(true);


        carro obj2=new carro();
        obj2.setTipo("Scooter");
        obj2.setVelocidadMaxima(50);
        obj2.setRapido(false);

        System.out.println(obj1.getTipo());
        System.out.println(obj1.getVelocidadMaxima());
        System.out.println(obj1.isRapido());

        System.out.println(obj2.getTipo());
        System.out.println(obj2.getVelocidadMaxima());
        System.out.println(obj2.isRapido());
    }
}
/*CONSTRUCTOR*/
class carro{
    private String tipo;
    private int velocidadMaxima;
    public boolean rapido;

    public void setRapido(boolean rapido){
        this.rapido=rapido;
    }
    public boolean isRapido(){
        return this.rapido;
    }
    /*metodo set velocidadmaxima*/
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

}

abstract class avion{

}