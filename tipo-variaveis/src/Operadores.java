public class Operadores {
    public static void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto);


        // String concatenacao ="?"; 
        
        // System.out.println(concatenacao);

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);
        // //DEBUGAR ESSE CÓDIGO F10

        int numero = 5;
        System.out.println(- numero); //Ficou -5


        //Se eu quero colocar o numero em forma de negativo
        numero = -numero;
        System.out.println(numero);
        
        //Deixar o valor positivo
        numero =  numero * -1;
        System.out.println(numero);

        //Incrimento de numeros

        //x repeticao
        int num = 5;
        // num = num + 2
        num += 2;

        //numero = numero +1
        num++;

        //Qual momento quer realizar o incremento
        System.out.println(++num); // Vai pegar e vai imprimir como num = num + 1 ++ a esuqerda ele aumenta a esquerda não


        //Deixar boolean de true para false
        boolean variavel2 = true;
        // variavel2 != variavel2
        System.out.println(!variavel2);


        //Opertador ternario
        // classe Operadores.java
      int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = " ";
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);


        //Relacionais
        int numero1 = 1;
        int numero2 = 2;

     //Metodo equal deixa igual Caso for objeto/String
        String nomeUm = "Gabriel";
        String nomeDois = new String("Gabriel");
        
        /* if(numero1 < numero2)
        System.out.print("Numero 1 menor que numero 2");
        simNao = numero1 != numero2;System.out.println("Numero um e  igual a numero ?" + simNao); */
       

   

        System.out.println(nomeUm.equals(nomeDois));
        
        boolean simNao = numero1 == numero2;
        System.out.println("Numero um e  igual a numero ?" + simNao);

        simNao = numero1 != numero2;System.out.println("Numero um e  igual a numero ?" + simNao);

        //Logicos
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && (7 > 4)){
            System.out.println("Os dois valores são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras");
        }

        System.out.println("FIM");

    }
    
}
