package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("palavra 1");
        s.add("palavra 2");

        s.forEach( c-> System.out.println(s));
    }
}
