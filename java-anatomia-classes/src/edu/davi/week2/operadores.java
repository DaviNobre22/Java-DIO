package edu.davi.week2;

public class operadores {
    // incrementação
    public static void main(String[] args) {
        int numero = 5;

        numero++;

        System.out.println(numero);

        boolean verdadeiro = true;

        System.out.println(!verdadeiro);

        //ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "são iguais" : "Diferentes";
        System.out.println(resultado);
        //igual a 
        if(a==b){
            resultado = "Verdadeiro";

        }
        else 
            resultado = "Falso";
        System.out.println(resultado);
        // para numero usa-se =, strings .equals
        String nomeUm = "Davi";
        String nomeDois = new String("Davi");
        System.out.println(nomeUm.equals(nomeDois));

        //&& == "E" e || = "OU"
        boolean condicaoUm = true;
        boolean condocaoDois = false;
        if(condicaoUm && condocaoDois){
            System.out.println("As duas condições sao verdadeiras");
        }
        else if(condicaoUm || condocaoDois){
            System.out.println("Uma das duas é verdadeira");
        }

        if(condicaoUm && (7 > 4)){
            System.out.println("As duas condições sao verdadeiras");
        }
        

        
        
    }
    
}
