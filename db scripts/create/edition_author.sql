create table edition_author(
	edition_id integer not null,
    author_id integer not null,
    constraint edition_author_pk primary key (edition_id, author_id),
    constraint edition_author_editionfk foreign key (edition_id) references edition (edition_id),
    constraint edition_author_authorfk foreign key (author_id) references author (author_id)
);