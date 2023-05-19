public class Tema10 {
    public static void main(String[] args){
        Coche2 coche=new Coche2();
        moto2 Moto=new moto2();
        EjecutaFrenar(Moto);
        EjecutaAcelerar(coche);

    }
    public static void EjecutaAcelerar(Vehiculo2 vehiculo){
        vehiculo.Acelerar(15);
    }
    public static void EjecutaFrenar(Vehiculo2 vehiculo){
        vehiculo.Frenar(20);
    }


}
interface Vehiculo2{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);

}
class Coche2 implements Vehiculo2{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche()-> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("Coche()-> Frenar()");
    }
}
class moto2 implements Vehiculo2{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("moto()-> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("moto()-> Frenar()");
    }
}
