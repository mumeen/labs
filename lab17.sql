-#1
SELECT * FROM northwind.customers;

--#2
SELECT DISTINCT country_region(s)
 FROM northwind.customers
 --3
 SELECT  last_name FROM northwind.customers WHERE last_name like ('b%');
 
 --4
 select * from orders Limit 100 ;
 
 --5
 select * from northwind.customers where zip_postal_code like (1010) or 
 zip_postal_code like (3012) or zip_postal_code like (12209) or zip_postal_code like (05023);
 //second answer
 SELECT * FROM northwind.customers WHERE zip_postal_code in(1010, 3012, 12209, 05023);
 
 --6
 select * from northwind.customers where ship_country_region is not null;
 --7
 select * from northwind.customers  ORDER BY country_region, city;
 --8
 insert customers (company, last_name, first_name, job_title, city) values ('comcast', 'Deshawn', 'Lewis', 'cable Installer', 'Detroit');
-- #9
update orders set orders.ship_zip_postal_code = '97201' where orders.ship_city='Portland';
-- #10
delete from order_details where order_details.quantity = '1';
-- #11
SELECT min(quantity), max(quantity), avg(quantity) from order_details;
-- #12
SELECT min(quantity), max(quantity), avg(quantity) from order_details group by order_details.order_id;
-- #13
select customer_id from orders where id = 65;
-- #14
SELECT * FROM orders inner JOIN customers on orders.customer_id=customers.id;
SELECT * FROM orders left JOIN customers on orders.customer_id=customers.id;
SELECT * FROM orders right JOIN customers on orders.customer_id=customers.id;
-- #15
select employees.first_name from employees where employees.notes is null;
-- #16.
SELECT ship_city FROM orders o inner JOIN customers c on o.customer_id=c.id where c.first_name='Francisco';

