package solid.principio.aberto.fechado.solucao;

public class CalculadorSalarioGerente implements CalculadorSalario {
    @Override
    public void aumentaSalario(Empregado empregado) {
        empregado.setSalario(empregado.getSalario() + (empregado.getSalario() * 20) / 100);
    }
}
