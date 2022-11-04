package org.example;

public class alunos {

    private int id;
    private String nome;
    private double idade;
    private endereco endereco;

    public alunos(int id, String nome, double idade, endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new NullPointerException("Nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        if(idade >= 110) {
            throw new IllegalArgumentException("Por favor, colocar uma idade valida!");
        }
            this.idade = idade;

    }

    public org.example.endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(org.example.endereco endereco) {
        this.endereco = endereco;
    }



}
