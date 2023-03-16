/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividades1503;

/**
 *
 * @author aluno
 */
public class Paciente {

    public String nomePaciente;
    public String cpfPaciente;
    public int idadePaciente;
    public double pesoPaciente;
    public boolean eDeficiente;

    public Paciente(String nome, String cpf, int idade, double peso, boolean deficiente) {
        nomePaciente = nome;
        cpfPaciente = cpf;
        idadePaciente = idade;
        pesoPaciente = peso;
        eDeficiente = deficiente;
    }

    public String getInfoClientes() {
        return "Nome do paciente: " + nomePaciente + " CPF do paciente: " + cpfPaciente + "idade do paciente: "
                + idadePaciente + "peso do paciente: " + pesoPaciente + "deficiente? " + eDeficiente;
    }
}
