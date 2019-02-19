/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.121
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : 192.168.1.121:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 11/02/2019 16:24:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for img
-- ----------------------------
DROP TABLE IF EXISTS `img`;
CREATE TABLE `img`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `path` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of img
-- ----------------------------
INSERT INTO `img` VALUES (2, 'D:\\testimg\\IMG_20160915_150348-1_mh1473923528961.jpg');
INSERT INTO `img` VALUES (3, 'D:\\testimg\\???-17-12-6_2.jpg');

-- ----------------------------
-- Table structure for mybatis
-- ----------------------------
DROP TABLE IF EXISTS `mybatis`;
CREATE TABLE `mybatis`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, 'sjs', '123', NULL);
INSERT INTO `userinfo` VALUES (2, 'lnn', '456', NULL);
INSERT INTO `userinfo` VALUES (7, '??', '789', NULL);
INSERT INTO `userinfo` VALUES (8, 'wang', '212', NULL);
INSERT INTO `userinfo` VALUES (9, '?????', 'js', 'bc2e2881-a3ad-4125-b50c-088ec4e74e25.jpg');
INSERT INTO `userinfo` VALUES (10, 'aaa', 'aa', '3742107e-1090-44ee-8d46-6f5c081512aa.jpg');
INSERT INTO `userinfo` VALUES (11, 'vvvv', ',,,', 'e304ab9a-2bfe-4794-ae2d-fa3bed695f7a.jpg');
INSERT INTO `userinfo` VALUES (12, 'aaa???', 'aa', '69ed9014-b0d2-4582-9eb6-010c73f9b8f7.jpg');
INSERT INTO `userinfo` VALUES (13, 'ninin\'', 'aaaa', '3bdf7ed0-e2f9-4d17-a42f-9c85dbe114bb.jpg');
INSERT INTO `userinfo` VALUES (14, '????????', 'asaas', 'fbc8e1c1-1956-400f-9ea3-6a30bc1703e6.jpg');
INSERT INTO `userinfo` VALUES (15, 'pppp', 'aaa', 'ad443d89-af40-4d9c-812e-10c234d8b387.jpg');
INSERT INTO `userinfo` VALUES (16, '111', '111', '7164576f-f0b1-4d71-ae53-d9e3d2391005.jpg');
INSERT INTO `userinfo` VALUES (17, '???', 'asas', '58cb9be4-ee3a-477a-83d7-ea843899237b.jpg');
INSERT INTO `userinfo` VALUES (18, '222', '222', '3829e9fe-5c5e-4791-9d57-f1f51b04af7b.jpg');
INSERT INTO `userinfo` VALUES (19, '333', '333', '44f41dae-d21f-4af5-a27b-51bb96652177.jpg');
INSERT INTO `userinfo` VALUES (20, '333', '333', '378aea97-fcf1-4cc5-9420-c005c62bf81a.jpg');
INSERT INTO `userinfo` VALUES (21, '555', '555', '4f3bc310-b69b-490d-9d81-339971375522.jpg');
INSERT INTO `userinfo` VALUES (22, '666', '666', '13c6dfe7-3006-409d-a1d2-1a346ef455ff.jpg');
INSERT INTO `userinfo` VALUES (23, '999', '999', '9ff104f7-f724-48aa-b235-c906e663027a.jpg');
INSERT INTO `userinfo` VALUES (24, '121212', '121212', 'b4917ea8-26b3-47f2-8778-92f1c85e1eef.jpg');
INSERT INTO `userinfo` VALUES (25, '121212', '121212', '4932294e-2fa9-4f63-b38f-bc616d4f8f0a.jpg');
INSERT INTO `userinfo` VALUES (26, '131313', '131313', '4b9f3820-18df-4f13-981f-089c295b7f13.jpg');
INSERT INTO `userinfo` VALUES (27, '12121214343434', '11111', '30f9504b-c13e-458b-8843-b382b542b340.jpg');

SET FOREIGN_KEY_CHECKS = 1;
