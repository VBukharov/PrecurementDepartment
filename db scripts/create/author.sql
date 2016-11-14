CREATE TABLE author
(
    author_id serial,
    author_name character varying(30) NOT NULL,
    author_surname character varying(30) NOT NULL,
    author_second_name character varying(30) NOT NULL,
    author_biography character varying(200),
    CONSTRAINT author_pkey PRIMARY KEY (author_id)
)