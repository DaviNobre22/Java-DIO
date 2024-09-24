package edu.davi.sistemasmarttv;

public class Smarttv {
    boolean ligada = false;
    int canal =  1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

    }
    public void mudarDeCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);

    }
}
