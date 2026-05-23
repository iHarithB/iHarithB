import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        try (Scanner dat = new Scanner(System.in)) {
            int n, h;
        double s;
        double stotal = 0;
        String nombre;

            System.out.println("Ingrese numero de trabajadores");
            n = dat.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("ingrese nombre del trabajador " + i);
                nombre = dat.next();
                System.out.println("ingrese horas trabajadas del trabajador " + i);
                h = dat.nextInt();
                System.out.println("ingrese sueldo por hora del trabajador " + i);
                s = dat.nextDouble();
                stotal = h * s;
                if (stotal >= 0 && stotal <= 150) {
                    stotal = stotal + (stotal * 0.05);
                    System.out.println("El sueldo total del trabajador " + i + " es: " + stotal);
                }
                
                if (stotal > 150 && stotal <= 300) {
                    stotal = stotal + (stotal * 0.07);
System.out.println("El sueldo total del trabajador " + i + " es: " + stotal);
                    if (stotal > 300 && stotal <= 450) {
                        stotal = stotal + (stotal * 0.09);
                        System.out.println("El sueldo total del trabajador " + i + " es: " + stotal);
               
                    }
                }
            }
        }
    }
}
