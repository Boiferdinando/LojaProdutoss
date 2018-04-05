/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Enum;

/**
 *
 * @author ricardo.150317
 */
public enum CadastrosEnum {
     cadastroCliente(1),cadastroProduto(2),
    consultaCliente(3),consultaProduto(4),sair(5);
    private int opcaoEscolha;

    public static CadastrosEnum getSair() {
        return sair;
    }

    public static CadastrosEnum getCadastroCliente() {
        return cadastroCliente;
    }

    public static CadastrosEnum getCadastroProduto() {
        return cadastroProduto;
    }

    public static CadastrosEnum getConsultaCliente() {
        return consultaCliente;
    }

    public static CadastrosEnum getConsultaProduto() {
        return consultaProduto;
    }

    public int getOpcaoEscolha() {
        return opcaoEscolha;
    }

    private CadastrosEnum(int opcaoEscolha) {
        this.opcaoEscolha = opcaoEscolha;
    }
   
    
   
}
