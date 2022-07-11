create table Author(
    id integer auto_increment,
    nume varchar(50),
    carte varchar(50),
    primary key(id)
);

create table Book(
    id integer auto_increment,
    nume varchar(50),
    data_aparitie varchar(50),
    numar_pagini integer,
    numar_copii integer,
    primary key(id)
);

