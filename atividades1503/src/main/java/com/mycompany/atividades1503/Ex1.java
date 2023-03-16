/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.atividades1503;

/**
 *
 * @author aluno
 */
public class Ex1 {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Vinicius", "029.495.192-59", 27, 77, true);
        Paciente paciente2 = new Paciente("Fernanda", "013.425.112-92", 32, 11, true);
        Paciente paciente3 = new Paciente("Lucas", "918.492.915-23", 34, 34, true);
        Paciente paciente4 = new Paciente("Allan", "912.321.601-62", 11, 24, false);
        Paciente paciente5 = new Paciente("Kako", "029.213.012-52", 14, 66, false);

        System.out.println(paciente1.getInfoClientes());
        System.out.println(paciente2.getInfoClientes());
        System.out.println(paciente3.getInfoClientes());
        System.out.println(paciente4.getInfoClientes());
        System.out.println(paciente5.getInfoClientes());

        Sintoma sintoma1 = new Sintoma("dor cabeca", true, 15, 95.3, 'a');
        Sintoma sintoma2 = new Sintoma("colera", false, 11, 23.7, 'a');
        Sintoma sintoma3 = new Sintoma("ucera", true, 12, 23.1, 'o');
        Sintoma sintoma4 = new Sintoma("nausea", true, 63, 21.2, 'a');
        Sintoma sintoma5 = new Sintoma("carea", false, 22, 55.3, 'e');
        Sintoma sintoma6 = new Sintoma("lea", true, 25, 22.3, 'o');

        System.out.println(sintoma1.getInfoCadastro());
        System.out.println(sintoma2.getInfoCadastro());
        System.out.println(sintoma3.getInfoCadastro());
        System.out.println(sintoma4.getInfoCadastro());
        System.out.println(sintoma5.getInfoCadastro());
        System.out.println(sintoma6.getInfoCadastro());

    }
}
