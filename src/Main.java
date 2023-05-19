// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Coche1 coche = new Coche1();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche1 coche2 = new Coche1(2,90);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);




        }
    }
    class Coche1{
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

        public Coche1(){
            numeroDePuertas=5;
            velocidadMaxima=120;
            System.out.println("Estoy en el constructor ***sin nada***");
        }
        public Coche1(int numeroDePuertas, int velocidadMaxima){
            this.numeroDePuertas=numeroDePuertas;
            this.velocidadMaxima=velocidadMaxima;
            System.out.println("Estoy en el constructror CON PARAMETROS");
        }




}
