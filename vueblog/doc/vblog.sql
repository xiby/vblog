/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50730
Source Host           : 127.0.0.1:3306
Source Database       : vblog

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2021-02-15 18:08:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_artag
-- ----------------------------
DROP TABLE IF EXISTS `t_artag`;
CREATE TABLE `t_artag` (
  `id` bigint(64) unsigned NOT NULL AUTO_INCREMENT,
  `articalid` bigint(64) NOT NULL,
  `tagid` bigint(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_artical
-- ----------------------------
DROP TABLE IF EXISTS `t_artical`;
CREATE TABLE `t_artical` (
  `id` bigint(64) unsigned NOT NULL AUTO_INCREMENT,
  `user` bigint(64) NOT NULL,
  `title` varchar(255) NOT NULL DEFAULT '',
  `summary` varchar(255) DEFAULT NULL,
  `content` text,
  `liked` int(32) unsigned  DEFAULT '0',
  `createtime` datetime(6) DEFAULT NULL,
  `lastedit` datetime(6) DEFAULT NULL,
  `deleted` varchar(5) DEFAULT 'N',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_notes
-- ----------------------------
DROP TABLE IF EXISTS `t_notes`;
CREATE TABLE `t_notes` (
  `id` bigint(64) unsigned NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) DEFAULT NULL,
  `committime` datetime DEFAULT NULL,
  `readed` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE `t_tag` (
  `id` bigint(64) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `priority` int(32) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(64) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `lastlogin` datetime(6) DEFAULT NULL,
  `liked` bigint(64) NOT NULL DEFAULT '0',
  `token` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
