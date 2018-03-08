/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.Date;

/**
 *
 * @author vinicius.132217
 */
public class Disciplina extends Pessoa{
    private String Nome;
    private String departamento;
    private char status;

    public Disciplina(String Nome, String departamento, char status, String nome, String rg, String cpf, Date dataNascimento, int idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.Nome = Nome;
        this.departamento = departamento;
        this.status = status;
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "Nome=" + Nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

   
    
    
}