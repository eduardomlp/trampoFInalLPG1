/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.trampo;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Cliente extends Pessoa{
    private String profissao;
    private double renda;
    private double limiteCredito;
    private String tipoCliente;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
        this.setLimiteCredito();
    }
    
    public void setLimiteCredito(){
        if(this.tipoCliente.equals("Bronze")){
            this.limiteCredito = (renda / 100) * 50;
        }
        else if(this.tipoCliente.equals("Prata")){
            this.limiteCredito = renda;
        }
        else{
            this.limiteCredito = Double.MAX_VALUE;
        }
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
}
