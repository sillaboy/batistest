/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : cri_eye_gene

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2016-11-14 15:35:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbadmin
-- ----------------------------
DROP TABLE IF EXISTS `tbadmin`;
CREATE TABLE `tbadmin` (
  `userid` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `keyword` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbconsum
-- ----------------------------
DROP TABLE IF EXISTS `tbconsum`;
CREATE TABLE `tbconsum` (
  `consum_id` int(10) NOT NULL,
  `consum_name` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`consum_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbcoupon
-- ----------------------------
DROP TABLE IF EXISTS `tbcoupon`;
CREATE TABLE `tbcoupon` (
  `userid` int(11) NOT NULL,
  `couponid` int(10) NOT NULL,
  `coupon_instruc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `coupon_value` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbdetail
-- ----------------------------
DROP TABLE IF EXISTS `tbdetail`;
CREATE TABLE `tbdetail` (
  `detid` int(11) NOT NULL AUTO_INCREMENT,
  `orderid` char(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_name` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_num` int(4) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`detid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tborder
-- ----------------------------
DROP TABLE IF EXISTS `tborder`;
CREATE TABLE `tborder` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `orderid` char(12) COLLATE utf8_unicode_ci NOT NULL COMMENT '订单id',
  `userid` int(10) NOT NULL COMMENT '用户id',
  `ordername` char(60) COLLATE utf8_unicode_ci NOT NULL,
  `reportid` int(10) DEFAULT NULL COMMENT '报告id',
  `start_date` datetime DEFAULT NULL COMMENT '订单开始时间',
  `finish_date` datetime DEFAULT NULL COMMENT '订单结束时间',
  `receiver_name` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收货人姓名',
  `receiver_address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收货人地址',
  `postcode` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收货人邮编',
  `post_phonenum` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收货人电话',
  `trackcode` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '检验号码',
  `send_waybill` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '发货人地址',
  `receive_waybill` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收货人地址',
  `payvalue` int(11) DEFAULT NULL COMMENT '总价格',
  `extrainfo` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '额外信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tborderdyna
-- ----------------------------
DROP TABLE IF EXISTS `tborderdyna`;
CREATE TABLE `tborderdyna` (
  `orderid` char(12) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(2) DEFAULT NULL,
  `abStatus` int(2) DEFAULT NULL,
  `creatdate` datetime DEFAULT NULL,
  `paydate` datetime DEFAULT NULL,
  `sampledate` datetime DEFAULT NULL,
  `senddate` datetime DEFAULT NULL,
  `confirmdate` datetime DEFAULT NULL,
  `receivedate` datetime DEFAULT NULL,
  `reportdate` datetime DEFAULT NULL,
  `reportsenddate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbproduct
-- ----------------------------
DROP TABLE IF EXISTS `tbproduct`;
CREATE TABLE `tbproduct` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `cat` int(10) DEFAULT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbrefund
-- ----------------------------
DROP TABLE IF EXISTS `tbrefund`;
CREATE TABLE `tbrefund` (
  `orderid` char(12) COLLATE utf8_unicode_ci NOT NULL,
  `refund_time` datetime DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbreport
-- ----------------------------
DROP TABLE IF EXISTS `tbreport`;
CREATE TABLE `tbreport` (
  `orderid` char(12) COLLATE utf8_unicode_ci NOT NULL,
  `rname` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `provice` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `lefteye` char(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `righteye` char(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `anaphylactogen` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '过敏源',
  `heredity_history` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diseas_history` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `report_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tbuser
-- ----------------------------
DROP TABLE IF EXISTS `tbuser`;
CREATE TABLE `tbuser` (
  `userid` int(20) NOT NULL AUTO_INCREMENT,
  `phone_num` varchar(13) COLLATE utf8_unicode_ci DEFAULT NULL,
  `openid` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tb_count
-- ----------------------------
DROP TABLE IF EXISTS `tb_count`;
CREATE TABLE `tb_count` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `page_n` varchar(32) DEFAULT NULL COMMENT 'page页面识别码',
  `touch_time` int(11) DEFAULT NULL COMMENT '点击次数',
  `choose` varchar(32) DEFAULT NULL COMMENT '选择按钮识别码',
  `udid` varchar(64) DEFAULT NULL COMMENT '用户识别码',
  `creat_time` datetime DEFAULT NULL COMMENT '点击时间',
  `ip` varchar(64) DEFAULT NULL COMMENT '请求ip地址',
  `address` varchar(64) DEFAULT NULL COMMENT '请求地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_prize
-- ----------------------------
DROP TABLE IF EXISTS `tb_prize`;
CREATE TABLE `tb_prize` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `active_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prize_type` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prize_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prize_count` int(11) DEFAULT NULL,
  `prize_probility` int(11) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tb_winner
-- ----------------------------
DROP TABLE IF EXISTS `tb_winner`;
CREATE TABLE `tb_winner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone_num` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `openid` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `win_time` datetime DEFAULT NULL,
  `prize_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `win_info` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `win_times` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
