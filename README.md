# RewardsApplication

# Sprint Boot
A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.   
A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction  (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).   
Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

# Instruction to run the project on a local machine

  . I used MySql to store all the data
  
  . Don't forget to update your username and password of your database in application.properties 
  
  . I added the sql data in resources folder
  
  . To get all customers use the link: http://localhost:8088/customer
  
  . To get a customer by id use the link: http://localhost:8088/customers/{id} where you change {id} by any id available in the database.
  
  . To get all customers transactions use the link: http://localhost:8088/transactions
  
  . After using one of thoso links, a login form will pop up and asked you to login. Here are the credentials username: web and password: sparrow
