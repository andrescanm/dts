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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'NIT',80456789,'Tranzit SAS','CL 123 45 67','Bogotá','Cundinamarca','Colombia','3231059'),(2,'NIT',80456790,'Consorcio Express','CR 23 58 96','Bogotá','Cundinamarca','Colombia','2356987'),(5,'NIT',80456791,'Ciudad Movil','CR 23 58 96','Bogotá','Cundinamarca','Colombia','6795900'),(6,'NIT',123456,'Masivo Capital SAS','CALLE 1 45 78','Bogotá','Cundinamarca','Colombia','2205060');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (2,'Cédula de ciudadanía',80123456,'Administrator','DTS','Bogotá','Cundinamarca','Colombia','3231059',1,0,0,1,NULL),(3,'Cédula de ciudadanía',45968325,'Conductor 1','CR 78 96-32','Bogotá','Cundinamarca','Colombia','5968741',5,0,1,0,1),(4,'Cédula de ciudadanía',1029684587,'Conductor 2','DG 103 11-13','Bogotá','Cundinamarca','Colombia','2006989',5,0,1,0,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (1,'DTS-596','5400','000154782','2002','2001-12-30',22,15,'3200K','3800K',3,'Volskwagen','Pasajeros',1);
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

-- Dump completed on 2021-03-29  8:26:30
