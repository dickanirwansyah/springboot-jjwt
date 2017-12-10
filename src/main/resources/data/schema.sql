create database dbauthentication;

use dbauthentication;

create table city(

    idcity int not null AUTO_INCREMENT,
    name varchar(255) not null,

    constraint pk_idcity primary key (idcity)
);

create table role(

   idrole int not null AUTO_INCREMENT,
   name varchar(255) not null,
   description varchar(255) not null,

   constraint pk_idrole primary key (idrole)
);


create table users(

    idusers int not null AUTO_INCREMENT,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    password varchar(255) not null,
    username varchar(255) not null,

    constraint pk_idusers primary key (idusers)
);

create table users_role(

    idusers int not null,
    idrole int not null,

    constraint pk_users_idusers_idrole primary key (idusers, idrole),
    constraint fk_ur_idusers foreign key (idusers) references users(idusers),
    constraint fk_ur_idrole foreign key (idrole) references role(idrole)
);