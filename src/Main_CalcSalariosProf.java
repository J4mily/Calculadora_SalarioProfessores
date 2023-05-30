import java.util.Scanner;

public class Main_CalcSalariosProf {
    /*
     * Nome do Aluno: Franciely Jamily Queiroz Pereira
     * RA: 13523113789
     * Nome do Programa: Cálculo de salário dos professores.
     * Descrição: Programa que após selecionar o regime de pagamento traz ao usuário o se devido salário.
     * Data: 29/05/2023
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("> Digite o nome do professor: ");
            String nomeProfessor = sc.nextLine();

            System.out.print("> Digite o regime de pagamento\n(1 - CLT, 2 - Horista ou 3 - PJ): ");
            int regimePagamento = sc.nextInt();

            while (regimePagamento != 1 && regimePagamento != 2 && regimePagamento != 3) {
                System.out.print("> Número inválido! digite o regime de pagamento\n(1 - CLT, 2 - Horista ou 3 - PJ): ");
                regimePagamento = sc.nextInt();
            }

            Professor professor;

            if (regimePagamento == 1) {
                System.out.print("> Digite o salário mensal do professor: R$ ");
                double salarioMensal = sc.nextDouble();

                professor = new ProfessorCLT(nomeProfessor, salarioMensal);

            } else if (regimePagamento == 2) {
                System.out.print("> Digite o número de horas trabalhadas pelo professor: ");
                int horasTrabalhadas = sc.nextInt();
                System.out.print("> Digite o valor da hora de trabalho: R$ ");
                double valorHoraTrabalho = sc.nextDouble();

                professor = new ProfessorHorista(nomeProfessor, horasTrabalhadas, valorHoraTrabalho);

            } else {
                System.out.print("> Digite o valor do contrato do professor: R$ ");
                double valorContrato = sc.nextDouble();

                professor = new ProfessorPJ(nomeProfessor, valorContrato);

            }

            String regime;
            if (regimePagamento == 1) {
                regime = "CLT";
            } else if (regimePagamento == 2) {
                regime = "HORISTA";
            } else {
                regime = "PJ";
            }

            professor.exibirValorAReceber(regime);
            sc.close();

        } catch (Exception e) {
            sc.close();
            System.out.println("\n=> Operação inválida, refaça o questionário.\n");
        }

    }
}
