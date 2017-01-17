# accounting-manager
A Java programm with MySQL database for private accounting.

For the database connection you will need the MySQL-connectorJ for Java.
You can download this library here:
https://dev.mysql.com/downloads/connector/j/

To get the code running, create a folder inside the project. Store the .jar file inside the folder and add this .jar to your libraries. Export the project and you can run it.
To store the transactions inside your database it is essential to create a new database and a new user.
While using phpMyAdmin, you can create a new user and check the checkbox "Create database with same name and grant all privileges.".
This will create a new Database and user. If you start the Programm, and insert the correct database-settings, the programm will create a new tabel inside the given database.

If you want an existing user to read and write the transactons, you have to give him the following privileges:
Data:
-SELECT
-INSERT
-UPDATE
-DELETE
Structure:
-CREATE
-ALTER
-INDEX

To create a new table you just have to do the same thing as with a new user.
Insert the correct database-settings and the programm will create a new table to store the values inside.
