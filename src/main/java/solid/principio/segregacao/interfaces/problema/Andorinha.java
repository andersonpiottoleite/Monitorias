package solid.principio.segregacao.interfaces.problema;

public class Andorinha implements  Ave{
    @Override
    public void bicar() {
        System.out.println("Bicando");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
