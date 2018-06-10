-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SmartShop
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SmartShop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `smartshop` DEFAULT CHARACTER SET utf8 ;
USE `SmartShop` ;

-- -----------------------------------------------------
-- Table `SmartShop`.`shop`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `smartshop`.`shop` ;

CREATE TABLE IF NOT EXISTS `smartshop`.`shop` (
  `idshop` INT NOT NULL,
  `shopName` VARCHAR(45) NOT NULL,
  `shopBranch` VARCHAR(45) NULL,
  `shopAddress: String` VARCHAR(45) NULL,
  `shopTel` VARCHAR(45) NULL,
  PRIMARY KEY (`idshop`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SmartShop`.`stock`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `smartshop`.`stock` ;

CREATE TABLE IF NOT EXISTS `smartshop`.`stock` (
  `iditem` INT NOT NULL,
  `itemName` VARCHAR(45) NOT NULL,
  `itemDesc` VARCHAR(45) NULL,
  `itemUnitPrice` DOUBLE NULL,
  `itemMetric` VARCHAR(45) NULL,
  `lastUpdateDate` DATE NULL,
  `Status` TINYINT(1) NULL,
  `availableAmount` DOUBLE NULL,
  `shop_idshop` INT NOT NULL,
  PRIMARY KEY (`iditem`, `shop_idshop`),
  INDEX `fk_Stock_shop_idx` (`shop_idshop` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SmartShop`.`order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `smartshop`.`order` ;

CREATE TABLE IF NOT EXISTS `SmartShop`.`order` (
  `idOrder` INT NOT NULL AUTO_INCREMENT,
  `CustomerId` VARCHAR(45) NOT NULL,
  `TableId` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idOrder`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SmartShop`.`employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `smartshop`.`employee` ;

CREATE TABLE IF NOT EXISTS `SmartShop`.`employee` (
  `idemployee` VARCHAR(50) NOT NULL,
  `employeeName` VARCHAR(255) NOT NULL,
  `employeeTele` VARCHAR(45) NOT NULL,
  `employeeAddress` VARCHAR(255) NOT NULL,
  `employeePosition` VARCHAR(45) NOT NULL,
  `shop_idshop` INT NOT NULL,
  PRIMARY KEY (`idemployee`, `shop_idshop`),
  INDEX `fk_employee_shop1_idx` (`shop_idshop` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SmartShop`.`Order_has_Stock`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `smartshop`.`Order_has_Stock` ;

CREATE TABLE IF NOT EXISTS `smartshop`.`Order_has_Stock` (
  `Order_idOrder` INT NOT NULL,
  `Stock_iditem` INT NOT NULL,
  `ReadyStatus` TINYINT(1) NOT NULL,
  `employee_idemployee` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`Order_idOrder`, `Stock_iditem`, `employee_idemployee`),
  INDEX `fk_Order_has_Stock_Stock1_idx` (`Stock_iditem` ASC),
  INDEX `fk_Order_has_Stock_Order1_idx` (`Order_idOrder` ASC),
  INDEX `fk_Order_has_Stock_employee1_idx` (`employee_idemployee` ASC))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
