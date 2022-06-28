package solid.principio.aberto.fechado.problema;

import solid.principio.aberto.fechado.solucao.CalculadorSalario;

public class GerenciadorPagamento {

    public void aumentaSalario(Empregado empregado){
        if (empregado instanceof Gerente){
            empregado.setSalario(empregado.getSalario() + (empregado.getSalario() * 20) / 100);

        } else  if (empregado instanceof Supervisor){
            empregado.setSalario(empregado.getSalario() + (empregado.getSalario() * 10) / 100);

        } else  if (empregado instanceof Atendente){
            empregado.setSalario(empregado.getSalario() + (empregado.getSalario() * 5) / 100);
        }
    }
}
