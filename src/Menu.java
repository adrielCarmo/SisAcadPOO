import udp.poo.sisacad.dominio.Aluno;
import udp.poo.sisacad.dominio.Disciplina;
import udp.poo.sisacad.dominio.RendimentoEscolar;
import udp.poo.sisacad.dominio.Turma;
import udp.poo.sisacad.servico.AlunoServico;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    private Scanner r;
    public Menu() {
        this.r = new Scanner(System.in);
    }

    public void executar() throws ParseException {
        this.menuPrincipal();
    }

    private void imprimirMenuInicial() {
        System.out.println("============ MENU PRINCIPAL - SISACAD ============\n");
        System.out.println("Bem vindo ao Sistema Acadêmico! Escolha um perfil para acessar o sistema: ");
        System.out.println("1 - Professores");
        System.out.println("2 - Alunos");
        System.out.print("> ");
    }

    private void menuPrincipal() throws ParseException {
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

    private void menuAlunos() throws ParseException {
        AlunoServico alunoServico = new AlunoServico();

        System.out.println("ALUNOS - MENU.");
        System.out.print("insira o ID do aluno: ");
        int alunoId = r.nextInt();

        Aluno aluno = alunoServico.obter(alunoId);

        if (aluno != null) {
            Turma turma = aluno.getTurma();

            System.out.println(aluno.getNome());
            System.out.println("Turma: " + turma.getId());
            System.out.println("Capacidade Máxima: " + turma.getCapMaxAlunos());

            System.out.println("Disciplinas da Turma:");
            for (Disciplina disciplina : turma.getDisciplinas()) {
                System.out.println("- " + disciplina.getNome());
            }

            System.out.print("Digite o ID da disciplina para exibir as notas do aluno: ");
            int disciplinaId = r.nextInt();

            Disciplina disciplinaSelecionada = null;
            for (Disciplina disciplina : turma.getDisciplinas()) {
                if (disciplina.getId() == disciplinaId) {
                    disciplinaSelecionada = disciplina;
                    break;
                }
            }

            if (disciplinaSelecionada != null) {
                RendimentoEscolar rendimentoEscolar = aluno.getRendEscolar();

                System.out.println("Notas do aluno na disciplina " + disciplinaSelecionada.getNome() + ":");

                System.out.println("Notas de trabalho do aluno na disciplina " + disciplinaSelecionada.getNome() + ":");

                System.out.println("Rendimento Escolar do Aluno:");
                System.out.println("Nota P1: " + rendimentoEscolar.getNotaP1());
                System.out.println("Nota P2: " + rendimentoEscolar.getNotaP2());
                System.out.println("Média de Trabalhos: " + rendimentoEscolar.getMediaTrabalhos());
                System.out.println("Média Geral: " + rendimentoEscolar.getMediaGeral());
            } else {
                System.out.println("Disciplina não encontrada.");
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
        r.close();
    }
}

