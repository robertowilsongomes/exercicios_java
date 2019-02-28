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
public class Cavalo extends Animal{
    
    public Cavalo(double peso, String comida) {
        super(peso, comida);
        super.id = 3;
        
    }
    public Cavalo() {
        super(200, "Pasto");
    }
    
    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null,"Blublublu");
    
    }
    
    
    @Override
   public void Correr() {
        JOptionPane.showMessageDialog(null, "Relincha");
   }      
        
        
}
