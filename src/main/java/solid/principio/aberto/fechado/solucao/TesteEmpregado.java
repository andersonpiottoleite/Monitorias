package solid.principio.aberto.fechado.solucao;

public class TesteEmpregado {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(10000);

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(5000);

        Atendente atendente = new Atendente();
        atendente.setSalario(2000);

        GerenciadorPagamento gerenciadorPagamento = new GerenciadorPagamento();

        gerenciadorPagamento.aumentaSalario(new CalculadorSalarioGerente(), gerente);
        gerenciadorPagamento.aumentaSalario(new CalculadorSalarioSupervisor(), supervisor);
        gerenciadorPagamento.aumentaSalario(new CalculadorSalarioAtendente(), atendente);

        System.out.println(gerente.getSalario());
        System.out.println(supervisor.getSalario());
        System.out.println(atendente.getSalario());

    }
}
