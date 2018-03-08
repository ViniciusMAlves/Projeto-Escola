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
    
 private ArrayList<Disciplina> disciplina;
 private int cargaHoraria;
 private float valorHorario;
 private float salario;

    public Professor(ArrayList<Disciplina> disciplina, int cargaHoraria, float valorHorario, float salario, String nome, String rg, String cpf, Date dataNascimento, int idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.valorHorario = valorHorario;
        this.salario = this.calculaSalario(cargaHoraria, valorHorario);
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
        return "Professor{" + "disciplina=" + disciplina + ", cargaHoraria=" + cargaHoraria + ", valorHorario=" + valorHorario + ", salario=" + salario + '}';
    }

    
 
 

    
 
 
 
}
