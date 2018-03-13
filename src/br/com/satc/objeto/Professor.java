/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinicius.132217
 */
public class Professor extends Pessoa {
    
 private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
 private int cargaHoraria;
 private float valorHorario;
 private float salario;

    public Professor(int cargaHoraria, float valorHorario, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.valorHorario = valorHorario;
        this.salario = this.calculaSalario(valorHorario, valorHorario);
    }

   

   
       
    public float calculaSalario(float qtdeHoras, float valorHoras){
        return qtdeHoras * valorHoras;
    }
 
 

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHorario() {
        return valorHorario;
    }

    public void setValorHorario(float valorHorario) {
        this.valorHorario = valorHorario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Disciplina=" + disciplina + "\n Carga Horaria=" + cargaHoraria + "\n Valor daHorario=" + valorHorario + "\n Salario=" + salario ;
    }
    
    
    
    
    
    
    
    
    
    
    
    

    

    
 
 

    
 
 
 
}
