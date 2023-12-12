/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecte_git_01;

/**
 *
 * @author lleyton.camram.dam_i
 */
public class clase_asignatura {
    private final String curso;
    private final double nota;
       
// Constructor
    public clase_asignatura(String curso, double nota)
{
        this.curso = curso;
        this.nota = nota;
}
    public void saludar(){
        System.out.println ("Hola, jo estudio " + curso + " i la meva nota es " + nota);
    }
}