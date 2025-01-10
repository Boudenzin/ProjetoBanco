package br.ufpb.dcx.romildo.banco.model;

import java.time.LocalDateTime;

public class Transacao {

    private TipoTransacao tipo;
    private double valor;
    private LocalDateTime data;
    private String descricao;

    public Transacao(TipoTransacao tipo, double valor, LocalDateTime data, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
