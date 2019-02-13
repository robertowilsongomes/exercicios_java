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
public class Veiculo {
    private String cor;
    public int ano;
    public int velocidade;
    protected boolean ligado;
    
    public Veiculo(){
    }
    
    public void ligar() {
    System.out.println("Ligou");
    this.ligado = true;
    }
    
    public void desligar(){
    System.out.println("Desligou");
    this.ligado = false;
    }
    
    public void acelerar(){
    System.out.println("Acelerou");
    this.acelerar(1);
    }
    
    public void acelerar(int velocidade){
    this.velocidade +=velocidade;
    }
    
    public void frear(boolean parar){
    System.out.println("Freando");
    if (parar){
    this.velocidade = 0;
    }else{
    this.velocidade-=10;
    }
    }
   
   public Veiculo(String cor, int ano){
   this.cor = cor;
   this.ano = ano;
   }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
   
   
   
   
}
