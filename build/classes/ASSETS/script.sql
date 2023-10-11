CREATE DATABASE bancoteste;
USE bancoteste;

CREATE TABLE funcionario(
   id_funcionario INT NOT NULL auto_increment,
   nome_funcionario VARCHAR(45) NOT NULL,
   endereco_funcionario VARCHAR(45) NOT NULL,
   PRIMARY KEY(id_funcionario)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8 ;

CREATE TABLE usuario(
   id_usuario INT NOT NULL auto_increment,
   nome_usuario VARCHAR(45) NOT NULL,
   fk_bairro_usuario INT NOT NULL,
   PRIMARY KEY(id_usuario),
   FOREIGN KEY (fK_bairro_usuario) REFERENCES bairro(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8 ;

ALTER TABLE  usuario RENAME COLUMN fK_bairro_usuario to fK_bairro_id; 