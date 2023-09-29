/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestaorh;

/**
 *
 * @author samuel.lsbraga
 */
public class GestaoRH {

    public static void main(String[] args) {
        
        var engenheiro = new Engenheiro(123, "Manoel Gomes");
        engenheiro.setSalario(5000);
        
        
        var gerente = new Gerente(50, "sMAUEL");
        gerente.setSalario(5000);
        
        var folhadepagamento = new FolhaDePagamento();
       
        
        
        folhadepagamento.registrar(engenheiro);
        folhadepagamento.registrar(gerente);
        
    }
}
