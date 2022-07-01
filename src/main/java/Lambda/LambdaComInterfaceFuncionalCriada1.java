package Lambda;

public class LambdaComInterfaceFuncionalCriada1 {

    public static void main(String[] args) {
        MinhaClassePrincipal minhaClassePrincipal = new MinhaClassePrincipal();

        // usando a logica da classe nomeada
        ClasseComNome classeComNome = new ClasseComNome();
        minhaClassePrincipal.metodo("Vida",classeComNome);


        //usando a logica da classe anonima
       minhaClassePrincipal.metodo("Vida", new Funcional() {
            @Override
            public void metodo(String s) {
                System.out.println("Imprimindo a partir da classe anonima: " + s);
            }
        });

        // usando a logica do lambda
        minhaClassePrincipal.metodo("Vida", r -> System.out.println("Imprimindo a partir do lamda: " + r));

        // usando a logica do lambda, mas com mais de uma linha de código no escopo
        minhaClassePrincipal.metodo("Vida", s -> {
            System.out.println("Imprimindo a partir do lamda: " + s);
            System.out.println("Imprimindo outra vez partir do lamda: " + s);
        });

    }
}

@FunctionalInterface
interface Funcional{
    void metodo(String s);
}

class MinhaClassePrincipal {
    public void metodo(String s, Funcional funcional){
        funcional.metodo(s);
    }
}

class ClasseComNome implements Funcional{

    @Override
    public void metodo(String s) {
        System.out.println("Imprimindo a partir da classe com nome: " + s);
    }
}

