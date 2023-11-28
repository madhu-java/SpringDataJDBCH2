# SpringDataJDBCH2

This is a simple spring jdbc app using H2, the local database.
In this i used JdbcTemplate interface to perform basic CRUD operations using
update and queryForObject methods. The queryForObject fetches the records from DB, it  uses the BeanPropertyMapper Class object
to return the Object of the bean instaed of retuning a ResultSet object.

Also i have implemented CommandLineRunner  interface to run my CRUD functionalities as soon as the application starts.
