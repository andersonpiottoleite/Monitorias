package solid.principio.aberto.fechado.solucao;

public class CalculadorSalarioAtendente implements CalculadorSalario {
    @Override
    public void aumentaSalario(Empregado empregado) {
        empregado.setSalario(empregado.getSalario() + (empregado.getSalario() * 5) / 100);
    }
}
