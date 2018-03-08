/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        String nome=JOptionPane.showInputDialog("Qual o nome da disciplina :");
        String departamento=JOptionPane.showInputDialog("Qual é o departamento :");
        char status=JOptionPane.showInputDialog("Qual o nome da disciplina :").charAt(0);
        
        Disciplina Disc = new Disciplina(nome, departamento, status);
        
        int cargaHoraria=Integer.parseInt(JOptionPane.showInputDialog("Qual a sua carga horaria :"));
        float valorHora=Float.parseFloat(JOptionPane.showInputDialog("Quantos voc~e ganha por hora :"));
        
        Professor prof = new Professor(cargaHoraria, valorHora, nome, nome, nome, dataNascimento);
        
        
        int matricula=Integer.parseInt(JOptionPane.showInputDialog("Qual é o numero da sua matricula :"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(JOptionPane.showInputDialog("Qual é a data da sua matricula :"));
        
        Aluno alu = new Aluno(matricula, data, nome, nome, nome, data);
    }
    
}
