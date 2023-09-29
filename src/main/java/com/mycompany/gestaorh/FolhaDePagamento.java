/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaorh;

/**
 *
 * @author samuel.lsbraga
 */
public class FolhaDePagamento {
    
    private double total;
    
    public double calcularFolha(){
    return total;
    }
    
    public void registrar(Funcionario funcionario){
    total += funcionario.calcularSalario();
    }
    
    public void logar(FuncionarioAutenticavel funcionario){
        System.out.println(funcionario.getNome() + "Logado");
    }
    public void logar(Gerente funcionario){
        System.out.println(funcionario.getNome() + "Logado");
    }
    public void logar(Presidente funcionario){
        System.out.println(funcionario.getNome() + "Logado");
    }
    
    
}
