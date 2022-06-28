package String;

public class TesteString {

    public static void main(String[] args) {
        String s2 = new String("teste");
        String s = "teste" + "teste2";

        String s3 = "teste";

        StringBuilder sb = new StringBuilder();
        sb.append("teste").append("teste2");

        StringBuffer sf = new StringBuffer();
        sf.append("teste").append("teste2");

        System.out.println(s);
        System.out.println(sb);
        System.out.println(sf);

        String palavra = "minha palavra";
        String palavra2 = palavra.replace("a","b");
        System.out.println(palavra);
        System.out.println(palavra2);

    }
}
