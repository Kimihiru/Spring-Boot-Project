/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80023
Source Host           : localhost:3306
Source Database       : myspringboot

Target Server Type    : MYSQL
Target Server Version : 80023
File Encoding         : 65001

Date: 2024-01-21 18:18:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `jkm` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `area_no` int NOT NULL,
  PRIMARY KEY (`uid`),
  KEY `区域编号` (`area_no`) USING BTREE,
  CONSTRAINT `区域编号` FOREIGN KEY (`area_no`) REFERENCES `area` (`area_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9089 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('9075', 'Ace', '21', 'y', '1');
INSERT INTO `person` VALUES ('9076', 'Taluo', '21', 'y', '1');
INSERT INTO `person` VALUES ('9077', 'Taluo', '21', 'y', '1');
INSERT INTO `person` VALUES ('9078', 'Taluo', '21', 'y', '1');
INSERT INTO `person` VALUES ('9079', 'Taluo', '21', 'y', '1');
INSERT INTO `person` VALUES ('9080', 'Taluo', '21', 'y', '1');
INSERT INTO `person` VALUES ('9081', 'sss', '21', 'y', '1');
INSERT INTO `person` VALUES ('9082', 'Ace', '21', 'y', '1');
INSERT INTO `person` VALUES ('9083', 'Ace', '21', 'y', '1');
INSERT INTO `person` VALUES ('9084', 'Ace', '21', 'y', '1');
INSERT INTO `person` VALUES ('9085', 'Ace', '21', 'y', '1');
INSERT INTO `person` VALUES ('9086', 'Sakana', '21', 'y', '1');
INSERT INTO `person` VALUES ('9087', 'Sakana', '21', 'y', '1');
INSERT INTO `person` VALUES ('9088', 'Sakana', '21', 'y', '1');
