create table edition(
	edition_id serial,
    edition_name character varying(30),
    edition_year integer NOT NULL,
    edition_quantity_of_papers integer NOT NULL,
    edition_quantity integer NOT NULL,
    edition_annotation character varying(150),
    publ_id integer NOT NULL,
    CONSTRAINT edition_pkey PRIMARY KEY (edition_id),
    CONSTRAINT edition_edition_name_key UNIQUE (edition_name),
    CONSTRAINT edition_publ_id_fkey FOREIGN KEY (publ_id)
        REFERENCES public.publ_office (publ_id) ON DELETE NO ACTION,
    CONSTRAINT edition_edition_year_check CHECK (edition_year > 1425 AND edition_year <= date_part('year'::text, 'now'::text::date)::integer),
    CONSTRAINT edition_edition_quantity_of_papers_check CHECK (edition_quantity_of_papers > 0),
    CONSTRAINT edition_edition_quantity_check CHECK (edition_quantity > 0)
);