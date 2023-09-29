/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaorh;

/**
 *
 * @author samuel.lsbraga
 */
public abstract class Funcionario {
    
    private int codigo;
    private String nome;
    private double salario;
    

    public Funcionario(int codigo, String nome) {
        super();
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public abstract double calcularSalario();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
