/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80023
Source Host           : localhost:3306
Source Database       : myspringboot

Target Server Type    : MYSQL
Target Server Version : 80023
File Encoding         : 65001

Date: 2024-01-21 18:17:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for area
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `area_no` int NOT NULL AUTO_INCREMENT,
  `area_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`area_no`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of area
-- ----------------------------
INSERT INTO `area` VALUES ('1', '1区');
INSERT INTO `area` VALUES ('2', '2区');
