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
public class TestaCacharro {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Eva ", 0.50, "Pastor Alemão ");
        cachorro1.latir();
        //System.out.println(cachorro1.toString());
JOptionPane.showMessageDialog(null,"" + cachorro1.toString());
    }

}
