CREATE DATABASE escola;

USE escola;

CREATE TABLE aluno (
	idAluno INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    idade DOUBLE NOT NULL
);

CREATE TABLE endereco (
	idEndereco INTEGER PRIMARY KEY AUTO_INCREMENT,
    logradouro VARCHAR(20) NOT NULL,
    numero VARCHAR(5) NOT NULL,
    bairro VARCHAR(20) NOT NULL,
    cidade VARCHAR(20) NOT NULL,
    uf CHAR(2) NOT NULL,
    complemento VARCHAR(20) NOT NULL,
    referencia VARCHAR(20) NOT NULL,
    FOREIGN KEY(idAluno) REFERENCES aluno(idAluno)
);

SELECT * FROM aluno;
SELECT * FROM endereco;

SELECT * FROM aluno WHERE nome = "Caio";

SELECT * FROM aluno ORDER BY nome; 

INSERT INTO aluno VALUES(NULL, "Caio Barros", 25, 1);
INSERT INTO aluno VALUES(NULL, "Bruce Wayne", 45, 2);
INSERT INTO aluno VALUES(NULL, "Mister White", 70, 3);


UPDATE aluno
SET nome = idade = 26
WHERE idAluno = 1; 

DELETE FROM aluno
WHERE idAluno = 3;









