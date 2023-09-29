/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaorh;

/**
 *
 * @author samuel.lsbraga
 */
public class Gerente extends FuncionarioAutenticavel{
    
    private String area;
    private double bonus;
    
    public Gerente(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public double calcularSalario() {
        
        return getSalario() + bonus;
    }
    
    
    
    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}
