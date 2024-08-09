package iPhoneUML;

import iPhoneUML.interfaces.INavegadorInternet;

import java.util.ArrayList;
import java.util.List;

class NavegadorInternet implements INavegadorInternet {
    private int abaAtual;
    private List<String> abas;

    public NavegadorInternet(){
        this.abaAtual = -1;
        this.abas = new ArrayList<String>();
    }

    public void exibirPagina() {
        if (this.abaAtual != -1) {
            System.out.println("Exibindo página na aba: " + this.abas.get(this.abaAtual));
        } else {
            System.out.println("Nenhuma aba está ativa para exibir.");
        }
    }

    @Override
    public void adicionarNovaAba() {
        String novaAba = "Aba " + (this.abas.size() + 1);
        this.abas.add(novaAba);
        this.abaAtual = this.abas.size() - 1;  // Define a nova aba como a ativa
        System.out.println("Nova aba adicionada: " + novaAba);
    }

    @Override
    public void atualizarPagina() {
        if (this.abaAtual != -1) {
            System.out.println("Página na " + abas.get(this.abaAtual) + " atualizada.");
        } else {
            System.out.println("Nenhuma aba para atualizar.");
        }
    }

    @Override
    public void trocarAba(int indice) {
        if (indice >= 0 && indice < this.abas.size()) {
            this.abaAtual = indice;
            System.out.println("Trocando para a aba: " + this.abas.get(this.abaAtual));
        } else {
            System.out.println("Índice de aba inválido.");
        }
    }
}
