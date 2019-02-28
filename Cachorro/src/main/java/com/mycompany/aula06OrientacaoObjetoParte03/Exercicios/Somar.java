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
public class Somar extends OperacaoMatematica {
private double somar;

    public Somar() {
        
    }



    @Override
    public void calcular(double num1, double num2) {
        somar = num1 + num2;
        JOptionPane.showMessageDialog(null, somar+ "O Valor da soma é: ");
    }
 
    
}
