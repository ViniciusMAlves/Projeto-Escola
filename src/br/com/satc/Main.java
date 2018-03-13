/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Pessoa;
import br.com.satc.objeto.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius.132217
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        String nomedis=JOptionPane.showInputDialog("Qual o nome da disciplina :");
        String departamento=JOptionPane.showInputDialog("Qual é o departamento :");
        char status=JOptionPane.showInputDialog("Qual é o status :").charAt(0);
        
        Disciplina Disc = new Disciplina(nomedis, departamento, status);
        JOptionPane.showMessageDialog(null, Disc.toString());
        
        int cargaHoraria=Integer.parseInt(JOptionPane.showInputDialog("Qual a sua carga horaria :"));
        float valorHora=Float.parseFloat(JOptionPane.showInputDialog("Quantos você ganha por hora :"));
        String nome= JOptionPane.showInputDialog("Qual é o seu nome :");
        String rg= JOptionPane.showInputDialog("Qual é o seu RG :");
        String cpf= JOptionPane.showInputDialog("Qual é o seu CPF :"); 
        Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Qual é a data do seu nascimento :"));
        
        Professor prof = new Professor(cargaHoraria, valorHora, nome, rg, cpf, dataNascimento);
        
        JOptionPane.showMessageDialog(null, prof.toString());
        
        
        int matricula=Integer.parseInt(JOptionPane.showInputDialog("Qual é o numero da sua matricula :"));
        Date data = sdf.parse(JOptionPane.showInputDialog("Qual é a data da sua matricula :"));
        String nomeal= JOptionPane.showInputDialog("Qual é o seu nome :");
        String rgal= JOptionPane.showInputDialog("Qual é o seu RG :");
        String cpfal= JOptionPane.showInputDialog("Qual é o seu CPF :"); 
        Date dataNascimentoal = sdf.parse(JOptionPane.showInputDialog("Qual é a data do seu nascimento :"));
        
        Aluno alu = new Aluno(matricula, data, nomeal, rgal, cpfal, dataNascimentoal);
        JOptionPane.showMessageDialog(null, alu.toString());
        
        
    }
    
}
