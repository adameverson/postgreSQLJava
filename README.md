# postgreSQLJava

## Este projeto permite uma conexão e execução de query com o banco de dados PostgreSQL, ulizando a linguagem Java.

### Tabela SQL utilizada para testes
![image](https://user-images.githubusercontent.com/24993219/146389501-dbeb87fb-ba4f-478c-ada9-3589ab942811.png)

### Executando query pelo Java
![image](https://user-images.githubusercontent.com/24993219/146389685-eba5fda3-8ef4-4fba-8a1c-bfb9ac93e5d4.png)

### Query para criar a Tabela no PostgreSQL
-- Table: public.categoria

-- DROP TABLE public.categoria;

CREATE TABLE public.categoria
(
    id integer NOT NULL DEFAULT nextval('categoria_id_seq'::regclass),
    descricao character varying(100) COLLATE pg_catalog."default" NOT NULL,
    status integer DEFAULT 1,
    CONSTRAINT categoria_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.categoria
    OWNER to postgres;

