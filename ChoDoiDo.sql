CREATE TABLE admin(
	id VARCHAR(11),
    pass VARCHAR(45) NULL,
    PRIMARY KEY (id)
);

CREATE TABLE user (
	  id INT NOT NULL AUTO_INCREMENT,
	  phone VARCHAR(11) NOT NULL,
	  pass VARCHAR(45) NULL,
	  name VARCHAR(45) NULL,
	  adr VARCHAR(200) NULL,
	  sex VARCHAR(5) NULL,
	  PRIMARY KEY (id,phone)
  );

CREATE TABLE WLine (
	  idWLine INT NOT NULL AUTO_INCREMENT,
	  id INT NOT NULL,
	  name VARCHAR(45) NULL,
	  price VARCHAR(45) NULL,
	  title VARCHAR(45) NULL,
	  des VARCHAR(400) NULL,
	  PRIMARY KEY (idWLine),
	  foreign key (id) references user(id)
  );

CREATE TABLE product (
	  idProduct INT NOT NULL AUTO_INCREMENT,
	  id INT NOT NULL,
	  name VARCHAR(45) NULL,
	  price VARCHAR(45) NULL,
	  title VARCHAR(45) NULL,
	  des VARCHAR(400) NULL,
	  PRIMARY KEY (idProduct),
	  foreign key (id) references user(id)
  );
  
CREATE TABLE SelectID(
	id int,
    phoneNumber VARCHAR(11)
) 