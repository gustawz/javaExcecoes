package br.edu.etec.meuprojeto.teste;



public class Teste {
    public static void main(String[] args) {
        try{
            int x = 1/0;
        }catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        
        System.out.println("continuou a execucao...");
    }
    
}
