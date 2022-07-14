// Aula 14-07-2022
public class aula01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "leticia";
        int idade = 17;
        String cpf = "0927985789";

        System.out.println ("meu nome é" + nome);
        System.out.println ("Tenho " + idade + " anos");
        System.out.println ("Meu CPF é" + cpf);

        nome = sc.next();
        idade = sc.nextInt();
        cpf = sc.next();

        System.out.println ("meu nome é" + nome);
        System.out.println ("Tenho " + idade + " anos");
        System.out.println ("Meu CPF é" + cpf);

        sc.close();


    }
}
