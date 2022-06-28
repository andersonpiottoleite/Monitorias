package solid.principio.segregacao.interfaces.solucao;

public class Andorinha implements Ave, AveVoadora {
    @Override
    public void bicar() {
        System.out.println("Bicando");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
