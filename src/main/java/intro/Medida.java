// Pacotes
package intro;

// Referencia a Bibliotecas

//Classe
public class Medida {
    // Atributos - Características

    // Métodos e Funções
    public static void main(String[] args){
        System.out.println("Bom dia!");
        System.out.println("Hello World!");
        System.out.println("Cálculo de áreas!");

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
    public void calcularAreaCompacta(){
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m².");
    }
}