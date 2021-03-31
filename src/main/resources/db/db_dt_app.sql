-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: db_dt_app
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa` (
  `id_empresa` int NOT NULL AUTO_INCREMENT,
  `tipo_identificacion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `numero_identificacion` int NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `ciudad` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `departamento` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `pais` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_empresa`),
  UNIQUE KEY `numero_identificacion_UNIQUE` (`numero_identificacion`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'NIT',80456789,'Tranzit SAS','CL 123 45 67','Bogotá','Cundinamarca','Colombia','3231059'),(2,'NIT',80456790,'Consorcio Express','CR 23 58 96','Bogotá','Cundinamarca','Colombia','2356987'),(5,'NIT',80456791,'Ciudad Movil','CR 23 58 96','Bogotá','Cundinamarca','Colombia','6795900'),(6,'NIT',123456,'Masivo Capital SAS','CALLE 1 45 78','Bogotá','Cundinamarca','Colombia','2205060'),(7,'NIT',77896541,'ETIB SAS','Av. El Dorado No. 68 C61 Oficina 529','Bogotá','Cundinamarca','Colombia','4543923'),(36,'NIT',45873396,'ESTE ES MI BUS S.A.S.','TRANSV. 94 L N°80-53','Bogotá','Cundinamarca','Colombia','4422584'),(37,'NIT',79833145,'ORGANIZACIÓN SUMA S.A.S.','CR 17 No.70-31 SUR','Bogotá','Cundinamarca','Colombia','3846240'),(41,'RUT',1323648,'GMÓVIL S.A.S.','Calle 24D # 86-53','Bogotá','Cundinamarca','Colombia','3225641');
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `tipo_identificacion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `numero_identificacion` int NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `ciudad` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `departamento` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `pais` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `id_empresa` int DEFAULT NULL,
  `es_representante_legal` tinyint DEFAULT NULL,
  `es_conductor` tinyint DEFAULT NULL,
  `es_admin` tinyint DEFAULT NULL,
  `id_vehiculo` int DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `numero_identificacion_UNIQUE` (`numero_identificacion`),
  KEY `fk_usuario_empresa_idx` (`id_empresa`),
  KEY `fk_usuario_vehiculo_idx` (`id_vehiculo`),
  CONSTRAINT `fk_usuario_empresa` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_usuario_vehiculo` FOREIGN KEY (`id_vehiculo`) REFERENCES `vehiculo` (`id_vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (2,'Cédula de ciudadanía',80123456,'José Gaviria','CL 122 S # 7 -96','Bogotá','Cundinamarca','Colombia','3231059',1,0,0,1,2),(3,'Cédula de ciudadanía',45968325,'Conductor 1','CR 78 96-32','Bogotá','Cundinamarca','Colombia','5968741',5,0,1,0,1),(4,'Cédula de ciudadanía',1029684587,'Conductor 2','DG 103 11-13','Bogotá','Cundinamarca','Colombia','2006989',5,0,1,0,1),(6,'LICENCIA',106588,'Juan Pablo Herrera','CR 103 # 12 - 36','Bogotá','Cundinamarca','Colombia','2003668',5,0,0,0,1),(7,'Cédula de ciudadanía',80123433,'Conductor 3','CR 103 # 23 - 69','Bogotá','Cundinamarca','Colombia','3231059',1,0,1,0,2),(10,'NIT',3569335,'Francisco Pachón','Av 72 # 65 - 63','Bogotá','Cundinamarca','Colombia','2005696',1,0,1,0,1),(11,'NIT',556369,'Fredy Parra','CL 1221 698','Bogotá','Bogotá','Colombia','9665831',6,0,0,0,6),(12,'PASAPORTE',99632659,'Omar Contreras','CR 45 65 88','Bogotá','Bogotá','Colombia','31025489',6,0,0,0,6),(13,'NIT',8874143,'Luz Moreno','Dg 456 e4','Bogotá','Bogotá','Colombia','7986532',6,0,0,0,6);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculo` (
  `id_vehiculo` int NOT NULL AUTO_INCREMENT,
  `placa` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  `motor` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `chasis` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `modelo` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_matricula` date NOT NULL,
  `pasajeros_sentados` smallint NOT NULL,
  `pasajeros_pie` smallint NOT NULL,
  `peso_seco` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  `peso_bruto` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  `cantidad_puertas` smallint NOT NULL,
  `marca` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `linea` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `id_empresa` int DEFAULT NULL,
  PRIMARY KEY (`id_vehiculo`),
  KEY `fk_vehiculo_empresa_idx` (`id_empresa`),
  CONSTRAINT `fk_vehiculo_empresa` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (1,'DTS-596','5400','000154782','2002','2001-12-30',22,15,'3200K','3800K',3,'Volskwagen','Pasajeros',1),(2,'WCC-123','3500','Monocasco','2021','2021-03-01',20,13,'3200','3300',6,'Volkswagen','Pasajeros',5),(3,'WCV-235','3500','Independiente','2021','2021-03-01',30,22,'3600','3650',6,'Mercedes Benz','Pasajeros',1),(6,'CDD-555','5000','Independiente','2018','2018-09-06',60,42,'6000','6000',8,'Blue Bird','Masivo Pasajeros',6),(7,'WXX-968','7500','Independiente','2019','2019-05-05',80,65,'6500','6600',8,'Marco Polo','Masivo Pasajeros',6);
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-31  7:55:09
