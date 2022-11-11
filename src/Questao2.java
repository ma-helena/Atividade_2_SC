import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome completo com 4 nomes: ");
        String nome = sc.nextLine();
        String primeiroNome = nome.split(" ")[0];
        String segundoNome = nome.split(" ")[1];
        String terceiroNome = nome.split(" ")[2];
        String quartoNome = nome.split(" ")[3];
        String nomeCompleto = "!"+primeiroNome+" "+ "!"+segundoNome+" "+"!"+ terceiroNome+ " "+ "!"+ quartoNome;
        System.out.println(nomeCompleto);
    }

}
