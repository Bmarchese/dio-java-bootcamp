package iPhoneUML;

import iPhoneUML.interfaces.IReprodutorMusical;

import java.util.Scanner;

public class ReprodutorMusical implements IReprodutorMusical {

    private boolean tocando;
    private int musicaSelecionada;

    public ReprodutorMusical(){
        this.tocando = false;
        this.musicaSelecionada = 0;
    }

    @Override
    public void tocar() {
        if (!this.tocando) {
            this.tocando = true;
            System.out.println("Música " + this.musicaSelecionada + " está tocando.");
        } else {
            System.out.println("Música já está tocando.");
        }
    }

    @Override
    public void pausar() {
        if (this.tocando) {
            this.tocando = false;
            System.out.println("Música está pausada.");
        } else {
            System.out.println("Música já está pausada.");
        }
    }

    @Override
    public void selecionarMusica() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número da música que você quer tocar");
            int numeroMusica = scanner.nextInt();

            if(numeroMusica >= 0){
                this.musicaSelecionada = numeroMusica;
                System.out.println("Música " + this.musicaSelecionada + " está tocando.");
            }
            else System.out.println("Música indisponível!");
        }
        catch (Exception e){
            System.out.println("Música indisponível!");
        }
    }
}
