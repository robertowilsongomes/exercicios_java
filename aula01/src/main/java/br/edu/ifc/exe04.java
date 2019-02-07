/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class exe04 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu Nome: ");
        Double peso = Double.parseDouble(
                JOptionPane.showInputDialog("Informe seu peso: "));

        Double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Informe sua altura: "));

        Double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\n"
                + "IMC: " + imc + "\n"
                + "Resultado: " + verificarTipo(imc));

    }

    public static String verificarTipo(double imc) {
        String resultado = null;
        if (imc < 18.5) {
            resultado = "Peso abaixo do normal";
        } else if (imc >= 18.6 && imc <= 24.4) {
            resultado = "Peso ideal";
        } else if (imc >= 24.5 && imc <= 29.9) {
            resultado = "Pré-obesidade";
        } else if (imc >= 30 && imc <= 34.9) {
            resultado = "Obesidade classe I";
        } else if (imc >= 35 && imc <= 39.9) {
            resultado = "Obesidade classe II (severa)";
        } else if (imc >= 40) {
            resultado = "Obesidade classe III (mórbida)";
        }

        return resultado;
    }

}
