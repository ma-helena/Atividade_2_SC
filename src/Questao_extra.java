//Enunciado
//Faça um programa, que solicite ao usuário que informe o mês e o sistema deve imprimir o valor gasto do mês.
//
//->Considerações:
//
//Utilizar enum
//Criar um valor para cada mês

import java.util.Scanner;

public class Questao_extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o mês desejado:  \n 1 - Janeiro;\n 2 - Fevereiro; \n 3 - Março;\n 4 - Abril;\n 5 - Maio;\n 6 - Junho;\n 7 - Julho;\n 8 - Agosto;\n 9 - Setembro;\n 10 - Outubro;\n 11 - Novembro;\n 12 - Dezembro;");

        int opcao = input.nextInt();

        switch (opcao){
            case 1 -> {
                int MesExpense = Mes.JANUARY_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 2 -> {
                int MesExpense = Mes.FEBRUARY_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 3 -> {
                int MesExpense = Mes.MARCH_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 4 -> {
                int MesExpense = Mes.ABRIL_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 5 -> {
                int MesExpense = Mes.MAIO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 6 -> {
                int MesExpense = Mes.JUNHO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 7 -> {
                int MesExpense = Mes.JULHO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 8 -> {
                int MesExpense = Mes.AGOSTO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 9 -> {
                int MesExpense = Mes.SETEMBRO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 10 -> {
                int MesExpense = Mes.OUTUBRO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 11 -> {
                int MesExpense = Mes.NOVEMBRO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            case 12 -> {
                int MesExpense = Mes.DEZEMBRO_EXPENSE.getValor();
                System.out.println("O gasto total no trimestre é: R$ " + MesExpense);
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }

//        Integer MesExpense = Trimestre.JANUARY_EXPENSE.getValor() + Trimestre.FEBRUARY_EXPENSE.getValor() + Trimestre.MARCH_EXPENSE.getValor();
//        System.out.printf("O gasto total no trimestre é: R$ %.2f.\n", MesExpense);
//
//        String mes = "JANUARY_TRIMESTRE";


    }
}
