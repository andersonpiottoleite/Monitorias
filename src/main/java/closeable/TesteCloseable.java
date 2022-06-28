package closeable;

import java.io.IOException;

public class TesteCloseable {

    public static void main(String[] args) throws IOException {
        try (Recurso1 recurso1 = new Recurso1()) {
            recurso1.metodo();
        }

        try (Recurso2 recurso2 = new Recurso2()) {
            recurso2.metodo();
        }
    }
}
