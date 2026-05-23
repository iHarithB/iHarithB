import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int n;
        int nota;
        System.out.println("Ingrese numero de estudiantes");
        try (Scanner dat = new Scanner(System.in)) {
            n = dat.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("Ingrese nota del estudiante " + i);
                nota = dat.nextInt();
                if (nota >= 11) {
                    System.out.println("aprobado");
                } else {
                    System.out.println("reprobado");
                }
            }
        }
    }
}
