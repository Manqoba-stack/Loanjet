DROP TABLE IF EXISTS loanuser;
drop table if exists hibernate_sequence;

create table loanuser(
                   id binary(16) not null,
                   name varchar(50),
                   surname varchar(50),
                   email varchar(100),
                   phone_number varchar(30),
                   address varchar(100),
                   is_Lender boolean default false,
                   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                   primary key(id)
);

create table hibernate_sequence(
   next_val bigint
) ;

insert into hibernate_sequence values ( 1 );
-- DROP
--CREATE TABLE USER(
--                   id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
--                   first_name VARCHAR(50) NOT NULL,
--                   last_name VARCHAR(50) NOT NULL,
--                   email VARCHAR(100) NOT NULL,
--                   isLender BOOLEAN NOT NULL,
--                   address VARCHAR(255) NOT NULL,
--                   password VARCHAR(255) DEFAULT NULL,
--                   phone_number varchar(20) DEFAULT NULL,
--                   title VARCHAR(50) DEFAULT NULL,
--                   biography VARCHAR(255) DEFAULT NULL,
--                   enabled BOOLEAN DEFAULT FALSE,
--                   locked BOOLEAN DEFAULT NULL,
--                   multi_factor_auth BOOLEAN DEFAULT NULL,
--                   image_url varchar(255) DEFAULT NULL,
--                   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--                   CONSTRAINT UQ_Users_Email UNIQUE (email)
--) engine=InnoDB;
