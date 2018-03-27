/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
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
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Disciplina> materias = new ArrayList<>();
        ArrayList<Aluno> matAluno = new ArrayList<>();
        ArrayList<Professor> matProfe = new ArrayList<>();
        int menu = 0;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções \n"
                    + "1: Cadastro Disciplina \n"
                    + "2: Cadastro Professor \n"
                    + "3: Cadastro Aluno \n"
                    + "4: Consulta Disciplina \n"
                    + "5: Consuta Professor \n"
                    + "6: Consuta Aluno \n"
                    + "7: sair"));
            switch (menu) {
                case 1: {
                    do {
                        String nomedis = JOptionPane.showInputDialog("Qual o nome da disciplina :");
                        String departamento = JOptionPane.showInputDialog("Qual é o departamento :");
                        char status = JOptionPane.showInputDialog("Qual é o status :").charAt(0);
                        materias.add(new Disciplina(nomedis, departamento, status));
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar ?")) == 0);
                    break;
                }
                case 2: {
                    int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua carga horaria :"));
                    float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Quantos você ganha por hora :"));
                    String nome = JOptionPane.showInputDialog("Qual é o seu nome :");
                    String rg = JOptionPane.showInputDialog("Qual é o seu RG :");
                    String cpf = JOptionPane.showInputDialog("Qual é o seu CPF :");
                    Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Qual é a data do seu nascimento :"));

                    matProfe.add(new Professor(cargaHoraria, valorHora, nome, rg, cpf, dataNascimento));

                    if (JOptionPane.showConfirmDialog(null, "O professor ja da aula em alguma matéria ?") == 0) {
                        String matExistentep = "";
                        matExistentep = materias.stream().map((materia) -> "\n" + materias.indexOf(materia) + " : " + materia.getNome()).reduce(matExistentep, String::concat);
                        do {
                            int esc = Integer.parseInt(JOptionPane.showInputDialog("Informe a máteria" + matExistentep));
                            matProfe.get(matProfe.size() - 1).getDisciplina().add(materias.get(esc));
                        } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar ?")) == 0);

                    }

                    break;
                }
                case 3: {
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual é o numero da sua matricula :"));
                    Date data = sdf.parse(JOptionPane.showInputDialog("Qual é a data da sua matricula :"));
                    String nomeal = JOptionPane.showInputDialog("Qual é o seu nome :");
                    String rgal = JOptionPane.showInputDialog("Qual é o seu RG :");
                    String cpfal = JOptionPane.showInputDialog("Qual é o seu CPF :");
                    Date dataNascimentoal = sdf.parse(JOptionPane.showInputDialog("Qual é a data do seu nascimento :"));

                    matAluno.add(new Aluno(matricula, data, nomeal, rgal, cpfal, dataNascimentoal));

                    if (JOptionPane.showConfirmDialog(null, "O aluno ja se matriculou em alguma disciplina ?") == 0) {
                        String matExistente = "";
                        for (Disciplina materia : materias) {
                            matExistente += "\n" + materias.indexOf(materia) + " : " + materia.getNome();
                        }
                        do {
                            int esc = Integer.parseInt(JOptionPane.showInputDialog("Informe a máteria" + matExistente));
                            matAluno.get(matAluno.size() - 1).getDisciplina().add(materias.get(esc));
                        } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar ?")) == 0);

                    }

                    break;
                }
                case 4: {
                    int cod = Integer.parseInt(JOptionPane.showInputDialog("Você quer por : \n"
                            + "1:Codigo \n"
                            + "2:Nome"));
                    switch (cod) {

                        case 1: {
                            String matExistente = "";
                            for (Disciplina materia : materias) {
                                matExistente += "\n" + materias.indexOf(materia) + " : " + materia.getNome();
                            }
                            int inf = Integer.parseInt(JOptionPane.showInputDialog("Informe a máteria" + matExistente));

                            JOptionPane.showMessageDialog(null, materias.get(inf).toString());
                            break;
                        }
                        case 2: {
                            String matExistente = "";
                            for (Disciplina materia : materias) {
                                matExistente += "\n" + materia.getNome();
                            }
                            String inf = JOptionPane.showInputDialog("Informe a máteria" + matExistente);
                            for (int i = 0; i < materias.size(); i++) {

                                if (materias.get(i).getNome().equals(inf)) {
                                    JOptionPane.showMessageDialog(null, materias.get(i).toString());
                                }
                            }

                            break;
                        }
                    }
                    break;
                }

                case 5: {
                    int cod1 = Integer.parseInt(JOptionPane.showInputDialog("Você quer por : \n"
                            + "1:Codigo \n"
                            + "2:Nome"));
                    switch (cod1) {

                        case 1: {
                            String matExistente = "";
                            for (Professor materia : matProfe) {
                                matExistente += "\n" + matProfe.indexOf(materia) + " : " + materia.getNome();
                            }
                            int inf = Integer.parseInt(JOptionPane.showInputDialog("Informe a máteria" + matExistente));

                            JOptionPane.showMessageDialog(null, matProfe.get(inf).toString());
                            break;
                        }
                        case 2: {
                            String matExistente = "";
                            for (Professor materia : matProfe) {
                                matExistente += "\n" + materia.getNome();
                            }
                            String inf = JOptionPane.showInputDialog("Informe a máteria" + matExistente);
                            for (int i = 0; i < matProfe.size(); i++) {

                                if (matProfe.get(i).getNome().equals(inf)) {
                                    JOptionPane.showMessageDialog(null, matProfe.get(i).toString());
                                }
                            }

                            break;
                        }
                        case 6: {
                            int cod2 = Integer.parseInt(JOptionPane.showInputDialog("Você quer por : \n"
                                    + "1:Codigo \n"
                                    + "2:Nome"));
                            switch (cod2) {

                                case 1: {
                                    String matExistente = "";
                                    for (Aluno materia : matAluno) {
                                        matExistente += "\n" + matAluno.indexOf(materia) + " : " + materia.getNome();
                                    }
                                    int inf = Integer.parseInt(JOptionPane.showInputDialog("Informe a máteria" + matExistente));

                                    JOptionPane.showMessageDialog(null, matAluno.get(inf).toString());
                                    break;
                                }
                                case 2: {
                                    String matExistente = "";
                                    for (Aluno materia : matAluno) {
                                        matExistente += "\n" + materia.getNome();
                                    }
                                    String inf = JOptionPane.showInputDialog("Informe a máteria" + matExistente);
                                    for (int i = 0; i < matAluno.size(); i++) {

                                        if (matAluno.get(i).getNome().equals(inf)) {
                                            JOptionPane.showMessageDialog(null, matAluno.get(i).toString());
                                        }
                                    }

                                    break;
                                }
                                case 7: {
                                    JOptionPane.showMessageDialog(null, "TCHAL !!!");
                                    break;
                                }
                                default: {
                                    JOptionPane.showMessageDialog(null, "Invalido");
                                    break;
                                }
                            }

                        }
                        

                    }

                }
            }
        }while (menu != 7);
        }
}
