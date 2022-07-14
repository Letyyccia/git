import java.util.Scanner;

public class atv02 {
    public class aula01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor do lado 2 do triangulo equilatero:");
            double l1 = sc.nextDouble();
            System.out.print("Digite o valor do lado 2 do triangulo escaleno:");
            double l2 = sc.nextDouble();
            System.out.print("Digite o valor do lado1 do triangulo isoceles:");
            double l3 = sc.nextDouble();

            if (l1 == l2 && l2 == l3) {
                System.out.print("O valor do triangulo equilatero é:");
            } else if (l1 != l2 && l1 != l3 && l2 != l3) {
                System.out.print("O valor do triangulo esqualeno é:");
            } else {
                System.out.print("O valor do triangulo isoceles é:");

            }
        sc.close();


        }
    }
}
