CREATE TABLE if NOT EXISTS filmes (
	id serial PRIMARY KEY,
	nome 		varchar(30),
	genero 		varchar(30),
	sinopse 	varchar(120)
);

CREATE TABLE if NOT EXISTS sugestao (
	id serial PRIMARY KEY,
	nome 		varchar(30),
	sinopse 	varchar(120)
);

