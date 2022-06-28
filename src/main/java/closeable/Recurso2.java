package closeable;

import java.io.Closeable;
import java.io.IOException;

public class Recurso2 implements Closeable {

    public Recurso2(){
        System.out.println("chamando o construtor");
    }

    public void close() throws IOException {
        System.out.println("fechando o recurso");
    }

    public void metodo() {
        System.out.println("chamando o metodo");
    }
}
