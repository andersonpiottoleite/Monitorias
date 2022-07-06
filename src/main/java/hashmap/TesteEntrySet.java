package hashmap;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteEntrySet {

    public static void main(String[] args) throws IOException {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Teste1");
        hashMap.put(2, "Teste2");
        hashMap.put(3, "Teste3");

        System.out.println("imprimindo entrySet:");
        System.out.println(hashMap.entrySet());

        System.out.println("imprimindo keySet:");
        System.out.println(hashMap.keySet());

        System.out.println("imprimindo as chaves e valores do map:");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry: entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("imprimindo as chaves do map:");
        Set<Integer> integers = hashMap.keySet();
        for (Integer key: integers) {
            System.out.println(key);
        }

    }
}
