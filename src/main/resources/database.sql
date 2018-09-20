CREATE DATABASE telecomone;
USE telecomone;
CREATE TABLE netbuddy (
  	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    sheet_name varchar(50),
  	cme_name varchar(50),
	field_tsg_no int(10),
	sr_no varchar(15),
	status varchar(30),
	customer_category varchar(30),
	complaint_category varchar(100),
	network_type varchar(50),
	customer_name varchar(100),
	mobile_number bigint,
	district varchar(100),
	remark varchar(5000),
	latitude float(8,5),
	longitude float(8,5),
	complaint_date datetime,
	assigned_to_cme_date datetime,
	assigned_to_field_date datetime,
	compliant_closed_date datetime
);