/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaorh;

/**
 *
 * @author samuel.lsbraga
 */
public abstract class FuncionarioAutenticavel extends Funcionario{

    public FuncionarioAutenticavel(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public abstract double calcularSalario();
   
    
}
