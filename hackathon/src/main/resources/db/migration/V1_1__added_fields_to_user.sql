ALTER TABLE user_tb ADD COLUMN role character varying(20);
ALTER TABLE user_tb ADD COLUMN phone character varying(100);
ALTER TABLE user_tb ADD COLUMN email character varying(100);

ALTER TABLE user_tb ADD COLUMN data_of_birthday character varying(100);
ALTER TABLE user_tb ADD COLUMN bad_habits character varying(1000);
ALTER TABLE user_tb ADD COLUMN animal boolean;
ALTER TABLE user_tb ADD COLUMN domestic_help boolean;
ALTER TABLE user_tb ADD COLUMN gender character varying(100);

ALTER TABLE user_tb ADD COLUMN info_about_me character varying(1000);
ALTER TABLE user_tb ADD COLUMN why_I_want_to_be_here character varying(1000);

ALTER TABLE user_tb ADD COLUMN work_study character varying(100);
ALTER TABLE user_tb ADD COLUMN work_place character varying(100);
ALTER TABLE user_tb ADD COLUMN photo character varying(100);
ALTER TABLE user_tb ADD COLUMN have_mate character varying(100);


ALTER TABLE user_tb ADD COLUMN flat_mate_gender character varying(100);
ALTER TABLE user_tb ADD COLUMN flat_mate_age character varying(100);
ALTER TABLE user_tb ADD COLUMN flat_mate_info character varying(1000);
ALTER TABLE user_tb ADD COLUMN additional_requirements character varying(1000);

