CREATE TABLE profile_details
(
id BIGINT NOT NULL,
description VARCHAR (255),
picture VARCHAR(255),
CONSTRAINT profile_details_id_pk PRIMARY KEY (id),
CONSTRAINT profile_details_id_uc UNIQUE (id)
);

CREATE TABLE profile
(
id BIGINT NOT NULL,
username VARCHAR(25),
user_id BIGINT,
creation_date TIMESTAMP,
profile_details_id  BIGINT NOT NULL,
CONSTRAINT profile_id_pk PRIMARY KEY (id),
CONSTRAINT profile_id_uc UNIQUE (id),
CONSTRAINT profile_details_id_fk FOREIGN KEY (profile_details_id) references profile_details(id)
);

