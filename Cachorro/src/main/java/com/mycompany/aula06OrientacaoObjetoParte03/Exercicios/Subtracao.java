/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula06OrientacaoObjetoParte03.Exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Subtracao extends OperacaoMatematica {
private double subtrair;

    public Subtracao() {
        
    }

    @Override
    public void calcular(double num1, double num2) {
        subtrair = num1 + num2;
        JOptionPane.showMessageDialog(null, subtrair+ "O Valor da subtração é: ");
    }
 
    
}
    
    
    
    
