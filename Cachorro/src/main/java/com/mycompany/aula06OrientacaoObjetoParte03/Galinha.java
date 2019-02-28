/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula06OrientacaoObjetoParte03;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Galinha extends Animal {

    public Galinha(double peso, String comida) {
        super(peso, comida);
        super.id = 2;
    }
    public Galinha() {
        super(1.4, "milho");
        
    }
    
    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null,"Co Có");
    }
       
    @Override
    public void Correr() {
        JOptionPane.showMessageDialog(null, "ciscando");
    }
    
    
    
    
}
