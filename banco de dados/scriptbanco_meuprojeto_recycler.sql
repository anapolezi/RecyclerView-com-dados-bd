create schema if not exists meuprojeto_recycler;
use meuprojeto_recycler;
create table if not exists funcionario(
	id_funcionario bigint not null auto_increment PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    filial varchar(30) NOT NULL,
    locacao varchar(40) NOT NULL
);
DESCRIBE funcionario;
select*from funcionario;

