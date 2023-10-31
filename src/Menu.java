import java.util.Scanner;

public class Menu {
    private Scanner r;
    public Menu() {
        this.r = new Scanner(System.in);
    }

    public void executar() {
        this.menuPrincipal();
    }

    private void imprimirMenuInicial() {
        System.out.println("============ MENU PRINCIPAL - SISACAD ============\n");
        System.out.println("Bem vindo ao Sistema Acadêmico! Escolha um perfil para acessar o sistema: ");
        System.out.println("1 - Professores");
        System.out.println("2 - Alunos");
        System.out.print("> ");
    }

    private void menuPrincipal() {
        int op;
        do {
            imprimirMenuInicial();
            op = r.nextInt();

            switch (op) {
                case 1:

                    break;
                case 2:

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
}
