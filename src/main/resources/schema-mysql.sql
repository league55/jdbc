DROP TABLE IF EXISTS customers.CUSTOMER;

CREATE TABLE customers.CUSTOMER (
  ID INT NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(100) NOT NULL,
  EMAIL VARCHAR(100),
  CREATED_DATE DATE NOT NULL,
  PRIMARY KEY (ID)
);