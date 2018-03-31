CREATE TABLE room_details_tb (
  room_id   BIGSERIAL PRIMARY KEY,
  user_id     INT NOT NULL ,
  photos VARCHAR(1000),
  mates_number INT,
  benefits VARCHAR(150),
  rent_price double precision,
  domestic_help  BOOLEAN ,
  domestic_help_info  BOOLEAN,
  CONSTRAINT address_user_fk FOREIGN KEY (user_id)   REFERENCES user_tb (user_id)
   MATCH SIMPLE ON DELETE  CASCADE
);
