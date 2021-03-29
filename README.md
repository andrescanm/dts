# dts
### Descargar y probar la aplicación
* git clone https://github.com/andrescanm/dts.git
* [En lugar de git clone puede descargar el .zip directamente desde Github]
* Restaure la base de datos de la aplicación ubicada dentro del proyecto en src\main\resources\db\db_dt_app.sql. Esto creará el schema en MySQL8 con datos iniciales.
* Importe el proyecto Java Spring (Maven) y regenere las dependencias a través de Maven->Update Project si está usando STS o Eclipse o la opción equivalente en otros IDE´s.
* Verifique los datos de conexión a la base de datos en el archivo application.properties.
* Finalmente ejecute la applicación a través de devtools como Spring Boot App. Esto levantará la aplicación en el puerto 8080.
* Las siguientes son algunas rutas disponibles para validar el servicio REST:
  - http://localhost:8080/dts/listar_empresas
  - http://localhost:8080/dts/listar_vehiculos
  - http://localhost:8080/dts/listar_usuarios
  
  ## Esta aplicación requiere la capa de frontend que podrá obtener desde: https://github.com/andrescanm/angular-dts.git
