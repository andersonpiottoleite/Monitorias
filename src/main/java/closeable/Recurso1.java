package closeable;

import java.io.Closeable;
import java.io.IOException;

public class Recurso1 implements Closeable {

    public Recurso1(){
        System.out.println("chamando o construtor");
    }

    @Override
    public void close() throws IOException {
        System.out.println("fechando o recurso");
    }

    public void metodo() {
        System.out.println("chamando o metodo");
    }
}
