CREATE TABLE cards.match (
    id BIGINT NOT NULL PRIMARY KEY,
    user1Id BIGINT not null,
    user2Id BIGINT not null
);

CREATE TABLE cards.reaction (
  id BIGINT NOT NULL PRIMARY KEY,
  reacting_user_id BIGINT not null,
  swiped_user_id BIGINT not null,
  "like" BOOLEAN NOT NULL,
  creation_date TIMESTAMP(0)
);