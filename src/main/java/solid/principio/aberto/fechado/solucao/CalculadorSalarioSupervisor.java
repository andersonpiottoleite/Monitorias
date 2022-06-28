package solid.principio.aberto.fechado.solucao;

public class CalculadorSalarioSupervisor implements CalculadorSalario {
    @Override
    public void aumentaSalario(Empregado empregado) {
        empregado.setSalario(empregado.getSalario() + (empregado.getSalario() * 10) / 100);
    }
}
