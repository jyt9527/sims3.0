/*
Navicat MySQL Data Transfer

Source Server         : MySQL5.5
Source Server Version : 50500
Source Host           : localhost:3306
Source Database       : sims_new

Target Server Type    : MYSQL
Target Server Version : 50500
File Encoding         : 65001

Date: 2019-04-21 23:18:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tab_admin`
-- ----------------------------
DROP TABLE IF EXISTS `tab_admin`;
CREATE TABLE `tab_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminid` varchar(50) DEFAULT NULL,
  `adminname` varchar(30) NOT NULL,
  `adminpwd` varchar(50) NOT NULL,
  `roleid` varchar(50) DEFAULT NULL,
  `admintel` varchar(50) DEFAULT NULL,
  `admindate` date DEFAULT NULL,
  `photopath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_admin
-- ----------------------------
INSERT INTO `tab_admin` VALUES ('1', '113', 'admin', 'admin', '超级管理员', '17852001205', '2019-04-04', 'upload/9db681d7-5998-4a66-9b49-505c7443fd14.jpg');
INSERT INTO `tab_admin` VALUES ('2', '113', '123', '123', '管理员', '17852001205', '2019-04-04', 'upload/07ae5dbc-0d30-458d-9882-bc89f75d961b.jpg');
INSERT INTO `tab_admin` VALUES ('3', '113', '2016134001', '123', '管理员', '17852001200', '2019-04-04', 'upload/d707759f-b29a-4786-92b3-5bb1e4499162.jpg');
INSERT INTO `tab_admin` VALUES ('4', '113', '2016134002', '123', '管理员', '17852001201', '2019-04-04', 'upload/d6bfe75a-1c13-43fe-9e6c-5e715b67bbb3.jpg');
INSERT INTO `tab_admin` VALUES ('6', '2', '5', '5', '5', '5', '1970-01-01', 'upload/18e79a12-ba34-4f36-88db-be4ff11ce0ab.jpg');

-- ----------------------------
-- Table structure for `tab_student`
-- ----------------------------
DROP TABLE IF EXISTS `tab_student`;
CREATE TABLE `tab_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentid` varchar(50) DEFAULT NULL,
  `studentname` varchar(30) NOT NULL,
  `place` varchar(50) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `majorid` varchar(50) DEFAULT NULL,
  `photopath` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_student
-- ----------------------------
INSERT INTO `tab_student` VALUES ('2', '113', '2016134012', '123456', '15265431336', '计算机', 'upload/2e22d4a3-5361-48ec-8b79-6739ccb2b748.jpg');
