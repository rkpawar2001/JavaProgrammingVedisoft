-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.13-rc-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema emp
--

CREATE DATABASE IF NOT EXISTS emp;
USE emp;

--
-- Definition of table `ascii_data`
--

DROP TABLE IF EXISTS `ascii_data`;
CREATE TABLE `ascii_data` (
  `id` int(11) default NULL,
  `Data` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ascii_data`
--

/*!40000 ALTER TABLE `ascii_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `ascii_data` ENABLE KEYS */;


--
-- Definition of table `binary_data`
--

DROP TABLE IF EXISTS `binary_data`;
CREATE TABLE `binary_data` (
  `id` int(11) default NULL,
  `name` varchar(45) default NULL,
  `image` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `binary_data`
--

/*!40000 ALTER TABLE `binary_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `binary_data` ENABLE KEYS */;


--
-- Definition of table `employees`
--

DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `age` int(10) unsigned NOT NULL,
  `first` varchar(45) NOT NULL,
  `last` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` (`id`,`age`,`first`,`last`) VALUES 
 (100,40,'Zara','Ali'),
 (101,35,'Sumit','Mittal'),
 (102,55,'John','Paul'),
 (103,45,'John','Paul'),
 (104,27,'Sita','Singh'),
 (105,25,'Rita','Tez'),
 (106,35,'Zia','Ali'),
 (107,40,'Raj','Kumar'),
 (108,38,'Pappu','Singh'),
 (109,36,'Pawan','Singh');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;

--
-- Create schema vedisoftjdbc
--

CREATE DATABASE IF NOT EXISTS vedisoftjdbc;
USE vedisoftjdbc;

--
-- Definition of table `courses`
--

DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `courseid` int(10) unsigned NOT NULL auto_increment,
  `coursename` varchar(45) NOT NULL,
  `coursetype` varchar(45) NOT NULL,
  PRIMARY KEY  (`courseid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` (`courseid`,`coursename`,`coursetype`) VALUES 
 (1,'Java','Certificate'),
 (2,'.NET','Certificate'),
 (3,'PHP','Certificate'),
 (4,'Software Engineering','Diploma'),
 (5,'Ethical Hacking','Diploma'),
 (6,'C ','Certificate'),
 (7,'C++','Certificate');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `code` int(11) NOT NULL,
  `basic` float NOT NULL,
  `dept` varchar(255) default NULL,
  `desig` varchar(255) default NULL,
  `doj` datetime default NULL,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`code`,`basic`,`dept`,`desig`,`doj`,`name`) VALUES 
 (1,100000,'Admin','Manager','2016-12-16 11:49:38','Rohit Ahuja'),
 (2,100000,'Admin','Manager','2016-12-16 11:56:49','Rohit Ahuja');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `studentid` int(10) unsigned NOT NULL auto_increment,
  `studentname` varchar(45) NOT NULL,
  `courseid` int(10) unsigned NOT NULL,
  `regdate` date NOT NULL,
  PRIMARY KEY  (`studentid`),
  KEY `FK_students_1` (`courseid`),
  CONSTRAINT `FK_students_1` FOREIGN KEY (`courseid`) REFERENCES `courses` (`courseid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` (`studentid`,`studentname`,`courseid`,`regdate`) VALUES 
 (2,'Manish Jain',1,'2015-10-23'),
 (3,'Akash Jain',2,'2015-10-23'),
 (4,'Sanjay Pandey',2,'2015-10-23'),
 (5,'Shweta Malhotra',1,'2015-10-23'),
 (6,'Shivi Dubey',1,'2015-10-23');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;

--
-- Create schema emp
--

CREATE DATABASE IF NOT EXISTS emp;
USE emp;

--
-- Definition of procedure `getEmpName`
--

DROP PROCEDURE IF EXISTS `getEmpName`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER' */ $$
CREATE PROCEDURE `getEmpName`(IN EMP_ID INT, OUT EMP_FIRST VARCHAR(255))
BEGIN
   SELECT first INTO EMP_FIRST
   FROM Employees
   WHERE ID = EMP_ID;
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
