package org.example;

public class escola {

    private int id;
    private alunos alunos;


    public escola(int id, org.example.alunos alunos) {
        this.id = id;
        this.alunos = alunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public org.example.alunos getAlunos() {
        return alunos;
    }

    public void setAlunos(org.example.alunos alunos) {
        this.alunos = alunos;
    }
}
