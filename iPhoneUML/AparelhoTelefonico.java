package iPhoneUML;

import iPhoneUML.interfaces.IAparelhoTelefonico;

class AparelhoTelefonico implements IAparelhoTelefonico {
    private boolean emChamada;

    public AparelhoTelefonico(){
        emChamada = false;
    }

    @Override
    public void ligar() {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Ligando para um contato...");
        } else {
            System.out.println("Já está em uma chamada.");
        }
    }

    @Override
    public void atender() {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Atendendo a chamada...");
        } else {
            System.out.println("Já está em uma chamada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
