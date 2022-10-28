/*
 Navicat Premium Data Transfer

 Source Server         : docker
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : 127.0.0.1:3306
 Source Schema         : monitoring-management

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 28/10/2022 19:58:16
*/


-- ----------------------------
-- Records of monitor_car
-- ----------------------------
INSERT INTO `monitor_car` VALUES ('001', '0', '发射车001', 'LaunchCar001', 'https://video-dev.github.io/streams/x36xhzz/x36xhzz.m3u8', 'https://video-dev.github.io/streams/x36xhzz/x36xhzz.m3u8', 'https://video-dev.github.io/streams/x36xhzz/x36xhzz.m3u8', 'https://video-dev.github.io/streams/x36xhzz/x36xhzz.m3u8', 'https://video-dev.github.io/streams/x36xhzz/x36xhzz.m3u8', 'https://video-dev.github.io/streams/x36xhzz/x36xhzz.m3u8');


-- ----------------------------
-- Records of monitor_equipment
-- ----------------------------
INSERT INTO `monitor_equipment` VALUES ('001', '0', '配电系统', 'DistributionSystem', NULL, 0, 1);
INSERT INTO `monitor_equipment` VALUES ('001-001', '0', '智能配电箱', 'IntelligentDistributionBox', '001', 1, 1);
INSERT INTO `monitor_equipment` VALUES ('001-002', '0', '动力配电箱', 'PowerDistributionBox', '001', 1, 2);
INSERT INTO `monitor_equipment` VALUES ('001-003', '0', '柴油发动机', 'DieselEngine', '001', 1, 3);
INSERT INTO `monitor_equipment` VALUES ('001-004', '0', '动力电池组', 'PowerBatteryPack', '001', 1, 4);
INSERT INTO `monitor_equipment` VALUES ('002', '0', '发射系统', 'LaunchSystem', NULL, 0, 2);
INSERT INTO `monitor_equipment` VALUES ('002-001', '0', '弹载计算机', 'MissileBorneComputer', '002', 1, 1);
INSERT INTO `monitor_equipment` VALUES ('002-002', '0', '弹上设备', 'BombOnEquipment', '002', 1, 2);
INSERT INTO `monitor_equipment` VALUES ('002-003', '0', '发射控制箱', 'LaunchControlBox', '002', 1, 3);
INSERT INTO `monitor_equipment` VALUES ('002-004', '0', '北斗/GPS', 'Beidou/GPS', '002', 1, 4);
INSERT INTO `monitor_equipment` VALUES ('002-005', '0', '捷联惯导设备', 'StrapdownInertialEquipment', '002', 1, 5);
INSERT INTO `monitor_equipment` VALUES ('003', '0', '操瞄系统', 'OperationAimingSystem', NULL, 0, 3);
INSERT INTO `monitor_equipment` VALUES ('003-001', '0', '安全联锁', 'SafetyInterlock', '003', 1, 1);
INSERT INTO `monitor_equipment` VALUES ('003-002', '0', '高低方向驱动器', 'HighAndLowDirectionDriver', '003', 1, 2);
INSERT INTO `monitor_equipment` VALUES ('003-003', '0', '高低方位传感器', 'HighAndLowOrientationSensor', '003', 1, 3);
INSERT INTO `monitor_equipment` VALUES ('004', '0', '控制系统', 'ControlSystem', NULL, 0, 4);
INSERT INTO `monitor_equipment` VALUES ('004-001', '0', '左电插接作动器', 'LeftElectricPlugActuator', '004', 1, 1);
INSERT INTO `monitor_equipment` VALUES ('004-002', '0', '右电插接作动器', 'RightElectricPlugActuator', '004', 1, 2);
INSERT INTO `monitor_equipment` VALUES ('004-003', '0', '行军固定器作动器', 'MarchRetainerActuator', '004', 1, 3);
INSERT INTO `monitor_equipment` VALUES ('004-004', '0', '左锁箱控制器', 'LeftLockingBoxController', '004', 1, 4);
INSERT INTO `monitor_equipment` VALUES ('004-005', '0', '右锁箱控制器', 'RightLockingBoxController', '004', 1, 5);
INSERT INTO `monitor_equipment` VALUES ('004-006', '0', '尾门作动器', 'TailDoorActuator', '004', 1, 6);
INSERT INTO `monitor_equipment` VALUES ('005', '0', '监控系统', 'MonitoringSystem', NULL, 0, 5);
INSERT INTO `monitor_equipment` VALUES ('005-001', '0', '空调传感器', 'AirConditioningSensor', '005', 1, 1);
INSERT INTO `monitor_equipment` VALUES ('005-002', '0', '温度传感器', 'TemperatureSensor', '005', 1, 2);
INSERT INTO `monitor_equipment` VALUES ('005-003', '0', '湿度传感器', 'HumiditySensor', '005', 1, 3);
INSERT INTO `monitor_equipment` VALUES ('005-004', '0', '摄像信息', 'CameraInformation', '005', 1, 4);
INSERT INTO `monitor_equipment` VALUES ('006', '0', '中心控制器系统', 'CentralControllerSystem', NULL, 0, 6);
INSERT INTO `monitor_equipment` VALUES ('006-001', '0', '平台中心控制器', 'PlatformCenterController', '006', 1, 1);
INSERT INTO `monitor_equipment` VALUES ('006-002', '0', '智能CAN网关', 'IntelligentCANGateway', '006', 1, 2);
INSERT INTO `monitor_equipment` VALUES ('006-003', '0', '以太网交换机', 'EthernetSwitch', '006', 1, 3);

-- ----------------------------
-- Records of monitor_equipment_status
-- ----------------------------
INSERT INTO `monitor_equipment_status` VALUES ('001', '001', '001-001', '1', '0', '2022-10-27 01:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('002', '001', '001-002', '2', '1', '2022-10-27 02:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('003', '001', '001-003', '1', '1', '2022-10-27 03:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('004', '001', '001-004', '1', '1', '2022-10-27 04:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('005', '001', '002-001', '0', '1', '2022-10-27 05:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('006', '001', '002-002', '1', '0', '2022-10-27 06:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('007', '001', '002-003', '0', '1', '2022-10-27 07:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('008', '001', '002-004', '1', '1', '2022-10-27 08:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('009', '001', '002-005', '2', '1', '2022-10-27 09:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('010', '001', '003-001', '1', '0', '2022-10-27 10:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('011', '001', '003-002', '1', '1', '2022-10-27 11:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('012', '001', '003-003', '0', '1', '2022-10-27 12:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('013', '001', '004-001', '2', '1', '2022-10-27 13:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('014', '001', '004-002', '1', '1', '2022-10-27 14:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('015', '001', '004-003', '1', '1', '2022-10-27 15:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('016', '001', '004-004', '0', '0', '2022-10-27 16:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('017', '001', '004-005', '1', '1', '2022-10-27 17:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('018', '001', '004-006', '0', '1', '2022-10-27 18:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('019', '001', '005-001', '1', '1', '2022-10-27 19:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('020', '001', '005-002', '2', '0', '2022-10-27 20:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('021', '001', '005-003', '0', '1', '2022-10-27 21:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('022', '001', '005-004', '1', '1', '2022-10-27 22:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('023', '001', '006-001', '0', '1', '2022-10-27 23:02:37');
INSERT INTO `monitor_equipment_status` VALUES ('024', '001', '006-002', '1', '1', '2022-10-27 23:10:37');
INSERT INTO `monitor_equipment_status` VALUES ('025', '001', '006-003', '1', '1', '2022-10-27 23:30:37');


-- ----------------------------
-- Records of monitor_launcher
-- ----------------------------
INSERT INTO `monitor_launcher` VALUES ('001', '001', '1', '1', '0', '1', '1', '2');
INSERT INTO `monitor_launcher` VALUES ('002', '001', '2', '0', '1', '1', '1', '0');

