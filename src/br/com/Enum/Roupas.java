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
public enum Roupas {
    blusa(119403, "blusa", "Blusas com manga", (float) 25.00, 'a'),
    boina(119404, "boina", "boina para velhos",(float) 15.00, 'a'),
    jaqueta(119405, "Jaqueta", "Jaqueta com reco",(float) 75.00, 'a'),
    meia(119406, "meia", "Meia infantil e adulta", (float)7.00, 'a'),
    vestido(119407, "vestido", "vestido adulto e juvenil", (float)100.00, 'a'),
    moleton(119408, "Moletom", "Moletom com aquecedor interno", (float)250.00, 'a'),
    bermuda(119409, "bermuda", "Bermuda estanpada",(float) 32.00, 'a'),
    casticool(110410, "Caticool", "Casticool quentinho igual o inferno :D", (float)10.00, 'a'),
    cuecaBox(110411, "CuecaBox", "Fresquinha igual uma geladeira", (float)20.00, 'a'),
    calca(119402, "calça", "Com laicra e altos estilos",(float)67.0, 'a');

    private int id;
    private String nome;
    private String descricao;
    private float valor;
    private char status;

    public static Enum getBlusa() {
        return blusa;
    }

    public static Enum getCalca() {
        return calca;
    }

    public int getId() {
        return id;
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

    private Roupas(int id, String nome, String descricao, float valor, char status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

}
