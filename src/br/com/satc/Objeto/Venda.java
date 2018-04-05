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
public class Venda {
private String cliente;
private String listProduto;
private float totalApagar;    
private String status;
private int id;

    public Venda(String cliente, String listProduto, float totalApagar, String status, int id) {
        this.cliente = cliente;
        this.listProduto = listProduto;
        this.totalApagar = totalApagar;
        this.status = status;
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getListProduto() {
        return listProduto;
    }

    public float getTotalApagar() {
        return totalApagar;
    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setListProduto(String listProduto) {
        this.listProduto = listProduto;
    }

    public void setTotalApagar(float totalApagar) {
        this.totalApagar = totalApagar;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }
}
