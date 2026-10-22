/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import estagiario.Estagiario;
import funcionario.java.Funcionario;
import model.Diretor;
import model.Programador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author André P. Alvarenga
 */
public class Model {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
}

import service.ControleDeBonificacoes;

public class Principal {
    public static void main(String[] args) {
        
         Funcionario p = new Programador("De Alvarenga, "111.222.333-44", 5000.0, "Java");
          Funcionario e = new Estagiario("sousa", "222.333.444-55", 1500.0, "Faculdade XYZ");
         Funcionario g = new Gerente("Marcos", "333.444.555-66", 8000.0, 1234);
         Funcionario d = new Diretor("Andre Alvarenga", "444.555.666-77", 12000.0, 5678);
    
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
         System.out.println("=== RELATÓRIO DE FUNCIONÁRIOS ===");
         System.out.println(p.exibirDados());
        System.out.println(e.exibirDados());
          System.out.println(g.exibirDados());
        System.out.println(d.exibirDados());
        controle.registra(p);
         controle.registra(e);
         controle.registra(g);
        controle.registra(d);
         System.out.println("\n--------------------------------------------------");
        System.out.printf("Total Geral de Bonificações: R$ %.2f\n", controle.getTotalBonificacoes());
        System.out.println("--------------------------------------------------");
    }
}



