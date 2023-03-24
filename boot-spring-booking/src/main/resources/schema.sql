CREATE TABLE IF NOT EXISTS hotel (
	id int4 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	name varchar NOT NULL,
	category int4 NULL,
	CONSTRAINT hotel_pk PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS bookings(
	id int4 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	id_hotel int4 NOT NULL,
	date_from date NOT NULL,
	date_to date NOT NULL,
	email varchar(50) NOT NULL,
	CONSTRAINT booking_pk PRIMARY KEY(id),
	CONSTRAINT booking_fk FOREIGN KEY (id_hotel) REFERENCES hotel(id)
);

CREATE TABLE IF NOT EXISTS availabilities(
	id int4 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	id_hotel int4 NOT NULL,
	rooms int4 NULL,
	fecha date NULL,
	CONSTRAINT availabilities_pk PRIMARY KEY(id),
	CONSTRAINT availabilities_fk FOREIGN KEY (id_hotel) REFERENCES hotel(id)
);