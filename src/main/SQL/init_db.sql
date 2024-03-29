-- 1 init_db.sql;
DROP TABLE IF EXISTS project_worker;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS worker;

create table worker(id SERIAL not null primary key
	, name varchar not null check(length(name)>2 and length(name)<1000)
	, birthday DATE not null check(birthday > '1900-01-01')
	, level varchar not null check(level IN ('Trainee','Junior','Middle','Senior'))
	, salary int not null default 100 check(salary > 99 and salary < 100000)
);

create table client(id SERIAL not null primary key
	, name varchar not null check(length(name)>2 and length(name)<1000)
);

create table project(id SERIAL not null primary key
	, client_id int
	, start_date date
	, finish_date date
	, foreign key (client_id) references client(id)
);

create table project_worker(project_id int not null
	, worker_id int not null
	, foreign key (project_id) references project(id)
	, foreign key (worker_id) references worker(id)
	, primary key(project_id, worker_id)
);
