-- Active: 1741468021297@@127.0.0.1@5432@postgres


CREATE database eventos

CREATE TABLE IF NOT EXISTS usuario (
	usr_id SERIAL PRIMARY KEY,
	usr_nome varchar(255) NOT NULL,
	usr_email varchar(255) NOT NULL,
	usr_senha varchar(255) NOT NULL,
	usr_tipo varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS "eventos" (
	"id_evento" serial NOT NULL UNIQUE,
	"nome_evento" varchar(255) NOT NULL,
	"descrição" varchar(255) NOT NULL,
	"data_inicio" timestamp with time zone NOT NULL,
	"data_fim" timestamp with time zone NOT NULL,
	"local" varchar(255) NOT NULL,
	"id_organizador" bigint NOT NULL UNIQUE,
	"id_categoria" bigint NOT NULL UNIQUE,
	PRIMARY KEY ("id_evento")
);

CREATE TABLE IF NOT EXISTS "inscrição" (
	"id_inscrição" serial NOT NULL UNIQUE,
	"id_participante" bigint NOT NULL UNIQUE,
	"id_evento" bigint NOT NULL UNIQUE,
	"data_inscrição" date NOT NULL,
	PRIMARY KEY ("id_inscrição")
);

CREATE TABLE IF NOT EXISTS "participação" (
	"id_presença" serial NOT NULL UNIQUE,
	"id_participante" bigint NOT NULL UNIQUE,
	"id_evento" bigint NOT NULL UNIQUE,
	"status" varchar(255) NOT NULL,
	"data_registro" timestamp without time zone NOT NULL,
	PRIMARY KEY ("id_presença")
);

CREATE TABLE IF NOT EXISTS "categorias" (
	"id_categoria" serial NOT NULL UNIQUE,
	"nome_categoria" varchar(255) NOT NULL,
	PRIMARY KEY ("id_categoria")
);