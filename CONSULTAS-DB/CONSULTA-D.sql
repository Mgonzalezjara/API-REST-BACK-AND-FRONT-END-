--d)	Se requiere un reporte con la cantidad de inventario de productos por marca, ordenado descendentemente
select brands.brand_id, brands.brand_name, sum (stocks.quantity) as SUMA
FROM brands
INNER JOIN products on products.brand_id = brands.brand_id
INNER JOIN stocks on stocks.product_id = products.product_id 
group by brands.brand_id, brands.brand_name
order by suma DESC;
