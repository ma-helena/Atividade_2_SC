public class Questao1 {
    public static void main(String[] args){
        String frase = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";
        String fraseJaneiro = frase.split(", ")[0];
        String fraseFevereiro = frase.split(", ")[1];
        String fraseMarco = frase.split(", ")[2];

        System.out.println(fraseJaneiro);
        System.out.println(fraseFevereiro);
        System.out.println(fraseMarco);

        String valorJaneiro = frase.substring(9,13);
        String valorFevereiro = frase.substring(26,30);
        String valorMarco = frase.substring(39,43);

        int valor1 = Integer.parseInt(valorJaneiro);
        int valor2 = Integer.parseInt(valorFevereiro);
        int valor3 = Integer.parseInt(valorMarco);

        Integer soma = valor1 + valor2 + valor3;

        System.out.println("Total: " + soma);

    }
}