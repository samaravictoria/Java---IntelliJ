package br.com.fiap.Aula05.Execussao;

import br.com.fiap.Aula05.Model.Funcionario;
import br.com.fiap.Aula05.Model.Profissao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Profissao devJunior = new Profissao("Desenvolvedor Júnior");
    Funcionario karla = new Funcionario(107640, "Karla", devJunior);
    karla.setSalario(6500.00);

        System.out.println(karla.exibirDados());
    }

}