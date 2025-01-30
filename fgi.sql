/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 100411 (10.4.11-MariaDB)
 Source Host           : localhost:3306
 Source Schema         : fgi

 Target Server Type    : MySQL
 Target Server Version : 100411 (10.4.11-MariaDB)
 File Encoding         : 65001

 Date: 29/01/2025 20:14:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for alumno
-- ----------------------------
DROP TABLE IF EXISTS `alumno`;
CREATE TABLE `alumno`  (
  `ID_Alumno` int NOT NULL AUTO_INCREMENT,
  `ID_Persona` int NOT NULL,
  `ID_Programa` int NOT NULL,
  PRIMARY KEY (`ID_Alumno`) USING BTREE,
  INDEX `Alumno_Persona`(`ID_Persona` ASC) USING BTREE,
  CONSTRAINT `Alumno_Persona` FOREIGN KEY (`ID_Persona`) REFERENCES `persona` (`ID_Persona`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for asignacion
-- ----------------------------
DROP TABLE IF EXISTS `asignacion`;
CREATE TABLE `asignacion`  (
  `ID_Asignacion` int NOT NULL AUTO_INCREMENT,
  `ID_Instructor` int NOT NULL,
  `ID_Programa` int NOT NULL,
  PRIMARY KEY (`ID_Asignacion`) USING BTREE,
  INDEX `Asignacion_Instructor`(`ID_Instructor` ASC) USING BTREE,
  INDEX `Asignacion_Programa`(`ID_Programa` ASC) USING BTREE,
  CONSTRAINT `Asignacion_Instructor` FOREIGN KEY (`ID_Instructor`) REFERENCES `instructor` (`ID_Instructor`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Asignacion_Programa` FOREIGN KEY (`ID_Programa`) REFERENCES `programa` (`ID_Programa`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for asistencia
-- ----------------------------
DROP TABLE IF EXISTS `asistencia`;
CREATE TABLE `asistencia`  (
  `ID_Asistencia` int NOT NULL AUTO_INCREMENT,
  `ID_Programa` int NOT NULL,
  `ID_Prueba` int NOT NULL,
  `Estado` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`ID_Asistencia`) USING BTREE,
  INDEX `Asistencia_Programa`(`ID_Programa` ASC) USING BTREE,
  INDEX `Asistencia_Prueba`(`ID_Prueba` ASC) USING BTREE,
  CONSTRAINT `Asistencia_Programa` FOREIGN KEY (`ID_Programa`) REFERENCES `programa` (`ID_Programa`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Asistencia_Prueba` FOREIGN KEY (`ID_Prueba`) REFERENCES `prueba` (`ID_Prueba`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for certificado
-- ----------------------------
DROP TABLE IF EXISTS `certificado`;
CREATE TABLE `certificado`  (
  `ID_Certificado` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Fecha_expedicion` date NOT NULL,
  `Fecha_expiracion` date NOT NULL,
  `Descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Estado` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`ID_Certificado`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for especialidad
-- ----------------------------
DROP TABLE IF EXISTS `especialidad`;
CREATE TABLE `especialidad`  (
  `ID_Especialidad` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`ID_Especialidad`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for factura
-- ----------------------------
DROP TABLE IF EXISTS `factura`;
CREATE TABLE `factura`  (
  `ID_Factura` int NOT NULL AUTO_INCREMENT,
  `ID_Pago` int NOT NULL,
  PRIMARY KEY (`ID_Factura`) USING BTREE,
  INDEX `Factura_Pago`(`ID_Pago` ASC) USING BTREE,
  CONSTRAINT `Factura_Pago` FOREIGN KEY (`ID_Pago`) REFERENCES `pagos` (`ID_Inscripcion`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for inscripcion
-- ----------------------------
DROP TABLE IF EXISTS `inscripcion`;
CREATE TABLE `inscripcion`  (
  `ID_Inscripcion` int NOT NULL AUTO_INCREMENT,
  `ID_Alumno` int NOT NULL,
  `ID_Programa` int NOT NULL,
  PRIMARY KEY (`ID_Inscripcion`) USING BTREE,
  INDEX `Inscripcion_Alumno`(`ID_Alumno` ASC) USING BTREE,
  INDEX `Inscripcion_Programa`(`ID_Programa` ASC) USING BTREE,
  CONSTRAINT `Inscripcion_Alumno` FOREIGN KEY (`ID_Alumno`) REFERENCES `alumno` (`ID_Alumno`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Inscripcion_Programa` FOREIGN KEY (`ID_Programa`) REFERENCES `programa` (`ID_Programa`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for instructor
-- ----------------------------
DROP TABLE IF EXISTS `instructor`;
CREATE TABLE `instructor`  (
  `ID_Instructor` int NOT NULL AUTO_INCREMENT,
  `ID_Persona` int NOT NULL,
  `ID_Especialidad` int NULL DEFAULT NULL,
  `Usuario` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `Contraseña` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `ID_Programa` int NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Instructor`) USING BTREE,
  INDEX `Instructor_Persona`(`ID_Persona` ASC) USING BTREE,
  INDEX `Instructor_Especialidad`(`ID_Especialidad` ASC) USING BTREE,
  CONSTRAINT `Instructor_Especialidad` FOREIGN KEY (`ID_Especialidad`) REFERENCES `especialidad` (`ID_Especialidad`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Instructor_Persona` FOREIGN KEY (`ID_Persona`) REFERENCES `persona` (`ID_Persona`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`  (
  `ID_Material` int NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`ID_Material`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for pagos
-- ----------------------------
DROP TABLE IF EXISTS `pagos`;
CREATE TABLE `pagos`  (
  `ID_Pagos` int NOT NULL AUTO_INCREMENT,
  `ID_Inscripcion` int NOT NULL,
  `Fecha_Pago` datetime NOT NULL,
  PRIMARY KEY (`ID_Pagos`) USING BTREE,
  INDEX `Pago_Inscripcion`(`ID_Inscripcion` ASC) USING BTREE,
  CONSTRAINT `Pago_Inscripcion` FOREIGN KEY (`ID_Inscripcion`) REFERENCES `inscripcion` (`ID_Inscripcion`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for persona
-- ----------------------------
DROP TABLE IF EXISTS `persona`;
CREATE TABLE `persona`  (
  `ID_Persona` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Apellido_paterno` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Apellido_materno` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Telefono` int NOT NULL,
  `CI` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Fecha_nacimiento` date NOT NULL,
  `Direccion` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `Correo_electronico` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`ID_Persona`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for programa
-- ----------------------------
DROP TABLE IF EXISTS `programa`;
CREATE TABLE `programa`  (
  `ID_Programa` int NOT NULL AUTO_INCREMENT,
  `ID_Certificado` int NULL DEFAULT NULL,
  `ID_Material` int NULL DEFAULT NULL,
  `Nombre` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Fecha_inicio` date NOT NULL,
  `Fecha_fin` date NOT NULL,
  `Costo` int NOT NULL,
  `Horario` time NULL DEFAULT NULL,
  `Descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Max_inscritos` int NOT NULL,
  PRIMARY KEY (`ID_Programa`) USING BTREE,
  INDEX `Programa_Certificado`(`ID_Certificado` ASC) USING BTREE,
  INDEX `Programa_Material`(`ID_Material` ASC) USING BTREE,
  CONSTRAINT `Programa_Certificado` FOREIGN KEY (`ID_Certificado`) REFERENCES `certificado` (`ID_Certificado`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Programa_Material` FOREIGN KEY (`ID_Material`) REFERENCES `material` (`ID_Material`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for prueba
-- ----------------------------
DROP TABLE IF EXISTS `prueba`;
CREATE TABLE `prueba`  (
  `ID_Prueba` int NOT NULL AUTO_INCREMENT,
  `Tipo_prueba` varchar(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Lugar` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Calificacion` int NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  PRIMARY KEY (`ID_Prueba`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
