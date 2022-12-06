/*
CREATE TABLE TESTE (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	NOME VARCHAR(100)
);

CREATE TABLE FILME (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	TITULO VARCHAR(100),
	QTD_INGRESSO INTEGER
);

CREATE TABLE INGRESSO (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	ID_CLIENTE INTEGER,
	ID_FILME INTEGER,
	PRECO_UNITARIO NUMERIC(20,2)
);



-----------CLIENTES ---------

INSERT INTO CLIENTE VALUES 
	(1,'Danilo'),
	(2,'Wesley'),
	(3,'Robson'),
	(4,'Marcos'),
	(5,'Felipe'),
	(6,'Isabella');	

-----------FILMES-------------

INSERT INTO FILME (ID, QTD_INGRESSO,TITULO) VALUES 
	(1,22,'SHREK'),
	(2,30,'TOY STORY'),
	(3,20,'HOMEM DE FERRO'),
	(4,15,'CORINGA'),
	(5,40,'AVATAR');
	
-----------INGRESSO------------

INSERT INTO INGRESSO 
	(ID, PRECO_UNITARIO, CLIENTE_ID, FILME_ID) 
VALUES 
    (1, 19.99, 1, 1),
    (2, 22.99, 2, 5),
    (3, 9.99, 3, 2),
    (4, 17.99, 4, 3),
    (5, 17.99, 5, 3),
    (6, 11.99, 6, 4),
    (7, 19.99, 1, 1),
    (8, 22.99, 3, 5),
    (9, 19.99, 2, 1),
    (10, 9.99, 6, 2),
    (11, 11.99, 3, 4);

------------SELECT INNER JOIN -------


select 
    ing.id as ID_INGRESSO,
    cli.nome as NOME_CLIENTE,
    film.titulo as FILME,
    ing.preco_unitario as VALOR
from ingresso ing
inner join cliente cli
    on ing.cliente_id = cli.id 
inner join filme film
    on ing.filme_id = film.id;


    
*/

