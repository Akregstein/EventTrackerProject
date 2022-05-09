-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mountainsdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mountainsdb` ;

-- -----------------------------------------------------
-- Schema mountainsdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mountainsdb` DEFAULT CHARACTER SET utf8 ;
USE `mountainsdb` ;

-- -----------------------------------------------------
-- Table `mountain`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mountain` ;

CREATE TABLE IF NOT EXISTS `mountain` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `range` VARCHAR(100) NULL,
  `elevation` INT NULL,
  `most_popular_trail` VARCHAR(100) NULL,
  `estimated_round_trip_time_hours` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS mountainclimber@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'mountainclimber'@'localhost' IDENTIFIED BY 'mountain';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'mountainclimber'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `mountain`
-- -----------------------------------------------------
START TRANSACTION;
USE `mountainsdb`;
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (1, 'Kit Carson', 'Sangre de Cristo', 14165, 'Challenger Point', 9);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (2, 'Uncompahgre', 'San Juan Mountains', 14308, 'South Ridge', 4);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (3, 'Castle', 'Elk Mountains', 14265, 'Northeast Ridge', 6);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (4, 'Humbolt Peak', 'Sangre de Cristo', 14046, 'West Ridge', 5);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (5, 'Handies Peak', 'San Juan Mountains', 14048, 'Southwest Slope', 3);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (6, 'Conundrum Peak', 'Elk Mountains', 14060, 'South Ridge', 4);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (7, 'Mt Lindsey', 'Sangre de Cristo', 14042, 'Northwest Gully', 7);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (8, 'Little Bear Peak', 'Sangre de Cristo', 14037, 'West Ridge', 7);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (9, 'Pyramid Peak', 'ELk Mountains', 14018, 'Northeast Ridge', 7);
INSERT INTO `mountain` (`id`, `name`, `range`, `elevation`, `most_popular_trail`, `estimated_round_trip_time_hours`) VALUES (10, 'Huron Peak', 'Sawatch Range', 14003, 'Northwest Slopes', 3);

COMMIT;

