import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CentroDeportivo reserva1 = new CentroDeportivo();   /**Declaracion de los objetos*/
        CentroDeportivo reserva2 = new CentroDeportivo();
        Scanner sc = new Scanner(System.in);
       /**Lectura de Variables*/

        System.out.println("-----------------------------------");
        System.out.println("------------Bienvenido------------");
        System.out.println("------------Al Programa-----------");
        System.out.println("-----------------------------------");


        System.out.println();



        System.out.println("-----------------------------------");
        System.out.println("------------PROMOCIONES------------");
        System.out.println("-----------------------------------");

        System.out.println();
        System.out.println("Por tu reserva de 25 o más horas en canchas de fútbol, se aplica un 20% de descuento");
        System.out.println("Por tu reserva de 20 o más horas en natación y 15 o más en tenis, se aplica un 15% de descuento");
        System.out.println("Si se cumplen ambas condiciones, se aplica solo la primera.");


        System.out.println();


        System.out.print("Tu nombre : ");
        reserva1.setNombre(sc.nextLine());
        System.out.print("Tipo interior o exterior :");
        reserva1.setTipo(sc.nextLine());
        System.out.print("Elige la Categoria : Futbol, Tenis, Natacion o Bàsquet");
        reserva1.setCategoria(sc.nextLine());
        System.out.println("Las horas disponibles son 12:00, 02:00, 04:00, 06:00 ");
        System.out.println();

        System.out.print("Tu nombre : ");
        reserva2.setNombre(sc.nextLine());
        System.out.print("Tipo interior o exterior :");
        reserva2.setTipo(sc.nextLine());
        System.out.print("Elige la Categoria -> Futbol, Tenis, Natacion o Bàsquet : ");
        reserva2.setCategoria(sc.nextLine());























        reserva1.detalle();
        reserva2.detalle();
    }

}