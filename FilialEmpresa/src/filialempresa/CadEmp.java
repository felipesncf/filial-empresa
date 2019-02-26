/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filialempresa;

/**
 *
 * @author pioca_000
 */
public class CadEmp {
    private String endereco;
    private int telemp;
    private int anoAbertura;
    private int notaAvaliacao;
    private CadGer gerente;

    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelemp() {
        return telemp;
    }
    public void setTelemp(int telemp) {
        this.telemp = telemp;
    }

    public int getAnoAbertura() {
        return anoAbertura;
    } 
    public void setAnoAbertura(int anoAbertura) {
        this.anoAbertura = anoAbertura;
    }
    
    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }
    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public CadGer getGerente() {
        return gerente;
    }
    public void setGerente(CadGer gerente) {
        this.gerente = gerente;
    }
    
    
}
