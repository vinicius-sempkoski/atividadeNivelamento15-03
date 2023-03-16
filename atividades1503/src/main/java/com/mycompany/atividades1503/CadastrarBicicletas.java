/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades1503;

/**
 *
 * @author aluno
 */
public class CadastrarBicicletas {

    public static void main(String[] args) {

        Bicicleta bike1 = new Bicicleta("Honda", "Modelo Top", "China");
        bike1.setMarchaeAro(6, 20);
        bike1.corEpreco("Preta", 1.999);

        Bicicleta bike2 = new Bicicleta("Honda", "Modelo Top", "China");
        bike1.setMarchaeAro(6, 20);
        bike1.corEpreco("Preta", 1.999);

        Bicicleta bike3 = new Bicicleta("Honda", "Modelo Top", "China");
        bike1.setMarchaeAro(6, 20);
        bike1.corEpreco("Preta", 1.999);

        Bicicleta bike4 = new Bicicleta("Honda", "Modelo Top", "China");
        bike1.setMarchaeAro(6, 20);
        bike1.corEpreco("Preta", 1.999);
        
        System.out.println(bike1.info());
        System.out.println(bike2.info());
        System.out.println(bike2.getMarca());
    }

}
