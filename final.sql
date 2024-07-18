-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: vuelos
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `avion`
--

DROP TABLE IF EXISTS `avion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `avion` (
  `id` int NOT NULL,
  `Cantidad_pasajeros` int NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Aerolinea` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avion`
--

LOCK TABLES `avion` WRITE;
/*!40000 ALTER TABLE `avion` DISABLE KEYS */;
INSERT INTO `avion` VALUES (1,300,'Boeing 777-300ER','Emirates'),(2,350,'Airbus A380','Singapore Airlines'),(3,200,'Boeing 787 Dreamliner','All Nippon Airways');
/*!40000 ALTER TABLE `avion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `butacas`
--

DROP TABLE IF EXISTS `butacas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `butacas` (
  `id` int NOT NULL,
  `nombre_butaca` varchar(4) NOT NULL,
  `avion_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Foranea_idx` (`avion_id`),
  CONSTRAINT `ForaneaAvion` FOREIGN KEY (`avion_id`) REFERENCES `avion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `butacas`
--

LOCK TABLES `butacas` WRITE;
/*!40000 ALTER TABLE `butacas` DISABLE KEYS */;
INSERT INTO `butacas` VALUES (1,'A-1',1),(2,'A-2',1),(3,'A-3',1),(4,'A-4',1),(5,'B-1',1),(6,'B-2',1),(7,'B-3',1),(8,'B-4',1),(9,'A-1',2),(10,'A-2',2),(11,'A-3',2),(12,'A-4',2),(13,'B-1',2),(14,'B-2',2),(15,'B-3',2),(16,'B-4',2),(17,'A-1',3),(18,'A-2',3),(19,'A-3',3),(20,'A-4',3),(21,'B-1',3),(22,'B-2',3),(23,'B-3',3),(24,'B-4',3);
/*!40000 ALTER TABLE `butacas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudades` (
  `idciudades` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idciudades`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudades`
--

LOCK TABLES `ciudades` WRITE;
/*!40000 ALTER TABLE `ciudades` DISABLE KEYS */;
INSERT INTO `ciudades` VALUES (1,'Miami'),(2,'Buenos Aires'),(3,'Rio de Janeiro'),(4,'Cancún');
/*!40000 ALTER TABLE `ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pasajeros`
--

DROP TABLE IF EXISTS `pasajeros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pasajeros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `dni` int DEFAULT NULL,
  `usuario_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `usuarios_pasajeros_idx` (`usuario_id`),
  CONSTRAINT `usuarios_pasajeros` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`idusuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasajeros`
--

LOCK TABLES `pasajeros` WRITE;
/*!40000 ALTER TABLE `pasajeros` DISABLE KEYS */;
/*!40000 ALTER TABLE `pasajeros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `vuelo_id` int DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `estado` tinyint DEFAULT NULL,
  `pasajeros` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `vuelo_reservas_idx` (`vuelo_id`),
  CONSTRAINT `vuelo_reservas` FOREIGN KEY (`vuelo_id`) REFERENCES `vuelos` (`IDvuelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuarios` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `contrasenia` varchar(255) NOT NULL,
  PRIMARY KEY (`idusuarios`),
  UNIQUE KEY `correo_UNIQUE` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Luisina','Gomez','luisinagomez@gmail.com','violeta123'),(22,'luisina','as','griseldadalesio@gmail.com','luisina1'),(23,'liz','gonzalez','dg1255540@gmail.com','luisina1'),(24,'sad','sd','luisinagomez752@gmail.com','luisina1');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vuelos`
--

DROP TABLE IF EXISTS `vuelos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vuelos` (
  `IDvuelo` int NOT NULL AUTO_INCREMENT,
  `Salida` varchar(100) DEFAULT NULL,
  `Destino` varchar(100) DEFAULT NULL,
  `HorarioSalida` time DEFAULT NULL,
  `Estado` varchar(50) DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `HorarioLlegada` time DEFAULT NULL,
  `FechaLlegada` date DEFAULT NULL,
  `Id_avion_vuelos` int DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`IDvuelo`),
  KEY `Foranea_Vuelo_Avion_idx` (`Id_avion_vuelos`),
  CONSTRAINT `Foranea_Vuelo_Avion` FOREIGN KEY (`Id_avion_vuelos`) REFERENCES `avion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelos`
--

LOCK TABLES `vuelos` WRITE;
/*!40000 ALTER TABLE `vuelos` DISABLE KEYS */;
INSERT INTO `vuelos` VALUES (13,'Buenos Aires','Cancún','15:00:00','A tiempo','2024-07-14','23:00:00','2024-07-14',1,100),(14,'Cancún','Buenos Aires','12:30:00','A tiempo','2024-07-14','19:00:00','2024-07-14',2,200),(15,'Buenos Aires','Miami','12:00:00','A tiempo','2024-07-13','09:00:00','2024-07-14',3,150),(16,'Buenos Aires','Miami','12:00:00','A tiempo','2024-07-11','12:00:00','2024-07-12',3,300),(17,'Buenos Aires','Rio de Janeiro','17:00:00','A tiempo','2024-07-17','12:00:00','2024-07-18',2,400),(18,'Buenos Aires','Miami','18:00:00',NULL,'2024-07-20','12:00:00','2024-07-21',1,500);
/*!40000 ALTER TABLE `vuelos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vuelosactuales`
--

DROP TABLE IF EXISTS `vuelosactuales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vuelosactuales` (
  `IDvuelo` int NOT NULL AUTO_INCREMENT,
  `Salida` varchar(100) DEFAULT NULL,
  `Destino` varchar(100) DEFAULT NULL,
  `Horario` time DEFAULT NULL,
  `Estado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IDvuelo`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelosactuales`
--

LOCK TABLES `vuelosactuales` WRITE;
/*!40000 ALTER TABLE `vuelosactuales` DISABLE KEYS */;
/*!40000 ALTER TABLE `vuelosactuales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-17 23:47:10
