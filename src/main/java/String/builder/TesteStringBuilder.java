package String.builder;

public class TesteStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("primeira string \n");
        sb.append("segunda string  \n");
        sb.append("terceira string  \n");

        System.out.println(sb.toString());

        String s = "teste" + "teste2";


    }
}
