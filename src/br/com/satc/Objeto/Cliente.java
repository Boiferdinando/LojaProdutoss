/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.Objeto;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ricardo.150317
 */
public class Cliente extends Pessoa {
   private int id;
  private Date cadastro;
  private String Status;
 private  int idade;
   public static int calculaIdade(java.util.Date dataNasc) {

    Calendar dataNascimento = Calendar.getInstance();  
    dataNascimento.setTime(dataNasc); 
    Calendar hoje = Calendar.getInstance();  

    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
        }
    }

    return idade;

   }

    public Cliente(int id, Date cadastro, String Status, int idade, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.id = id;
        this.cadastro = cadastro;
        this.Status = Status;
        this.idade = idade;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public Date getCadastro() {
        return cadastro;
    }

    public String getStatus() {
        return Status;
    }
    
    
}
    
    

