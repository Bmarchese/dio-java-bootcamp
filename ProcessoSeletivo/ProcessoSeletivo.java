package ProcessoSeletivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("ANALISAR CANDIDATOS");
        analisarCandidato(2001);
        analisarCandidato(2000);
        analisarCandidato(1999);
        System.out.println("-----------------------------------------------\n");
        System.out.println("SELEÇÃO CANDIDATOS");
        selecaoCandidatos();
        System.out.println("-----------------------------------------------\n");
        System.out.println("ENTRAR EM CONTATO");
        entrandoEmContato("GERONIMO");
    }

    private static void analisarCandidato(double salarioPretendido){
        final double salarioBase = 2000;

        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO");
        else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDAR O RESULTADO DOS OUTROS CANDIDATOS");
    }

    private static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE", "BRUNO"};
        List<String> selecionados = new ArrayList<>();

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                selecionados.add(candidato);
            }
            candidatosAtual++;
        }

        System.out.println("\nCANDIDATOS SELECIONADOS:");
        selecionados.forEach((value) -> System.out.println(value));
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    private static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = new Random().nextInt(3) == 1;
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas);
    }

}
