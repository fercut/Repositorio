CREATE DATABASE CLINICA;

USE CLINICA;

CREATE TABLE DOCTOR(
    CODIGO INTEGER(5),
    NOMBRE VARCHAR (45) NOT NULL,
    ESPECIALIDAD VARCHAR(20) NOT NULL,
    PRIMARY KEY (CODIGO)
);

CREATE TABLE PACIENTE(
    SS INTEGER(15),
    NOMBRE VARCHAR(45) NOT NULL,
    EDAD INTEGER(3) NOT NULL,
    PRIMARY KEY (SS)
);

CREATE TABLE UNIDAD (
    ID INTEGER(5),
    NOMBRE VARCHAR (15) NOT NULL,
    PLANTA INTEGER(2) NOT NULL DEFAULT 0,
    CODIGO INTEGER(5),
    PRIMARY KEY(ID),
    FOREIGN KEY(CODIGO) REFERENCES DOCTOR (CODIGO)
);

CREATE TABLE ATIENDE (
    CODIGO INTEGER(5),
    SS INTEGER(15),
    SINTOMA VARCHAR (15) NOT NULL,
    TRATAMIENTO VARCHAR (40) NOT NULL,
    FECHA TIME,
    FOREIGN KEY(CODIGO) REFERENCES DOCTOR (CODIGO),
    FOREIGN KEY(SS) REFERENCES PACIENTE (SS)
);

CREATE TABLE INGRESADO (
    ID INTEGER(5),
    SS INTEGER(15),
    FECHA_INGRESO TIME,
    FOREIGN KEY (SS) REFERENCES PACIENTE (SS),
    FOREIGN KEY (ID) REFERENCES UNIDAD (ID)
);