package reflection;

import generics.Carro;

import java.lang.reflect.Field;

public class TesteReflection {

    public static void main(String[] args) {
        Carro carro = new Carro();

        // obtendo os atributos da classe ...
        // o metodo getClass() definido em object, retorna a estrutura da Classe
        // o metodo getDeclaredFields() retorna os atributos da Classe
        Field[] atributos = carro.getClass().getDeclaredFields();

        // percorrendo e imprimindo os atributos...
        // o metodo getType() retorna os tipos dos atributos
        for (Field f: atributos) {
            System.out.println(f.getType());
        }
    }
}
