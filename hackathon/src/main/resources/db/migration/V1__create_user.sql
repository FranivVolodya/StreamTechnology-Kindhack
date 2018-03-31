CREATE TABLE user_tb (
  user_id bigserial primary key,
  first_name varchar(100) NOT NULL,
  last_name varchar(100) NOT NULL,
  created TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
  last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE address_tb (
  address_id   BIGSERIAL PRIMARY KEY,
  user_id     INT NOT NULL ,
  address_street VARCHAR(500),
  city           VARCHAR(250)NOT NULL,
  zipcode      VARCHAR(100) NOT NULL,
  created TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
  last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT address_user_fk FOREIGN KEY (user_id)   REFERENCES user_tb (user_id)
   MATCH SIMPLE ON DELETE  CASCADE
);



