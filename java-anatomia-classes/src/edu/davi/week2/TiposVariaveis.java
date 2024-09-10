package edu.davi.week2;

public class TiposVariaveis {
   public static void main(String[] args) {
        // 8 Tipos: int, byte, short, long, float, double, boolean, char
        // int e float se começar com zero talvez tenha que ser outro tipo
        // float tem que colocar um F no final 
        byte idade = 18;
        short ano = 2024;
        int cep = 72268112;
        float pi = 3.14F;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;


        // Variaveis e Constantes
        int numero = 1;
        numero = 2;
        System.out.println(numero);
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
   }
}
