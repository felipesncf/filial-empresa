/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filialempresa;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class FilialEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadEmp[] filial = new CadEmp[3];
        CadGer[] gerente = new CadGer[3];
        
        for(int i=0;i<3;i++){
            filial[i]=new CadEmp();
            filial[i].setEndereco(JOptionPane.showInputDialog("Qual o endereco da filial " +(i+1) +"?"));
            filial[i].setAnoAbertura(Integer.parseInt(JOptionPane.showInputDialog("Qual o nome de abertura da filial " +(i+1) +"?")));
            filial[i].setTelemp(Integer.parseInt(JOptionPane.showInputDialog("Qual o telefone da filial " +(i+1) +"?")));
            filial[i].setNotaAvaliacao(Integer.parseInt(JOptionPane.showInputDialog("Qual a nota de avaliacao da filial " +(i+1) +"?")));    
        }
        
        for(int i=0;i<3;i++){
            gerente[i]=new CadGer();
            gerente[i].setNome(JOptionPane.showInputDialog("Qual o nome do gerente da filial " +(i+1) +"?"));
            gerente[i].setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Qual o telefone do gerente da filial " +(i+1) +"?")));
            gerente[i].setCpf(Integer.parseInt(JOptionPane.showInputDialog("Qual o CPF do gerente da filial " +(i+1) +"?")));
            gerente[i].setTempo(Integer.parseInt(JOptionPane.showInputDialog("Ha quanto tempo o gerente " +(i+1)+ "trabalha na filial " +(i+1) +"?")));
            if(gerente[i].getTempo()>5){
                if(filial[i].getNotaAvaliacao()<5){
                    filial[i].setNotaAvaliacao(filial[i].getNotaAvaliacao()+1);
                }
            }
                
        }
        for(int i=0;i<3;i++){
        System.out.println("Filial "+(i+1) +": ");
        System.out.println("Endereco: " +filial[i].getEndereco());
        System.out.println("Telefone: " +filial[i].getTelemp());
        System.out.println("Ano de abertura: " +filial[i].getAnoAbertura());
        System.out.println("Nota de avaliacao: " +filial[i].getNotaAvaliacao());
        System.out.println("\n");
        System.out.println("Gerente: ");
        System.out.println("Nome: " +gerente[i].getNome());
        System.out.println("CPF: " +gerente[i].getCpf());
        System.out.println("Telefone: " +gerente[i].getTelefone());
        System.out.println("Tempo de empresa: " +gerente[i].getTempo());
        System.out.println("\n");
        System.out.println("\n");

        }
    }
    
}
