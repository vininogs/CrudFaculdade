CREATE DATABASE cadastro;
USE cadastro;
CREATE TABLE cadastroAluno(
     rgm1 int NOT NULL PRIMARY KEY,
     curso VARCHAR(50),
     campus VARCHAR(15),
     grupoPeriodo VARCHAR(15),
     disciplina VARCHAR(50),
     semestre VARCHAR(50),
     nota VARCHAR(20),
     faltas VARCHAR(20),
     nomeAluno VARCHAR(50),
     nascAluno VARCHAR(50),
     cpfAluno VARCHAR(12),
     emailAluno VARCHAR(50), 
     endAluno VARCHAR(50),
     municipAluno VARCHAR(50),
     uf VARCHAR(10),
     celularAluno VARCHAR(20) 
    );