package edu.davi.week1;
public class MinhaClass {
    public static void main (String [] args){
        String primeiroNome = "Davi";
        String segundoNome = "Ribeiro";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

}
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
