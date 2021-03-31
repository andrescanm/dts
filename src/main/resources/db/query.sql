SELECT 
	v.placa AS PLACA_VEHICULO, 
	e.tipo_identificacion AS TIPO_ID_EMPRESA, 
	e.numero_identificacion AS NUM_ID_EMPRESA, 
    e.nombre AS NOMBRE_EMPRESA, 
    count(u.id_usuario) AS NUM_CONDUCTORES
FROM db_dt_app.vehiculo v
JOIN  db_dt_app.empresa e ON v.id_empresa = e.id_empresa
JOIN db_dt_app.usuario u ON u.id_vehiculo = v.id_vehiculo
GROUP BY v.placa HAVING(NUM_CONDUCTORES > 2)
ORDER BY v.placa ASC;