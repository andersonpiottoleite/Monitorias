package generics;

import java.util.ArrayList;
import java.util.List;

public class TesteGenerics {

    public static void main(String[] args) {

        List objetos = new ArrayList();
        
        objetos.add("texto");
        objetos.add(1);
        objetos.add(0.0);

        Float o = (Float) objetos.get(0);

        Integer o1 = (Integer) objetos.get(1);

        Double o2 = (Double) objetos.get(2);

        for (Object obj: objetos) {
            if (obj instanceof String){
                String s = (String) obj;
                System.out.println(s);

            } else if (obj instanceof Integer){
                Integer i = (Integer) obj;
                System.out.println(i);

            } else if (obj instanceof Double){
                Double d = (Double) obj;
                System.out.println(d);
            }
        }

        System.out.println(o);
        System.out.println(o1);
        System.out.println(o2);

        List<String> listString = new ArrayList<>();
        listString.add("texto");
        listString.add("nova String");

        for (String s :listString) {
            System.out.println(s.replace("t","x"));
        }

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);

    }
}
