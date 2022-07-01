package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaComInterfaceFuncionalDoJava {

    public static void main(String[] args) {

        List<String> futebol = new ArrayList<>();
        futebol.add("trave");
        futebol.add("bola");
        futebol.add("chuteira");

        futebol.forEach(p -> System.out.println(p));

        // usando classe declarada
        Consumer<String> consumidor = new ConsumidorDeString();
        futebol.forEach(consumidor);

        // usando classe anonima
        futebol.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println("Classe anonima: " + s);
            }
        });

        // usando lambda
        futebol.forEach(s -> System.out.println("Lambda: " + s));

    }
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println("Classe nomeada: " + s);
    }
}
