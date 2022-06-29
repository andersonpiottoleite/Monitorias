package reflection;

import generics.Carro;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TesteReflection {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {


        criandoInstanciaDaClasse();
        chamaController();

        //Carro carro = new Carro();
        //getNomeSimplesClasse(carro);
        //getNomeCompletoDaClasse(carro);
        //getConstrutorDefault(carro);
        //getTodosOsConstrutores(carro);
        //getAtributos(carro);
        //getMetodos(carro);
        //getQuantidadeDeParametroNosMetodos(carro);
        //getTipoDeRetornoDosMetodos(carro);
        //getMetodoEspecifico(carro);
        //getRetornoDeMetodoEspecifico(carro);
    }

    private static void getNomeSimplesClasse(Carro carro) {
        // nome completo da classe
        System.out.println(carro.getClass().getSimpleName());
    }
    private static void getNomeCompletoDaClasse(Carro carro) {
        // nome completo da classe
        System.out.println(carro.getClass().getName());
    }

    private static void getConstrutorDefault(Carro carro) throws NoSuchMethodException {
        Constructor<? extends Carro> declaredConstructor = carro.getClass().getDeclaredConstructor();
        // construtor defaut
        System.out.println(declaredConstructor);
    }

    private static void getTodosOsConstrutores(Carro carro) {
        // todos os construtores
        Constructor<?>[] declaredConstructors = carro.getClass().getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            System.out.println(declaredConstructors[i]);
        }
    }

    private static void getAtributos(Carro carro) {
        // obtendo os atributos da classe ...
        // o metodo getClass() definido em object, retorna a estrutura da Classe
        // o metodo getDeclaredFields() retorna os atributos da Classe
        Field[] atributos = carro.getClass().getDeclaredFields();

        // percorrendo e imprimindo os atributos...
        // o metodo getType() retorna os tipos dos atributos
        for (Field f: atributos) {
            System.out.println(f.getType());
        }

        for (Field f: atributos) {
            System.out.println(f.getName());
        }
    }

    private static void getMetodos(Carro carro) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // nome completo da classe

        Method[] declaredMethods = carro.getClass().getDeclaredMethods();
        for (Method m: declaredMethods) {
            System.out.println(m.getName());
        }
    }

    private static void getMetodoEspecifico(Carro carro) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {
        Method metodo = carro.getClass().getDeclaredMethod("getNome", null);
        System.out.println(metodo);

        Method metodo2 = carro.getClass().getDeclaredMethod("setNome", String.class);
        System.out.println(metodo2);
    }

    private static void getRetornoDeMetodoEspecifico(Carro carro) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {
        Method metodo = carro.getClass().getDeclaredMethod("getNome", null);
        System.out.println(metodo.getReturnType());

        Method metodo2 = carro.getClass().getDeclaredMethod("setNome", String.class);
        System.out.println(metodo2.getReturnType());
    }

    private static void getQuantidadeDeParametroNosMetodos(Carro carro) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // nome completo da classe

        Method[] declaredMethods = carro.getClass().getDeclaredMethods();
        for (Method m: declaredMethods) {
            System.out.println(m.getParameterCount());
        }
    }

    private static void getTipoDeRetornoDosMetodos(Carro carro) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // nome completo da classe

        Method[] declaredMethods = carro.getClass().getDeclaredMethods();
        for (Method m: declaredMethods) {
            System.out.println(m.getReturnType());
        }
    }

    private static void criandoInstanciaDaClasse() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // nome completo da classe
        Class<?> classe =  Class.forName("generics.Carro");
        System.out.println(classe);
        System.out.println(classe.newInstance());
    }

    private static void chamaController(){
        // primeira chamada uri: localhost:8080/contextoDaAplicacao/mecanico/1
        // segunda chamada uri: localhost:8080/contextoDaAplicacao/peca/1

        IdentificadorControllerReflection identificadorControllerReflection
                = new IdentificadorControllerReflection("reflection.");
        identificadorControllerReflection.executa("/mecanico/1");
        identificadorControllerReflection.executa("/peca/1");
    }
}
