/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cachorro;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Cachorro {

    String nome;
    double tamanho;
    String raca;

    public void latir() {
        //System.out.println("au, au");
        JOptionPane.showMessageDialog(null, this.nome + (this.tamanho > 1 ? "Wo Wo" : "Au Au"));
        
    }
    
    
    public Cachorro(String nome, double tamanho, String raca){
    this.nome = nome;
    this.raca = raca;
    this.tamanho = tamanho;
        
    }

    @Override
    public String toString() {
        return "Cachorro " + "nome= " + nome + ", tamanho= " + tamanho + ", raca= " + raca ;
    }
   
    
}
