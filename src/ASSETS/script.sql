CREATE DATABASE db_banco_versatil;
USE db_banco_versatil;

CREATE TABLE cliente(
   id_cliente INT NOT NULL auto_increment,
   nome_cliente VARCHAR(45) NOT NULL,
   fk_bairro_id VARCHAR(45) NOT NULL,
   PRIMARY KEY(id_cliente),
   FOREING KEY (fk_bairro_id) REFERENCES bairro(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8;

CREATE TABLE funcionario(
   id_funcionario INT NOT NULL auto_increment,
   nome_funcionario VARCHAR(45) NOT NULL,
   fk_bairro_id VARCHAR(45) NOT NULL,
   PRIMARY KEY(id_funcionario),
   FOREIGN KEY (fk_bairro_id) REFERENCES bairro(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8 ;

CREATE TABLE gerente(
   id_gerente INT NOT NULL auto_increment,
   nome_gerente VARCHAR(45) NOT NULL,
   fk_bairro_id VARCHAR(45) NOT NULL,
   PRIMARY KEY(id_gerente),
   FOREIGN KEY (fk_bairro_id) REFERENCES bairro(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8;

CREATE TABLE usuario(
   id_usuario INT NOT NULL auto_increment,
   nome_usuario VARCHAR(45) NOT NULL,
   senha_usuario VARCHAR(8) NOT NULL,
   fk_bairro_id INT NOT NULL,
   PRIMARY KEY(id_usuario),
   FOREIGN KEY (fK_bairro_id) REFERENCES bairro(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8;

