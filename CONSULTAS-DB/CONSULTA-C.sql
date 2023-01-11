--c)	Se requiere un reporte con la cantidad de productos de cada categor?a, ordenado de mayor a menor cantidad. 

Select categories.category_id,  categories.category_name, count(products.product_id)as count from products
inner join categories
on products.category_id= categories.category_id
group by categories.category_id, categories.category_name
ORDER BY COUNT DESC;
