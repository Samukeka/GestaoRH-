/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaorh;

/**
 *
 * @author samuel.lsbraga
 */
public class Engenheiro  extends  Funcionario{

    
    private String departamento;
    private String crea;
            
    public Engenheiro(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public double calcularSalario() {
           return getSalario() * 1.5;
    }
    
    
    
    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    
    
}
