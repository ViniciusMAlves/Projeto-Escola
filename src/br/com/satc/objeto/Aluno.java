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
public class Aluno extends Pessoa{
    private int matricula;
    private Date dataMatricula;
    private ArrayList<Disciplina> disciplina;

    public Aluno(int matricula, Date dataMatricula, ArrayList<Disciplina> disciplina, String nome, String rg, String cpf, Date dataNascimento, int idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.disciplina = disciplina;
    }
    
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplina=" + disciplina + '}';
    }
    
    
    
}
