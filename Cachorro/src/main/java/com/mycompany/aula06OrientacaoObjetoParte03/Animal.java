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
public class Animal extends Object{
protected int id;
private double peso;
private String comida;

public Animal(double peso, String comida) {
    this.peso = peso;
    this.comida = comida;
}
public void dormir() {
    JOptionPane.showMessageDialog(null, "Animal Dormindo!");
}    
public void fazerBarulho() {
    JOptionPane.showMessageDialog(null, "Animal fazendo barulho!");
}    

public void fazerBarulhoSemPolimorfismo() {
if (this instanceof Cachorro) {
    System.out.println("Au Au");
}else if (this instanceof Galinha){ 
System.out.println("Có Có");
}
}
    
    
}
