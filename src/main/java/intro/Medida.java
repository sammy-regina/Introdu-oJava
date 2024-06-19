// Pacotes
package intro;

// Referencia a Bibliotecas

import java.util.Scanner;

//Classe
public class Medida {
    // Atributos - Características

    // Métodos e Funções
    public static void main(String[] args){

        // Utilizando classe scanner do Java para ler a escolha do usuário no console
        // objeto scanner = poderes da classe Scanner (System.in é a entrada do teclado)
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----  OPÇÕES  ----- ");
        System.out.println("c - Calcular Area Compacta: ");
        System.out.println("l - Calcular Area Modo Longo: ");
        System.out.println("i - Calcular IfSimples: ");
        System.out.println("d - Contagem Crescente: ");
        System.out.println("r - Contagem Regressiva: ");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //Estrutura condicional switch = seleciona o comportamento do programa de acordo com escolha da pessoa
        //String opcao = "ifSimples";

        switch (opcao){
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples!");
                ifSimples();
                break;
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método compacta!");
                calcularAreaCompacta();
                break;
            case "l":
            case "L":
                System.out.println("Você escolheu executar o método longa!");
                calcularAreaLonga();
                break;
            case "D":
            case "d":
                System.out.println("Você escolheu executar o método contarAteDez!");
                contarAteDez();
                break;
            case "R":
            case "r":
                System.out.println("Você escolheu executar o método contarAteZero!");
                contarAteZero();
                break;
            default:
                System.out.println("Escolha um valor válido!");
                break;
        }
    }
    public static void ifSimples() {
        //Estrutura condicional = verificar condição

        String modo = "compacta";

        if (modo == "compacta") {
            calcularAreaCompacta();
        }
        else {
            calcularAreaLonga();
        }
    }
    public static void calcularAreaLonga(){
        System.out.println("Bom dia!");
        System.out.println("Hello World!");
        System.out.println("Cálculo de áreas!");

        System.out.println("Calculo de área longa");

        //Calculo de área
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;
        resultado = largura * comprimento;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m².");
    }

    // Cálculo de área reduzido
    public static void calcularAreaCompacta(){
        System.out.println("Calculo de área Compacta");

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m².");
    }
    public static void contarAteDez(){
        //Laços de repetições
        //for = repetição incondicional
        System.out.println("contagem Crescente");
        for (int numero = 1; numero <= 10; numero ++){
            System.out.println(numero);
        }
    }
    public static void contarAteZero(){
        //Laços de repetições
        //for = repetição incondicional
        System.out.println("contagem Regressiva");
        for (int numero = 10; numero >= 0; numero --){
            System.out.println(numero);
        }
    }
}