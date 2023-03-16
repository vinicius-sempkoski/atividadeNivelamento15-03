/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividades1503;

/**
 *
 * @author aluno
 */
public class Sintoma {

    public String sintomaa;
    public boolean dorLocalizada;
    public int diasComSintoma;
    public double riscoInfeccao;
    public char tipoSanguineo;

    public Sintoma(String sintom, boolean dorLoc, int dias, double riscoi, char tiposangue) {
        sintomaa = sintom;
        dorLocalizada = dorLoc;
        diasComSintoma = dias;
        riscoInfeccao = riscoi;
        tipoSanguineo = tiposangue;
    }

    public String getInfoCadastro() {
        return "Sintoma informado: " + sintomaa + " Dor localizada: " + dorLocalizada + " Dias com sintoma: " + diasComSintoma
                + " tem risco de infeccao? " + riscoInfeccao + " tipo sanguineo: " + tipoSanguineo;
    }

}
