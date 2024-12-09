create database if not exists dbhotel;
use dbhotel;

create table if not exists Funcionario (
	idFuncionario	int 	not null auto_increment,
    nomeUsuario		varchar(20)		not null,
    nome_Completo	varchar(150)	not null,
    e_mailFuncionario	varchar(50)		not null,
    cpf		bigint(11)	not null,
    senhaFunc	varchar(20)		not null,
    dtNasc		datetime	not null,
    telefone_Func	varchar(11)		 not null,

	primary key (idFuncionario)
);

create table if not exists Hospede (
	idHospede	int 	not null auto_increment,
    nome_Completo		varchar(150)		not null,
    e_mailHospede	varchar(50)		not null,
    cpf		bigint(11)	not null,
    dtNasc		datetime	not null,
    telefone_Hosp	varchar(11)		 not null,

	primary key (idHospede)
);

