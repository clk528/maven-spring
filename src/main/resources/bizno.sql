/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2017-05-20 08:24:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bizno
-- ----------------------------
DROP TABLE IF EXISTS `bizno`;
CREATE TABLE `bizno` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `code` bigint(20) unsigned DEFAULT '1486533567',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bizno
-- ----------------------------
INSERT INTO `bizno` VALUES ('1', '1486533567');
INSERT INTO `bizno` VALUES ('2', '1486533771');
INSERT INTO `bizno` VALUES ('3', '1486533777');
INSERT INTO `bizno` VALUES ('4', '1486533777');
INSERT INTO `bizno` VALUES ('5', '1486533778');
INSERT INTO `bizno` VALUES ('6', '1486533779');
INSERT INTO `bizno` VALUES ('7', '1486533779');
INSERT INTO `bizno` VALUES ('8', '1486533780');
INSERT INTO `bizno` VALUES ('9', '1486533780');
INSERT INTO `bizno` VALUES ('10', '1486533782');
INSERT INTO `bizno` VALUES ('11', '1486533783');
INSERT INTO `bizno` VALUES ('12', '1486533783');
INSERT INTO `bizno` VALUES ('13', '1486533786');
INSERT INTO `bizno` VALUES ('14', '1486533787');
INSERT INTO `bizno` VALUES ('15', '1486533788');
INSERT INTO `bizno` VALUES ('16', '1486533789');
INSERT INTO `bizno` VALUES ('17', '1486533789');
INSERT INTO `bizno` VALUES ('18', '1486533789');
INSERT INTO `bizno` VALUES ('19', '1486533790');
INSERT INTO `bizno` VALUES ('20', '1486533791');
INSERT INTO `bizno` VALUES ('21', '1486533793');
INSERT INTO `bizno` VALUES ('22', '1486533794');
INSERT INTO `bizno` VALUES ('23', '1486533819');
INSERT INTO `bizno` VALUES ('24', '1486533820');
INSERT INTO `bizno` VALUES ('25', '1486533820');
INSERT INTO `bizno` VALUES ('26', '1486533820');
INSERT INTO `bizno` VALUES ('27', '1486533821');
INSERT INTO `bizno` VALUES ('28', '1486533821');
INSERT INTO `bizno` VALUES ('29', '1486533821');
INSERT INTO `bizno` VALUES ('30', '1486533821');
INSERT INTO `bizno` VALUES ('31', '1486533821');
INSERT INTO `bizno` VALUES ('32', '1486533821');
INSERT INTO `bizno` VALUES ('33', '1486533822');
INSERT INTO `bizno` VALUES ('34', '1486533822');
INSERT INTO `bizno` VALUES ('35', '1486533822');
INSERT INTO `bizno` VALUES ('36', '1486533822');
INSERT INTO `bizno` VALUES ('48', '1486534093');
INSERT INTO `bizno` VALUES ('49', '1486534102');
INSERT INTO `bizno` VALUES ('50', '1486534419');
INSERT INTO `bizno` VALUES ('51', '1486534444');
INSERT INTO `bizno` VALUES ('52', '1486534445');
INSERT INTO `bizno` VALUES ('53', '1486534446');
INSERT INTO `bizno` VALUES ('54', '1486534447');
INSERT INTO `bizno` VALUES ('55', '1486534448');
INSERT INTO `bizno` VALUES ('56', '1486534449');
INSERT INTO `bizno` VALUES ('57', '1486534450');
INSERT INTO `bizno` VALUES ('58', '1486534451');
INSERT INTO `bizno` VALUES ('59', '1486534452');
INSERT INTO `bizno` VALUES ('60', '1486534453');
INSERT INTO `bizno` VALUES ('61', '1486534453');
INSERT INTO `bizno` VALUES ('62', '1486535453');
INSERT INTO `bizno` VALUES ('63', '1486535489');
INSERT INTO `bizno` VALUES ('64', '1486535493');
INSERT INTO `bizno` VALUES ('65', '1486535494');
INSERT INTO `bizno` VALUES ('66', '1486535494');
INSERT INTO `bizno` VALUES ('67', '1486535494');
INSERT INTO `bizno` VALUES ('68', '1486535495');
INSERT INTO `bizno` VALUES ('69', '1486535495');
INSERT INTO `bizno` VALUES ('70', '1486535495');
INSERT INTO `bizno` VALUES ('71', '1486535495');
INSERT INTO `bizno` VALUES ('72', '1486535495');
INSERT INTO `bizno` VALUES ('73', '1486535496');
INSERT INTO `bizno` VALUES ('74', '1486535496');
INSERT INTO `bizno` VALUES ('75', '1486535496');
INSERT INTO `bizno` VALUES ('76', '1486535496');
INSERT INTO `bizno` VALUES ('77', '1486535496');
INSERT INTO `bizno` VALUES ('78', '1486535497');
INSERT INTO `bizno` VALUES ('79', '1486535497');
INSERT INTO `bizno` VALUES ('80', '1486535497');
INSERT INTO `bizno` VALUES ('81', '1486535497');
INSERT INTO `bizno` VALUES ('82', '1486535497');
INSERT INTO `bizno` VALUES ('83', '1486535498');
INSERT INTO `bizno` VALUES ('84', '1486535498');
INSERT INTO `bizno` VALUES ('85', '1486535498');
INSERT INTO `bizno` VALUES ('86', '1486535498');
INSERT INTO `bizno` VALUES ('87', '1486535498');
INSERT INTO `bizno` VALUES ('88', '1486535499');
INSERT INTO `bizno` VALUES ('89', '1486535499');
INSERT INTO `bizno` VALUES ('90', '1486535499');
INSERT INTO `bizno` VALUES ('91', '1486535499');
INSERT INTO `bizno` VALUES ('92', '1486535499');
INSERT INTO `bizno` VALUES ('93', '1486535500');
INSERT INTO `bizno` VALUES ('94', '1486535500');
INSERT INTO `bizno` VALUES ('95', '1486535500');
INSERT INTO `bizno` VALUES ('96', '1486535500');
INSERT INTO `bizno` VALUES ('97', '1486535500');
INSERT INTO `bizno` VALUES ('98', '1486535501');
INSERT INTO `bizno` VALUES ('99', '1486535501');
INSERT INTO `bizno` VALUES ('100', '1486535501');
INSERT INTO `bizno` VALUES ('101', '1486535501');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(20) NOT NULL DEFAULT '' COMMENT '订单号',
  `payNo` varchar(20) DEFAULT NULL,
  `amount` double(255,0) NOT NULL,
  `status` varchar(10) DEFAULT '' COMMENT '订单状态:wait_pay (等待支付) pay_success(支付成功) cancel_by_system(系统取消) cancel_by_user(用户取消',
  `create_time` int(11) NOT NULL,
  `pay_time` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '611486535453528895', '8888888888888888888D', '24', 'wait_pay', '1486533567', '1486533567');
INSERT INTO `order` VALUES ('2', '621486535489528895', 'ccccccc', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('3', '631486535493528895', 'sdfsdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('4', '641486535494528895', 'sdfsfd', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('5', '651486535494528895', 'sdfsdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('6', '661486535494528895', 'sdfsdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('7', '671486535495528895', 'sdfsdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('8', '681486535495528895', 'sdfsdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('9', '691486535495528895', 'sdfdsf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('10', '701486535495528895', 'dsfdsf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('11', '711486535495528895', 'sdfsdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('12', '721486535496528895', 'fd', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('13', '731486535496528895', 'sdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('14', '741486535496528895', 'saf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('15', '751486535496528895', null, '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('16', '761486535496528895', 'dsf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('17', '771486535497528895', 'sd', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('18', '781486535497528895', 'sd', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('19', '791486535497528895', 'sdfasdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('20', '801486535497528895', 'sdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('21', '811486535497528895', 'a', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('22', '821486535498528895', 'f', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('23', '831486535498528895', 'dsf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('24', '841486535498528895', 's', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('25', '851486535498528895', 'fa', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('26', '861486535498528895', 'f', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('27', '871486535499528895', 'sdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('28', '881486535499528895', 'as', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('29', '891486535499528895', 'f', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('30', '901486535499528895', 'asdf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('31', '911486535499528895', 'a', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('32', '921486535500528895', 'f', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('33', '931486535500528895', 'as', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('34', '941486535500528895', 'a', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('35', '951486535500528895', 'f', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('36', '961486535500528895', 'sf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('37', '971486535501528895', 'a', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('38', '981486535501528895', 'df', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('39', '991486535501528895', 'sf', '24', 'wait_pay', '1486533567', '0');
INSERT INTO `order` VALUES ('40', '1001486535501528895', 'saf', '24', 'wait_pay', '1486533567', '0');
