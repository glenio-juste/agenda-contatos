CREATE TABLE CONTATO(
	ID SERIAL NOT NULL PRIMARY KEY,
	NOME VARCHAR(150) NOT NULL,
	EMAIL VARCHAR(150) NOT NULL,
	FAVORITO BOOLEAN
);