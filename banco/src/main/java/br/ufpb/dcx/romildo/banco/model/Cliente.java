package br.ufpb.dcx.romildo.banco.model;

public class Cliente {
    public String nome;
    public String cpf;
    public String endereco;
    public String telefone;

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    private boolean validarCPF(String cpf) {
        //TODO: Implementar validação do cpf
        return true;
    }
}
