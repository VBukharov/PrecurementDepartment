create table publ_office(
    publ_id serial,
    publ_name varchar(30) not null,
    publ_location varchar(100) not null,
    publ_description varchar(150),
    constraint publ_office_pk primary key (publ_id),
    constraint publ_office_unique_fields unique (publ_name, publ_location)
);