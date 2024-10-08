CREATE DATABASE db_banco;
USE db_banco;

CREATE TABLE bairro(
   id_bairro INT NOT NULL auto_increment,
   nome_bairro VARCHAR(45) NOT NULL,
   PRIMARY KEY(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8 ;

CREATE TABLE cliente(
   id_cliente INT NOT NULL auto_increment,
   nome_cliente VARCHAR(45) NOT NULL,
   num_conta VARCHAR (45),
   senha INT NOT NULL,
   fk_bairro_id INT NOT NULL,
   PRIMARY KEY(id_cliente),
   FOREIGN KEY (fk_bairro_id) REFERENCES bairro(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8;

CREATE TABLE gerente(
   id_gerente INT NOT NULL auto_increment,
   nome_gerente VARCHAR(45) NOT NULL,
   fk_bairro_id INT NOT NULL,
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

CREATE TABLE agencia(
   id_agencia INT NOT NULL auto_increment,
   nome_agencia VARCHAR(45) NOT NULL,
   fk_bairro_id INT NOT NULL,
   PRIMARY KEY(id_agencia),
   FOREIGN KEY (fk_bairro_id) REFERENCES bairro(id_bairro)
   ) ENGINE = innoDB DEFAULT CHARSET=utf8;
