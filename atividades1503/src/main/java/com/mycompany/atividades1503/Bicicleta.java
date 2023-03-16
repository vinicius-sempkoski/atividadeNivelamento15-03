/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividades1503;

/**
 *
 * @author aluno
 */
public class Bicicleta {
    public String marca;
    public String modelo;
    public String fabricante;
    private double precoBike;
    private String corBike;
    private int tam;
    private int marchas;
    
    public void corEpreco(String cor, double preco){
        corBike = cor;
        precoBike = preco;
    }
    
    public void setMarchaeAro(int aro, int marcha){
        tam = aro;
        marchas = marcha;
    }
    public String info(){
        return "Tamanho aro "+tam +"quantidade marchas "+marchas+" Preço: "+ precoBike;
    }
    public Bicicleta(String mrc, String model,String fab){
        marca = mrc;
        modelo = model;
        fabricante = fab;
        
    }
    public String getMarca(){
        return "Marca: " +marca;
    }
    
}
