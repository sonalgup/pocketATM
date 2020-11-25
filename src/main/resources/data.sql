CREATE TABLE USERDATA (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  email VARCHAR(250) NOT NULL,
  mobile_number VARCHAR(50) NOT NULL,
  country_code VARCHAR(50) NOT NULL,
  gender VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  language VARCHAR(250) NOT NULL,
  pin INT NOT NULL
);
 
INSERT INTO userdata (email,mobile_number,country_code,gender,address,language,pin) VALUES
  ('gpt.varun.24@gmail.com', '8901107146', '+91','Male','40, gurgaon','english','122001'),
  ('gpt.sonal.24@gmail.com', '8901107555', '+91','Female','70, gurgaon','hindi','166001'),
  ('gpt.anshul.24@gmail.com', '1234262229', '+45','Female','10, uk','english','345');