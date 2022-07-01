package Lambda;

public class LambdaComInterfaceFuncionalCriada2 {

    public static void main(String[] args) {
        MinhaClassePrincipal2 minhaClassePrincipal2 = new MinhaClassePrincipal2();

        // usando a logica da classe nomeada
        ClasseComNome2 classeComNome2 = new ClasseComNome2();
        minhaClassePrincipal2.metodo("Vida1", "Vida2", classeComNome2);


        //usando a logica da classe anonima
        minhaClassePrincipal2.metodo("Vida1","Vida2", new Funcional2() {
            @Override
            public void metodo(String s1, String s2) {
                System.out.println("Imprimindo a partir da classe anonima: " + s1 + " " + s2);
            }
        });

        // usando a logica do lambda
        minhaClassePrincipal2.metodo("Vida1","Vida2", (s1 ,s2) -> System.out.println("Imprimindo a partir do lamda: " + s1 + " " + s2));

        // usando a logica do lambda, mas com mais de uma linha de código no escopo
        minhaClassePrincipal2.metodo("Vida1","Vida2", (s1 ,s2) -> {
            System.out.println("Imprimindo a partir do lamda: " + s1 + " " + s2);
            System.out.println("Imprimindo otra vez partir do lamda: " + s1 + " " + s2);
        });

    }
}

@FunctionalInterface
interface Funcional2{
    void metodo(String s1, String s2);

}

class MinhaClassePrincipal2 {
    public void metodo(String s1, String s2, Funcional2 funcional){
        funcional.metodo(s1, s2);
    }
}

class ClasseComNome2 implements Funcional2{

    @Override
    public void metodo(String s1, String s2) {

        System.out.println("Imprimindo a partir da classe com nome: " + s1 +" "+ s2);
    }
}

