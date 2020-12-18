-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: localhost    Database: MemberDB
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `MemberDAO`
--

DROP TABLE IF EXISTS `MemberDAO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `MemberDAO` (
  `id` varchar(12) NOT NULL,
  `pwd` varchar(12) NOT NULL,
  `name` varchar(16) NOT NULL,
  `tel` varchar(13) NOT NULL,
  `addr` varchar(100) NOT NULL,
  `birth` varchar(10) NOT NULL,
  `job` varchar(50) NOT NULL,
  `gender` varchar(2) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `date` varchar(10) NOT NULL,
  `dateCheck` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MemberDAO`
--

LOCK TABLES `MemberDAO` WRITE;
/*!40000 ALTER TABLE `MemberDAO` DISABLE KEYS */;
INSERT INTO `MemberDAO` VALUES ('coffee','qwe123','커피콩','031-1004-1493','서울','2020-12-12','백수','남','coffee@gmail.com','2020-11-20','30일'),('corner','0008','킹기훈','010-7350-1234','서울','1995-08-16','개발자','남','corner@gmail.com','2020-12-12','21일'),('hong','qwe123','홍길동','010-1425-1510','한양','1420-10-10','백수','남','hong@gmail.com','2020-11-12','10일'),('id1','id1','김치','010-1111-1111','김치냉장고','2020-12-07','주부','남','kimchi@naver.com','2020-12-08','36일'),('op12','op12','김전적','010-1122-2323','op.gg','1992-10-10','주부','남','op@gg.gg','2020-12-01','24일'),('qwe123','qwe123','atom','010-1111-2222','galaxy','1999-10-10','백수','남','atom@gmail.com','2020-12-10','22일'),('simons','tlahstm123','시몬스','031-1600-1400','침대','1960-10-02','직장인','남','simons@gmail.com','2020-10-10','0일'),('test1','test1','두더지','010-1111-1112','땅굴','1999-01-01','백수','남','dudu@hotmail.com','2020-01-01','0일'),('test1208','test','테스트','010-1010-2020','수원','1999-12-01','학생','남','test222@gmail.com','2020-12-11','18일'),('test2','test2','리버풀','010-4040-3030','영국','1974-03-24','직장인','남','le@gmail.com','2020-12-12','0일'),('test9999','test999','테스트','010-1111-1111','경기','1999-12-12','개발자','남','qwe@gmail.com','2020-12-10','30일');
/*!40000 ALTER TABLE `MemberDAO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MenuDAO`
--

DROP TABLE IF EXISTS `MenuDAO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `MenuDAO` (
  `id` varchar(12) NOT NULL,
  `pwd` varchar(12) NOT NULL,
  `name` varchar(16) NOT NULL,
  `height` varchar(4) NOT NULL,
  `weight` varchar(4) NOT NULL,
  KEY `pwd_idx` (`pwd`),
  KEY `id_idx` (`id`),
  KEY `name_idx` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MenuDAO`
--

LOCK TABLES `MenuDAO` WRITE;
/*!40000 ALTER TABLE `MenuDAO` DISABLE KEYS */;
INSERT INTO `MenuDAO` VALUES ('qwe123','qwe123','','173','60'),('op12','op12','김전적','','');
/*!40000 ALTER TABLE `MenuDAO` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-18 18:29:11
