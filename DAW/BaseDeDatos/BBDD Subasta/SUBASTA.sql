CREATE DATABASE SUBASTA;

USE SUBASTA;

CREATE TABLE PRODUCTO (
    CODIGO INTEGER (13) PRIMARY KEY,
    NOMBRE VARCHAR (30) NOT NULL,
    DESCRIPCION VARCHAR (60) NOT NULL,
    FOTO BLOB,
    NUMLOTE INTEGER (5) KEY REFERENCES LOTE (CATNUM)
);

CREATE TABLE LOTE (
    CATNUM INTEGER (5) PRIMARY KEY,
    SALIDA INTEGER (6) UNSIGNED NOT NULL,
    PUJAMAX INTEGER (6) UNSIGNED NOT NULL DEFAULT 0,
    TIEMPO TIME
);

CREATE TABLE PUJA (

    CATNUM INTEGER (5),
    USUARIO VARCHAR(15),
    DIA DATE NOT NULL,
    HORA TIME NOT NULL,
    CANTIDAD INTEGER (7) UNSIGNED 
);