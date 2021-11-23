#CRIAR E SELECIONAR O DATABASE ANTES DE SUBIR A APLICAÇÃO:

CREATE SCHEMA `project_bootcamp`;

USE `project_bootcamp`;

#SUBIR A APLICAÇÃO PARA CRIAÇÃO DAS TABELAS E SÓ DEPOIS POPULÁ-LAS:

INSERT INTO `project_bootcamp`.`department` (`idDepartment`, `createdAt`, `name`) VALUES ('1', '2021-11-19', 'Desenvolvimento Web');
INSERT INTO `project_bootcamp`.`department` (`idDepartment`, `createdAt`, `name`) VALUES ('2', '2021-11-19', 'Desenvolvimento Mobile');
INSERT INTO `project_bootcamp`.`department` (`idDepartment`, `createdAt`, `name`) VALUES ('3', '2021-11-19', 'Testes de Software');

INSERT INTO `project_bootcamp`.`room` (`idRoom`, `area`, `available`, `createdAt`, `idDepartment`) VALUES ('301', '10', '1', '2021-11-19', '1');
INSERT INTO `project_bootcamp`.`room` (`idRoom`, `area`, `available`, `createdAt`, `idDepartment`) VALUES ('302', '10', '1', '2021-11-19', '1');
INSERT INTO `project_bootcamp`.`room` (`idRoom`, `area`, `available`, `createdAt`, `idDepartment`) VALUES ('402', '10', '1', '2021-11-19', '2');
INSERT INTO `project_bootcamp`.`room` (`idRoom`, `area`, `available`, `createdAt`, `idDepartment`) VALUES ('404', '10', '1', '2021-11-19', '2');
INSERT INTO `project_bootcamp`.`room` (`idRoom`, `area`, `available`, `createdAt`, `idDepartment`) VALUES ('603', '10', '1', '2021-11-19', '3');
INSERT INTO `project_bootcamp`.`room` (`idRoom`, `area`, `available`, `createdAt`, `idDepartment`) VALUES ('605', '10', '1', '2021-11-19', '3');

INSERT INTO `project_bootcamp`.`employee` (`idEmployee`, `createdAt`, `email`, `name`, `idDepartment`) VALUES ('1001', '2021-11-19', 'pgregorio@mail.com', 'Pedro Gregório', '1');
INSERT INTO `project_bootcamp`.`employee` (`idEmployee`, `createdAt`, `email`, `name`, `idDepartment`) VALUES ('1002', '2021-11-19', 'soliveira@mail.com', 'Samuel Oliveira', '1');
INSERT INTO `project_bootcamp`.`employee` (`idEmployee`, `createdAt`, `email`, `name`, `idDepartment`) VALUES ('1003', '2021-11-19', 'mluana@mail.com', 'Maria Luana', '2');
INSERT INTO `project_bootcamp`.`employee` (`idEmployee`, `createdAt`, `email`, `name`, `idDepartment`) VALUES ('1004', '2021-11-19', 'mmarques@mail.com', 'Mago Marques', '2');
INSERT INTO `project_bootcamp`.`employee` (`idEmployee`, `createdAt`, `email`, `name`, `idDepartment`) VALUES ('1005', '2021-11-19', 'lnogueira@mail.com', 'Letícia Nogueira', '3');
INSERT INTO `project_bootcamp`.`employee` (`idEmployee`, `createdAt`, `email`, `name`, `idDepartment`) VALUES ('1006', '2021-11-19', 'apereira@mail.com', 'Andréa Pereira', '3');

INSERT INTO `project_bootcamp`.`scheduling` (`idScheduling`, `createdAt`, `day`, `idEmployee`, `idRoom`) VALUES ('31', '2021-11-19', '2021-11-22', '1001', '402');
INSERT INTO `project_bootcamp`.`scheduling` (`idScheduling`, `createdAt`, `day`, `idEmployee`, `idRoom`) VALUES ('32', '2021-11-19', '2021-11-22', '1003', '605');
INSERT INTO `project_bootcamp`.`scheduling` (`idScheduling`, `createdAt`, `day`, `idEmployee`, `idRoom`) VALUES ('33', '2021-11-19', '2021-11-23', '1004', '302');
INSERT INTO `project_bootcamp`.`scheduling` (`idScheduling`, `createdAt`, `day`, `idEmployee`, `idRoom`) VALUES ('34', '2021-11-19', '2021-11-24', '1001', '603');
INSERT INTO `project_bootcamp`.`scheduling` (`idScheduling`, `createdAt`, `day`, `idEmployee`, `idRoom`) VALUES ('35', '2021-11-19', '2021-11-24', '1002', '402');
INSERT INTO `project_bootcamp`.`scheduling` (`idScheduling`, `createdAt`, `day`, `idEmployee`, `idRoom`) VALUES ('36', '2021-11-19', '2021-11-24', '1006', '301');
INSERT INTO `project_bootcamp`.`scheduling` (`idScheduling`, `createdAt`, `day`, `idEmployee`, `idRoom`) VALUES ('37', '2021-11-19', '2021-11-25', '1005', '402');
