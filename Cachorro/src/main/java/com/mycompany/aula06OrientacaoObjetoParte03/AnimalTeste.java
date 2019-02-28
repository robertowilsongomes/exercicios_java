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
public class AnimalTeste {
    public static void main(String[] args) {
        
        Animal generico = new Animal(6, "peixe") {
            
            
            @Override
            public void fazerBarulho() {
                JOptionPane.showMessageDialog(null, "Miauuuu");
            }
        };
        
    Animal toto = new Cachorro();
    
    Animal coco = new Galinha();
  
    Animal Tornado = new Cavalo();
    
    toto.fazerBarulho();
    coco.fazerBarulho();
    generico.fazerBarulho();
    Tornado.fazerBarulho();
    toto.Correr();
    coco.Correr();
    Tornado.Correr();
    }

    
    
}
