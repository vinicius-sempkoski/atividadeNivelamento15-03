/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades1503;


/**
 *
 * @author aluno
 */
public class barPed {

    public static void main(String[] args) {


        CadastrarP cadastrar1 = new CadastrarP();
        cadastrar1.setNomeP("Lucas");
        cadastrar1.setDate("10/03");
        cadastrar1.setPedido("Coca");
        cadastrar1.setMesa(3);
        cadastrar1.setValor(12.50);

        CadastrarP cadastrar2 = new CadastrarP();
        cadastrar2.setNomeP("Joao");
        cadastrar2.setDate("10/03");
        cadastrar2.setPedido("Cerveja");
        cadastrar2.setMesa(7);
        cadastrar2.setValor(8.00);
        CadastrarP cadastrar3 = new CadastrarP();
        
        cadastrar3.setNomeP("Fernanda");
        cadastrar3.setDate("10/03");
        cadastrar3.setPedido("Vodka");
        cadastrar3.setMesa(1);
        cadastrar3.setValor(22.50);
        CadastrarP cadastrar4 = new CadastrarP();
        
        cadastrar4.setNomeP("Vinicius");
        cadastrar4.setDate("10/03");
        cadastrar4.setPedido("Cerveja 0");
        cadastrar4.setMesa(11);
        cadastrar4.setValor(14.50);
        CadastrarP cadastrar5 = new CadastrarP();
        
        cadastrar5.setNomeP("Bruna");
        cadastrar5.setDate("10/03");
        cadastrar5.setPedido("Drink - Limao");
        cadastrar5.setMesa(2);
        cadastrar5.setValor(16.00);
        
        System.out.println("Total de todos os pedidos: "+(cadastrar1.getValor() + cadastrar2.getValor() + cadastrar3.getValor() + cadastrar4.getValor() + cadastrar5.getValor()));
        
    }

}
