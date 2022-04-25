DROP SCHEMA IF EXISTS preguntados;
-- The schema "preguntados" is created 
CREATE SCHEMA IF NOT EXISTS preguntados;
USE preguntados;

-- The gamer table is created
CREATE TABLE IF NOT EXISTS gamer (
  gam_id int PRIMARY KEY AUTO_INCREMENT,
  gam_name varchar(255) NOT NULL
);

-- The record table is created
CREATE TABLE IF NOT EXISTS record (
  rec_id int PRIMARY KEY AUTO_INCREMENT,
  rec_gamer_id int,
  rec_date datetime,
  rec_value float
);

-- The round table is created
CREATE TABLE IF NOT EXISTS round (
  rou_id int PRIMARY KEY AUTO_INCREMENT,
  rou_prize_id int,
  rou_category_id int
);

-- The prize table is created
CREATE TABLE IF NOT EXISTS prize (
  pri_id int PRIMARY KEY AUTO_INCREMENT,
  pri_name varchar(255),
  pri_value decimal
);

-- The category table is created
CREATE TABLE IF NOT EXISTS category (
  cat_id int PRIMARY KEY AUTO_INCREMENT,
  cat_level varchar(255) UNIQUE NOT NULL
);

-- The question table is created
CREATE TABLE IF NOT EXISTS question (
  que_id int PRIMARY KEY AUTO_INCREMENT,
  que_category_id int,
  que_text varchar(255) UNIQUE NOT NULL
);

-- The answer table is created
CREATE TABLE IF NOT EXISTS answer (
  ans_id int PRIMARY KEY AUTO_INCREMENT,
  ans_question_id int,
  ans_text varchar(255) NOT NULL,
  ans_correct boolean
);

ALTER TABLE record ADD FOREIGN KEY (rec_gamer_id) REFERENCES gamer (gam_id);

ALTER TABLE round ADD FOREIGN KEY (rou_prize_id) REFERENCES prize (pri_id);

ALTER TABLE round ADD FOREIGN KEY (rou_category_id) REFERENCES category (cat_id);

ALTER TABLE question ADD FOREIGN KEY (que_category_id) REFERENCES category (cat_id);

ALTER TABLE answer ADD FOREIGN KEY (ans_question_id) REFERENCES question (que_id);
