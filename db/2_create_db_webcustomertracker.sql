-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.0.25-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for web_customer_tracker
DROP DATABASE IF EXISTS `web_customer_tracker`;
CREATE DATABASE IF NOT EXISTS `web_customer_tracker` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `web_customer_tracker`;

-- Dumping structure for table web_customer_tracker.customer
DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table web_customer_tracker.customer: ~5 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`id`, `first_name`, `last_name`, `email`) VALUES
	(1, 'David', 'Adams', 'david@luv2code.com');
INSERT INTO `customer` (`id`, `first_name`, `last_name`, `email`) VALUES
	(2, 'John', 'Doe', 'john@luv2code.com');
INSERT INTO `customer` (`id`, `first_name`, `last_name`, `email`) VALUES
	(3, 'Ajay', 'Rao', 'ajay@luv2code.com');
INSERT INTO `customer` (`id`, `first_name`, `last_name`, `email`) VALUES
	(4, 'Mary', 'Public', 'mary@luv2code.com');
INSERT INTO `customer` (`id`, `first_name`, `last_name`, `email`) VALUES
	(5, 'Maxwell', 'Dixon', 'max@luv2code.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
