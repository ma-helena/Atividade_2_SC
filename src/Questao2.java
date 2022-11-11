import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome completo: ");
        String nome = sc.nextLine();
        String arrayNome[] = nome.split(" ");
        for (int i = 0; i < arrayNome.length; i++) {

            System.out.print("!" + arrayNome[i] + " ");
        }
    }

}
