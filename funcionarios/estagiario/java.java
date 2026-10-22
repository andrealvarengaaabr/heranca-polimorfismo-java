/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estagiario;

/**
 *
 * @author André P. Alvarenga
 */
public class java {
    
}
package model;

public class Estagiario extends Funcionario {
    private String instituicaoDeEnsino;

    public Estagiario(com.sun.org.apache.xpath.internal.operations.String nome, String cpf, double salario, String instituicaoDeEnsino) {
        super(nome, cpf, salario);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    @Override
    public double getBonificacao() {
        return 200.0;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " | Instituição de Ensino: " + instituicaoDeEnsino;
    }
}