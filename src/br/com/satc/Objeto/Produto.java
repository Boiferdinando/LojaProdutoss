/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.Objeto;

/**
 *
 * @author ricardo.150317
 */
public class Produto {
  private  int id;
  private  String nome;
  private  String descricao;
  private  float valor;
  private  char status;

    public int getId() {
        return id;
    }

    public Produto(int id, String nome, String descricao, float valor, char status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public char getStatus() {
        return status;
    }

    
}
