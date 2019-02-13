/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cachorro;

/**
 *
 * @author aluno
 */
public class TestaVeiculo {

    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo("Prata", 2011);
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.acelerar(40);

        meuCarro.setAno(2008);
        meuCarro.setCor("vermelho");
        meuCarro.setLigado(true);
        meuCarro.setVelocidade(120);

    
    
    
    
    
    
    }

}
