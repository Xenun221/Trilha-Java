public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Existem palavras reservadas para tipos de dados básicos. Estes tipos de dados são conhecidos como tipos primitivos
        //Os Tipos primitivos são: int: byte: short, long, float, double, boolean e char - esses tipos não são considerados objetos
        //E mais comum usar int por questão de compatibilidade na JVM

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo. Precisa terminar com L no final tmb
		float pi = 3.14F; // obrigatorio esse f no final pois se não ele vai achar que e um double
		double salario = 1275.33;


            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal; //Casting ele pega um tipo mais abrangente e converte para um tipo mais especifico pois e o tipo coorespondente

      
            //Definir que esse valor nunca podera ser alterado
            //Variaveis x Constantes

            //Para não alterar o valor precisando usar a palavra final e Usar letra MAIUSCULA no nome da variavel
            final int NUMERO = 221;
            System.out.println(NUMERO);
            
            //Representando Texto
            String meuNome = "Gabriel";


    }
}
