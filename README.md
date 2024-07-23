# userHibernate
Project Maven java with Spring Hibernate framework (mysql database)

This project was made using Eclipse Ide, with the main class "UserHibernateApplication".
Once this class is running, start Tomcat, and via Postman it is possible to call the get and post endpoints, as below:

(get) http://localhost:8080/api/users/1                      (access record id = 1 in "user" table of "camel" mysql database)
or
(post) http://localhost:8080/api/users                       (insert record in "user" table)
request:
{
    "email": "teste@gmail.com",
    "name": "teste"
}

Structure of database:

+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | bigint(20)   | NO   | PRI | NULL    | auto_increment |
| email | varchar(255) | YES  |     | NULL    |                |
| name  | varchar(255) | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+

 
