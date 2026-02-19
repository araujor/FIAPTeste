insert into pessoa (nome, cpf, data_nascimento, rg, telefone) values('Pessoa 1','1234','2004-01-01','123','(11) 1111-2222');
insert into pessoa (nome, cpf, data_nascimento, rg, telefone) values('Pessoa 2','1235','2005-01-01','456','(11) 2222-3333');
insert into pessoa (nome, cpf, data_nascimento, rg, telefone) values('Pessoa 3','1236','2006-01-01','789','(11) 3333-4444');
insert into pessoa (nome, cpf, data_nascimento, rg, telefone) values('Pessoa 4','1237','2007-01-01','321','(11) 4444-5555');

insert into usuario (id_usuario, rm, senha, ativo, status_academico, fk_pessoa, email) values(1,'RM123','Senha123', true, 'GRADUACAO', 1,'pessoa1@fiap.com.br');
insert into usuario (id_usuario, rm, senha, ativo, status_academico, fk_pessoa, email) values(2,'RM456','Senha456', false, 'GRADUACAO', 2,'pessoa2@fiap.com.br');
insert into usuario (id_usuario, rm, senha, ativo, status_academico, fk_pessoa, email) values(3,'RM789','Senha789', true, 'LATO_SENSU', 3,'pessoa3@fiap.com.br');