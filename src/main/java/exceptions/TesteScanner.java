package exceptions;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
        }catch (Exception e){
            System.out.println("Teste");
        }finally {
            sc.close();
        }
        /*try {
            double resultado = 1 / 0;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Deu erro");
        }finally {
            System.out.println("chegou no finally");
        }*/
    }
}
