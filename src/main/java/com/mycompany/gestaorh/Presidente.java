/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaorh;

/**
 *
 * @author samuel.lsbraga
 */
public final class Presidente  extends  FuncionarioAutenticavel{

    private double valorCotaDeAcoes;
    public Presidente(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + valorCotaDeAcoes;
    }
    
    
    

    public double getValorCotaDeAcoes() {
        return valorCotaDeAcoes;
    }

    public void setValorCotaDeAcoes(double valorCotaDeAcoes) {
        this.valorCotaDeAcoes = valorCotaDeAcoes;
    }
 
    
}
