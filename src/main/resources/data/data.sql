insert into role(idrole, name, description)
values(1, 'STANDARD_USER', 'Standard User - Has no admin rights');
insert into role(idrole, name, description)
values(2, 'ADMIN_USER', 'Has permission to perform admin task');

insert into users(idusers, firstname, lastname, password, username)
values(1, 'John', 'Doe', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'johin.doe');

insert into users(idusers, firstname, lastname, password, username)
values(2, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin');


insert into users_role(idusers, idrole)
values(1, 1);
insert into users_role(idusers, idrole)
values(2, 1);
insert into users_role(idusers, idrole)
values(2, 2);


insert into city(idcity, name) values(1, 'Jakarta');
insert into city(idcity, name) values(2, 'Bandung');
insert into city(idcity, name) values(3, 'Bengaluru');
insert into city(idcity, name) values(4, 'Canada');
insert into city(idcity, name) values(5, 'California');
insert into city(idcity, name) values(6, 'New York');




