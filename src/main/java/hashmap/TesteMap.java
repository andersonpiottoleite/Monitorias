package hashmap;

import java.util.HashMap;

public class TesteMap {

    public static void main(String[] args) {

        Professor p1 = new Professor();
        p1.setNome("Jhonatas");

        Professor p2 = new Professor();
        p2.setNome("Professor pardal");

        HashMap<String, Professor> map = new HashMap<>();
        map.put("Chave professor 1", p1);
        map.put("Chave professor 2", p2);

        System.out.println(map.get("Chave professor 1").getNome());
        System.out.println(map.get("Chave professor 2").getNome());
        System.out.println(map.toString());


    }

}
