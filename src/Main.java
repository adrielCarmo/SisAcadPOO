import udp.poo.sisacad.dominio.Aluno;
import udp.poo.sisacad.servico.AlunoServico;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        AlunoServico serv = new AlunoServico();
        for (Aluno aluno : serv.listarTudo()) {
            System.out.println("-----------------------------------");
            System.out.println(aluno.toString());
        }
    }
}