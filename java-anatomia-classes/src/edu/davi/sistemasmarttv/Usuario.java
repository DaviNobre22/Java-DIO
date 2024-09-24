package edu.davi.sistemasmarttv;

public class Usuario {
    public static void main(String[] args) {
        Smarttv televisao = new Smarttv();

        System.out.println("Tv está ligada? " + televisao.ligada);
        System.out.println("Canal atual: " + televisao.canal);
        System.out.println("Qual volume? " + televisao.volume);
        
        televisao.ligar();
        System.out.println("Novo status -> TV ligada? " + televisao.ligada);

        televisao.desligar();
        System.out.println("Novo status -> Tv ligada? " + televisao.ligada);

        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.diminuirVolume();

        System.out.println("Novo Status -> Volume: " + televisao.volume);

        televisao.mudarDeCanal(10);
        
    }
    
}
