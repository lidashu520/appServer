/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : vuetest

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-18 17:03:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for proxy_account_info
-- ----------------------------
DROP TABLE IF EXISTS `proxy_account_info`;
CREATE TABLE `proxy_account_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `proxy_id` int(11) DEFAULT NULL COMMENT '代理id',
  `name` varchar(64) DEFAULT NULL COMMENT '代理真实姓名',
  `wechat_account` varchar(64) DEFAULT NULL COMMENT '微信号',
  `alipay_account` varchar(64) DEFAULT NULL COMMENT '支付宝帐号',
  `bank_account` varchar(64) DEFAULT NULL COMMENT '银行卡号',
  `bank_name` varchar(128) DEFAULT NULL COMMENT '开户行名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=162 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of proxy_account_info
-- ----------------------------
INSERT INTO `proxy_account_info` VALUES ('1', '100490', '焦永涛1', 'QQ723719531', '15860406668', '6222033100010549767', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('2', '100161', '丁前龙2', 'dd753023105', '17726297577', '6222033100006319522', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('3', '100999', '王龙3', '18983018304', '18983018304', '6222023100063851955', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('4', '100816', '吴永浪', '18586320684', '18586320684', '6217997030014472654', '中国邮政储蓄银行');
INSERT INTO `proxy_account_info` VALUES ('5', '100855', '吴星', 'wx719978933', '18687776289', '6228482878614616974', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('6', '100855', '吴星', 'wx719978933', '18687776289', '6228482878614616974', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('8', '100520', '张雨', 'wxqp8888999', '', '6212264402033702154', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('9', '100520', '张雨', 'wxqp8888999', '', '6212264402033702154', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('11', '100351', '张恒', 'ahqp999', '13883641191', '6217996900059967639', '中国邮政储蓄银行');
INSERT INTO `proxy_account_info` VALUES ('12', '100154', '晏新', 'xinxin025238', '13594392543', '4367423762171878872', '中国建设银行重庆市分行观音桥支行');
INSERT INTO `proxy_account_info` VALUES ('13', '100154', '晏新', 'xinxin025238', '13594392543', '4367423762171878872', '中国建设银行重庆市分行观音桥支行');
INSERT INTO `proxy_account_info` VALUES ('15', '100999', '王龙4', '18983018304', '18983018304', '6222023100063851955', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('16', '101153', '王盛宝', 'C3221835772', '', '6217003690003006870', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('17', '101162', '张建', 'cqsydlw', '296358331@qq.com', '6230200170494392', '华夏银行重庆两江支行');
INSERT INTO `proxy_account_info` VALUES ('18', '101222', '解飞', '809694540', '18702905948', '6214850296220707', '招商银行');
INSERT INTO `proxy_account_info` VALUES ('19', '101306', '刘斌', 'liubin13022187736', '13022187736', '6228480038752506675', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('20', '101355', '郝西卫', '', '', '6228481258574702273', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('21', '100724', '李季阳', 'LF172976472', '15291780138', '6217997900048570030', '李季阳');
INSERT INTO `proxy_account_info` VALUES ('22', '100186', '郑丹5', '', '', '6212263100037974388', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('23', '100187', '郑丹6', '', '', '6212263100037974388', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('24', '100187', '郑丹7', '', '', '6212263100037974388', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('25', '101090', '李文思', 'B635458051', '18735300375', '6212260503001626913', '阳泉市二矿支行');
INSERT INTO `proxy_account_info` VALUES ('26', '100624', '张啟勇', '849433714', '15183438181', '6217003710002016330', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('27', '101616', '高楠', 'gn13109535632', '15319440335', '6228480218692880477', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('28', '101616', '高楠', 'gn13109535632', '15319440335', '6228480218692880477', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('29', '101771', '夏飞', 'xiafei13880072907', '13880072907', '6228480469610641372', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('30', '101297', '姚贵海', 'jie34065060', '15825985305', '6212263100036522949', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('31', '101297', '姚贵海8', '', '15825985305', '6212 2631 0003 6522 949', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('32', '100473', '杨洋', '', '', '6228480478690242878', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('33', '101380', '况敏', 'k864429760', '15223308162', '6214830236211172', '况敏');
INSERT INTO `proxy_account_info` VALUES ('34', '100645', '庞政满9', '15100355513', '15100355513', '6217000190011224345', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('35', '100140', '艾欣明10', 'as48820623', '13101255612', '6222023100055064997', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('36', '100573', '宫宏磊11', 'wxid_tmsgreuunzh112', '18955555512', '6230942190000122348', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('37', '102052', '陈鹏博12', 'w52cssss', '13666270532', '6212264402061286732', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('38', '101293', '吴静', 'love449716117', '86268974@qq.com', '6228480478455344372', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('39', '101750', '袁钢', '', '17783000095', '6228480470710541819', '农村商业银行');
INSERT INTO `proxy_account_info` VALUES ('40', '101750', '袁钢', '', '17783000095', '6228480470710541819', '农村商业银行');
INSERT INTO `proxy_account_info` VALUES ('41', '100449', '刘成杰13', 'qqqq06', '15953244038', '6227002394630381273', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('42', '102154', '朱丽', 'ZL19852', '13281850081', '6228480461389109616', '犀浦支行');
INSERT INTO `proxy_account_info` VALUES ('43', '101769', '刘凯云14', '', '', '6212261001002858758', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('44', '102178', '郗杰', 'xi342334018', '14729195110', '6217997900061540829', '邮政');
INSERT INTO `proxy_account_info` VALUES ('45', '100144', '蒋杰庆', '15178772654', '15178772654', '6214830233419869', '招商银行');
INSERT INTO `proxy_account_info` VALUES ('46', '102281', '易磊', '15043163662', '15043163662', '6217002920109978024', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('47', '101582', '尹学文', '502576003', '15834310303', '6228481678385413879', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('48', '102211', '蒋晶晶', 'jing2439511131', '18709965555', '6210814560001305778', '建行');
INSERT INTO `proxy_account_info` VALUES ('49', '101952', '李钢15', '', '', '6212261302018173400', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('50', '100398', '王新', 'daye124', '446750775@qq.com', '6228412870284491114', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('51', '100271', '杨光茂', 'hbxyk88888', '982782888@qq.com', '6214830156805383', '招商银行');
INSERT INTO `proxy_account_info` VALUES ('52', '102521', '刘华', '17507518011', '', '6222624420000706184', '交通银行');
INSERT INTO `proxy_account_info` VALUES ('53', '101999', '谭求古16', '18373459201', '18373459201', '6217002950110630264', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('54', '102544', '张俊林', 'lxt19930821', '18375813186', '6216613200019934562', '中国银行');
INSERT INTO `proxy_account_info` VALUES ('55', '100840', '王林燕', '', '', '6216613600009590680', '中国银行');
INSERT INTO `proxy_account_info` VALUES ('56', '100146', '周俊成', '15960834329', '13036326669', '6217930974246625', '浦发银行');
INSERT INTO `proxy_account_info` VALUES ('57', '100566', '朱祥晔', 'sbleesin', '976529553@qq.com', '6236681480001824121', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('58', '100440', '尹应仓', 'yincang753951', '15058279818', '6217993300011346480', '中国邮政储蓄银行');
INSERT INTO `proxy_account_info` VALUES ('59', '100760', '刘奇17', '', '', '6222084402005100152', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('60', '100147', '刘凤明', '', '18523508452', '6222033100003039404', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('61', '101377', '杨龙', 'uoooor1688', '15805492602', '6228481829038414372', '农行');
INSERT INTO `proxy_account_info` VALUES ('62', '100899', '陈起阳', '', '', '6228480938738219378', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('63', '100156', '张施宇', 'lux5627284', '13368307688', '18837477437383838', '打家劫舍');
INSERT INTO `proxy_account_info` VALUES ('64', '102334', '荆大伟18', 'jdw918621', '15513617245', '6217000270001033755', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('65', '101839', '王伟仲19', 'lll815776', '15525887199', '6217000360004526341', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('66', '100985', '巫峰', 'wf363537', '17687041311', '6230582000054645208', '平安银行成都市成华支行');
INSERT INTO `proxy_account_info` VALUES ('67', '100164', '李明亮', 'lml955655', '15086681204', '6228480478667598278', '中国农业银行重庆两江分行');
INSERT INTO `proxy_account_info` VALUES ('68', '100164', '李明亮', 'lml955655', '15086681204', '6228480478667598278', '中国农业银行重庆两江分行');
INSERT INTO `proxy_account_info` VALUES ('69', '102274', '刘韩20', '15680633619', '15680633619', '6212264402056021433', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('70', '100459', '何丹', '18328738711', '18328738711', '6212263100038759804', '重庆工商银行渝北支行');
INSERT INTO `proxy_account_info` VALUES ('71', '100183', '余诗淇', '', '', '6212263100035764914', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('72', '101529', '聂德伟', 'WB616127', '13967326544', '6227001432340038758', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('73', '100558', '代之友', '15928814123', '15928814123', '6228480469831985277', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('74', '101403', '曹兴柱', '', '', '62284808680429862373', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('75', '101403', '曹兴柱', '', '', '6228480868042986273', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('76', '102753', '王斐洋', '875869377', '15229332062', '6221887910065226817', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('77', '100778', '张伟21', '', '18583293823', '6212262307002837398', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('78', '100617', '刘其军', '', '', '6217004220013448034', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('79', '100340', '杜越', '', '', '6222033100007032462', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('80', '100205', '刘伟华', '546902804', '17623663352', '6212263100035772495', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('81', '100837', '屈敦运', 'qdy2325306959', '13974769825', '6230520800000532078', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('82', '102819', '郭昌兵', 'G15130920998', '18131953269', '6216615007001367356', '中国银行');
INSERT INTO `proxy_account_info` VALUES ('83', '102819', null, null, null, null, null);
INSERT INTO `proxy_account_info` VALUES ('84', '102819', '郭昌兵', 'G15130920998', '18131953269', '6216615007001367356', '中国银行');
INSERT INTO `proxy_account_info` VALUES ('85', '102877', '李嘉乐', 'daikuan668a', '13113267520', '6214620621003039504', '广东省东莞市沙田支行');
INSERT INTO `proxy_account_info` VALUES ('86', '103067', '杨富勇22', '15198095595', '365984823', '6217003800000973143', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('87', '103067', '杨富勇23', '15198095595', '365984823', '6217003800000973143', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('88', '102330', '孟楠', '13994748031', '13994748031', '6228481308614658975', '中国农业银行晋城市高平分行');
INSERT INTO `proxy_account_info` VALUES ('89', '100158', '陈韬', 'chenvipmoney', '13290022420', '6217930900059902', '浦发银行');
INSERT INTO `proxy_account_info` VALUES ('90', '101663', '张寅超', '15067326359', '15067326359', '623668143000437819', '平湖分行');
INSERT INTO `proxy_account_info` VALUES ('91', '101663', '', '', '', '', '');
INSERT INTO `proxy_account_info` VALUES ('92', '102433', '罗婷', 'lt915279756', '15202866691', '6217931800597058', '浦发银行成都分行营业部');
INSERT INTO `proxy_account_info` VALUES ('93', '101663', '张寅超', '15067326359', '15067326359', '6236681430004376819', '平湖支行');
INSERT INTO `proxy_account_info` VALUES ('94', '100203', '陈柯宇', 'cky971221', '18580242940', '6228480478757705171', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('95', '102358', '焦贤曙', '13487610522', '13487610522', '6212261906000373693', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('96', '100754', '翟国辉24', '15067755215', '15067755215', '6230941420000128164', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('97', '101403', '曹兴柱', '13769149665', '13769149665', '6228480868042986273', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('98', '100171', '王果', 'XNSH6688', '18983002638', '6217930974265518', '浦发银行');
INSERT INTO `proxy_account_info` VALUES ('99', '100166', '邓春香25', 'dcx15086633267', '17623121980', '6212843763960000247', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('100', '102987', '孙斌', 'sunbin900', '13888544394', '6230580000087023458', '孙斌');
INSERT INTO `proxy_account_info` VALUES ('101', '103174', '杨皓淇26', 'yhq13644865470', '17320073970', '6217000450008992100', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('102', '102234', '肖淑娥', 'llf1420318053', '13645959839', '6228480688749140770', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('103', '102234', '肖淑娥', 'llf1420318053', '13645959839', '6228480688749140770', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('104', '100134', '杨雪', 'yang25xue24', '15223078098', '6216613200020271905', '中国银行');
INSERT INTO `proxy_account_info` VALUES ('105', '101908', '李平', '13896968833', '13896968833', '6228480478573475975', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('106', '103092', '赵均', 'BLYX1990', '18664354769', '6216912003653873', '中国民生银行');
INSERT INTO `proxy_account_info` VALUES ('107', '101896', '王文瑞', 'wwr793151257', '17755638133', '6212261309005635077', '安徽安庆工商银行人民路支行');
INSERT INTO `proxy_account_info` VALUES ('108', '102989', '袁林', '15023107071', '15023107071', '6238683760004758386', '渝北');
INSERT INTO `proxy_account_info` VALUES ('109', '102774', '徐高强', '13752865212', '13752865212', '6217003760117804112', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('110', '100136', '唐德果', '', '', '6222033100005196798', '渝北支行');
INSERT INTO `proxy_account_info` VALUES ('111', '100424', '陈岑', '352034869', '', '6222023100053481359', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('112', '100357', '李慧', 'a799660554', '15540749429', '6228270021223812579', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('113', '100869', '董舒明', 'dsm417057', '17820286410', '6217995800050326994', '中国邮政储蓄银行');
INSERT INTO `proxy_account_info` VALUES ('114', '100149', '唐磊', 'aa593374851', '15683770991', '6222023100089968742', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('115', '103173', '王云鹏27', 'wyp970719', '13389057110', '6217000066007857621', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('116', '101267', '王铜帅', 'w8191550343655', '13521443376', '6228480018745038671', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('117', '100173', '陈岑', '352034869', '', '6222023100053481359', '工行');
INSERT INTO `proxy_account_info` VALUES ('118', '101296', '洪培', '13658884868', '13658884868', '6228483868601904870', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('119', '100874', '关世东', '', '', '6230580000075875786', '平安银行');
INSERT INTO `proxy_account_info` VALUES ('120', '101625', '关世东', '', '', '6230580000075875786', '平安银行');
INSERT INTO `proxy_account_info` VALUES ('121', '100152', '尹超', '', '', '6236683760002260526', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('122', '101786', '张博', 'T13303594454', '15536256111', '6212260511006453522', '运城河东支行');
INSERT INTO `proxy_account_info` VALUES ('123', '101160', '罗统顺28', 'wwwaszx735460904', '17621887395', '6217001210057858522', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('124', '100182', '倪元进', 'lp139420nj', '18223453899', '6215281037821984', '农村商业银行');
INSERT INTO `proxy_account_info` VALUES ('125', '102022', '何中前', '15284834545', '15284834545', '6217996710002501256', '中国邮政银行');
INSERT INTO `proxy_account_info` VALUES ('126', '103351', '周飞', '', '', '6217858100022732536', '中国银行');
INSERT INTO `proxy_account_info` VALUES ('127', '100207', '田野', '', '', '6228480478607948377', '田野');
INSERT INTO `proxy_account_info` VALUES ('128', '101773', '王东', '17780073860', '17780073860', '6214850282311387', '中国招商银行');
INSERT INTO `proxy_account_info` VALUES ('129', '101655', '王越鑫', 'woheipahei', '15527773725', '6212263202002347077', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('130', '100165', '林丽', '1046743260', '13452322542', '6212843764160041189', '建设银行');
INSERT INTO `proxy_account_info` VALUES ('131', '100113', '邓鹏', '493866', '6766', '6222023100073693298', '工商银行渝北支行');
INSERT INTO `proxy_account_info` VALUES ('132', '100113', '邓鹏', '493866', '6766', '6222023100073693298', '工商银行渝北支行');
INSERT INTO `proxy_account_info` VALUES ('133', '100668', '张玉泉', '', '', '6214833612310303', '招商银行太原世贸支行');
INSERT INTO `proxy_account_info` VALUES ('134', '100150', '林冲', '865599291', '13983879975', '6228480478195271679', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('135', '101280', '邱红梅29', 'vellav520', '15115182263', '6212261914003807014', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('136', '101796', '刘荣举', 'cx2270871803', '15857732827', '6228480339423246778', '浙江省温州市鹿城区双屿支行农业银行');
INSERT INTO `proxy_account_info` VALUES ('137', '101007', '张雪30', '', '', '6212262314005670594', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('138', '101637', '袁强', '1960978655', '', '6217996900080887004', '中国邮政储蓄银行');
INSERT INTO `proxy_account_info` VALUES ('139', '101637', '袁强', '1960978655', '', '6217996900080887004', '中国邮政储蓄银行');
INSERT INTO `proxy_account_info` VALUES ('140', '100549', '代之友31', '15928814123', '15928814123', '6212264402045446139', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('141', '100941', '张文波32', 'zal010209', '13038040073', '6212260511011833783', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('142', '101179', '周林东', '498213558', '498213558@qq.com', '6013822000607969683', '中国银行');
INSERT INTO `proxy_account_info` VALUES ('143', '103317', '马振威', 'ma617330268', '17159899998', '6230520460002590275', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('144', '103317', '马振威', 'ma617330268', '17159899998', '6230520460002590275', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('145', '100531', '叶志兵', '1298608825', '15927274361', '6217002870018414704', '世界城光谷支行');
INSERT INTO `proxy_account_info` VALUES ('146', '100937', '夏智慧', '', '', '6230522380010369371', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('147', '100937', '夏智慧', '', '', '6230522380010369371', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('148', '100929', '张文斌', '15227822226', '15227822226', '6212260402004671333', '工商');
INSERT INTO `proxy_account_info` VALUES ('149', '100030', '汪涛', '', '', '622203100065718848', '工商银行');
INSERT INTO `proxy_account_info` VALUES ('150', '100128', '陈强', '', '', '6228480471076666216', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('151', '103655', '冯桂彬', '18553721799', '', '6228481338133127178', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('152', '103655', '冯桂彬', '18553721799', '18553721799', '6228481338133127178', '中国农业银行');
INSERT INTO `proxy_account_info` VALUES ('153', '101585', '丁海波', 'dhb457194834', '18784899198', '621226231700940366', '中国工商银行开江支行');
INSERT INTO `proxy_account_info` VALUES ('154', '100782', '王春磊', 'lei145185', '', '6212263100017442950', '重庆市渝北金港之行');
INSERT INTO `proxy_account_info` VALUES ('155', '101499', '张从忠', 'zzl051717zh', 'zzl16888vip@163.com', '6222620510016808620', '中国交通银行重庆南岸支行');
INSERT INTO `proxy_account_info` VALUES ('156', '103759', '朱铁强', '798102287', '17737117010', '6228482058356916177', '农业银行');
INSERT INTO `proxy_account_info` VALUES ('157', '102057', '梁壮33', 'liangzhuang470034786', '470034786@qq.com', '6217230511000662827', '中国工商银行');
INSERT INTO `proxy_account_info` VALUES ('158', '102950', '倪元鑫', 'nyx1031735545', '18723180463', '6210986530024296306', '中国邮政银行');
INSERT INTO `proxy_account_info` VALUES ('159', '100028', '汪涛', '', '', '622202310065718848', '工商');
INSERT INTO `proxy_account_info` VALUES ('160', '100181', '熊艳', '1552378118', '15223358587', '6217903200006587925', '龙兴分行');
INSERT INTO `proxy_account_info` VALUES ('161', '100060', '代光耀', '', '', '6214830237474209', '招商银行');
