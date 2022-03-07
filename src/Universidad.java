import java.util.Scanner;

public class Universidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        nombre = scanner.nextLine();

        Profesor profesor = new Profesor("20211002590",nombre,"Aroca","Tiempo Completo");
        System.out.println(profesor);

    }
}
