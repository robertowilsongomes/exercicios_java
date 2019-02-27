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
public class Cachorro extends Animal {

    
    
    
    public Cachorro(double peso, String comida) {
        super(peso, comida);
        super.id = 1;
        
    }
    public Cachorro() {
        super(5, "Ração");
        
    }
    
    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null,"Au Au");
    
    }
}
