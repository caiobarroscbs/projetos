package org.example;

public class endereco {
    private int id;
    private char logradouro;
    private char numero;
    private char bairro;
    private char cidade;
    private char uf;
    private char complemento;
    private char referencia;

    public endereco(int id, char logradouro, char numero, char bairro, char cidade, char uf, char complemento, char referencia) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
        this.referencia = referencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id == 0 ){
            throw new IllegalArgumentException("O número do ID não pode ser 0");
        }
        this.id = id;
    }

    public char getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(char logradouro) {
        this.logradouro = logradouro;
    }

    public char getNumero() {
        return numero;
    }

    public void setNumero(char numero) {
        this.numero = numero;
    }

    public char getBairro() {
        return bairro;
    }

    public void setBairro(char bairro) {
        this.bairro = bairro;
    }

    public char getCidade() {
        return cidade;
    }

    public void setCidade(char cidade) {
        this.cidade = cidade;
    }

    public char getUf() {
        return uf;
    }

    public void setUf(char uf) {
        this.uf = uf;
    }

    public char getComplemento() {
        return complemento;
    }

    public void setComplemento(char complemento) {
        this.complemento = complemento;
    }

    public char getReferencia() {
        return referencia;
    }

    public void setReferencia(char referencia) {
        this.referencia = referencia;
    }
}
