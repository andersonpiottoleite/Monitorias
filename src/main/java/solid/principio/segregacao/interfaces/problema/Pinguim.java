package solid.principio.segregacao.interfaces.problema;

public class Pinguim implements Ave {

    @Override
    public void bicar() {
        System.out.println("bicando");
    }

    @Override
    public void voar() {
        // pinguim voa?
    }
}
