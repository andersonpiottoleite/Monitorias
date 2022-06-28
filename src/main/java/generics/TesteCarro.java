package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCarro {

    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.setNome("Ferrari");
        ferrari.setVelocidadeMaxima(360);

        Carro palio = new Carro();
        palio.setNome("Palio");
        palio.setVelocidadeMaxima(200);

        Carro chevete = new Carro();
        chevete.setNome("Chevete");
        chevete.setVelocidadeMaxima(90);

        List<Carro> carros = new ArrayList<>();
        carros.add(palio);
        carros.add(ferrari);
        carros.add(chevete);

        System.out.println("Imprimindo por ordem de inserção");
        for (Carro carro :carros) {
            System.out.println(carro.getNome());
        }

        System.out.println("Imprimindo novamente, agora ordenado por velocidade maxima");
        Collections.sort(carros);

        for (Carro carro :carros) {
            System.out.println(carro.getNome());
        }


    }
}
