package edu.camilaavillaa.reto6.ui;
import java.util.Scanner;
public class CLI {
    public static void showMenu() {
    }import java.util.Scanner;
    public class CLI {
        public static void showMenu(){
            Scanner scanner =new Scanner (System.in);
            public static void showMenu() {
                Scanner Scanner = new Scanner(System.in);
                System.out.println("Elige la dificultad que quieras jugar");
                System.out.println("1: Facil");
                System.out.println("2: intermedio");
                System.out.println("2: Intermedio");
                System.out.println("3: Dificil");
                int Nivel = scanner.nextInt();

                @@ -22,15 +22,9 @@ public static void showMenu(){
                    edu.camilaavillaa.reto5.process.excepciones.Dificil();
                    break;
                    default:
                        System.out.println("esa opcion no existe");
                        System.out.println("esa opción no existe");
                }

                scanner.close(); // Cierre del scanner después de su uso
            }
        }
}
