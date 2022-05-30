CREATE TABLE admin(
	id INT NOT NULL AUTO_INCREMENT,
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
  CREATE TABLE SelectID (
  id INT NULL,
  phoneNumber VARCHAR(11) NULL);
  
  -- insert 
INSERT INTO user (phone, pass, name, adr, sex) VALUES ('0905416010', '123', 'Trung', 'ĐN', 'nam');
INSERT INTO user (phone, pass, name, adr, sex) VALUES ('0777549105', '123', 'Chương', 'ĐN', 'nam');

INSERT INTO product (id, name, price, title, des) VALUES ('1', 'Điện thoại', '5000000', 'Iphone Xsm', 'máy đã sử dụng, chưa sửa chữa');
INSERT INTO product (id, name, price, title, des) VALUES ('2', 'Laptop', '10000000', 'Asus i7', 'máy mới , đã sử dụng chưa sửa chữa');

  