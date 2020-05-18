CREATE TABLE payment (
                                  id BIGINT PRIMARY KEY,
                                  payment_id BIGINT NOT NULL,
                                  user_id BIGINT NOT NULL,
                                  username varchar(30) NOT NULL
);