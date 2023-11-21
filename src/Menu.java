import udp.poo.sisacad.dominio.Aluno;
import udp.poo.sisacad.servico.AlunoServico;

import java.util.Scanner;

public class Menu {
    private Scanner r;
    public Menu() {
        this.r = new Scanner(System.in);
    }

    public void executar(){
        this.menuPrincipal();
    }

    private void imprimirMenuInicial() {
        System.out.println("============ MENU PRINCIPAL - SISACAD ============\n");
        System.out.println("Bem vindo ao Sistema Acadêmico! Escolha um perfil para acessar o sistema: ");
        System.out.println("1 - Professores");
        System.out.println("2 - Alunos");
        System.out.println("0 - Sair");
        System.out.print("> ");
    }

    private void menuPrincipal(){
        int op;
        do {
            imprimirMenuInicial();
            op = r.nextInt();

            switch (op) {
                case 1:
                    menuProfessores();
                    break;
                case 2:
                    menuAlunos();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA! Digite uma opção válida...");
                    System.out.println("Tente novamente...\n");
            }
        } while (op != 0);
    }

    private void menuProfessores(){

    }

    private void menuAlunos(){
        int idAluno;
        Aluno aluno;
        AlunoServico alunoServico = new AlunoServico();

        System.out.println("============ MENU ALUNOS - SISACAD ============\n");
        System.out.println("Por gentileza, insira o ID do aluno que deseja consultar: ");
        System.out.print("> ");
        idAluno = r.nextInt();

        aluno = alunoServico.obter(idAluno);

        aluno.imprimir();
        //r.close();
    }
}

