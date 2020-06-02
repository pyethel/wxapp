insert into category (category_id, category_name) values (1, '电器');
insert into category (category_id, category_name) values (2, '运动');
insert into category (category_id, category_name) values (3, '女装');
insert into category (category_id, category_name) values (4, '家具');

insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 1, '小米电视E65A全面屏65英寸4k高清液晶屏家用平板家用电视机官方', 4000, 'http://192.168.101.8:8080/images/1.jpg', '/pages/goods_detail/goods_detail?goodsId=1', 1);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 2, '赛米控嵌入式蒸烤箱家用二合一电蒸箱大容量内嵌式蒸烤一体机60升', 3100, 'http://192.168.101.8:8080/images/2.jpg', '/pages/goods_detail/goods_detail?goodsId=2', 1);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 3, '美的电风扇落地扇家用立式静音台式电扇台扇大风节能宿舍摇头卧室', 140, 'http://192.168.101.8:8080/images/3.jpg', '/pages/goods_detail/goods_detail?goodsId=3', 1);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 4, '户外登山包双肩男女款多功能大容量旅游旅行背包40升50L60L', 229, 'http://192.168.101.8:8080/images/4.jpg', '/pages/goods_detail/goods_detail?goodsId=4', 2);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 5, '5级防切割手套杀鱼防割防扎手套劳保手套拉钢筋超强耐磨手套包邮', 10, 'http://192.168.101.8:8080/images/5.jpg', '/pages/goods_detail/goods_detail?goodsId=5', 2);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 6, '男鞋夏季透气薄款运动鞋男官网旗舰正品20新款鞋子网面跑步鞋', 300, 'http://192.168.101.8:8080/images/6.jpg', '/pages/goods_detail/goods_detail?goodsId=6', 2);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 7, '户外品牌冲锋衣男女防水衣爬山衣服女妈妈冲锋衣大码春秋登山服', 200, 'http://192.168.101.8:8080/images/7.jpg', '/pages/goods_detail/goods_detail?goodsId=7', 2);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 8, '春装', 310, 'http://192.168.101.8:8080/images/8.jpg', '/pages/goods_detail/goods_detail?goodsId=8', 3);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 9, '夏装', 130, 'http://192.168.101.8:8080/images/9.jpg', '/pages/goods_detail/goods_detail?goodsId=9', 3);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 10, '秋装', 199, 'http://192.168.101.8:8080/images/10.jpg', '/pages/goods_detail/goods_detail?goodsId=10', 3);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 11, '冬装', 220, 'http://192.168.101.8:8080/images/11.jpg', '/pages/goods_detail/goods_detail?goodsId=11', 3);
insert into goods (goods_id, goods_name, goods_price, goods_image_src, goods_navigator_url, goods_category_id) values ( 12, '简约办公椅电脑椅家用学生职员会议椅弓形网椅麻将宿舍靠背座椅子', 45, 'http://192.168.101.8:8080/images/12.jpg', '/pages/goods_detail/goods_detail?goodsId=12', 4);

-- insert into user(open_id, nick_name, gender, language, city, province, country, avatar_url, token) values ( 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', 'lehteypzzz',1,'zh_CN','Wuxi','Jiangsu','China','https://wx.qlogo.cn/mmopen/vi_32/gFsre4I5gorOeMwV16X0dV0Uam3yz8lvFQkx7GECbpz2QGzfqp5mibw3GBA5tLOPuUdicWIpa2VTDsIpeFdD0hJw/132','38721c0c-45e3-4fee-be0d-cb4987bd85ac' );

insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 1, 998, '2020-05-21 11:23:48', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 2);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 2, 298, '2020-05-22 12:33:17', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 2);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 3, 88, '2020-05-23 13:24:45', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 2);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 4, 18, '2020-05-24 14:53:15', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 3);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 5, 948, '2020-05-26 21:26:35', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 3);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 6, 9000, '2020-05-26 23:28:25', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 4);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 7, 13000, '2020-05-28 11:34:25', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 4);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 8, 12400, '2020-05-29 06:29:19', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 4);
insert into order1(order_id, order_price, create_time, user_id, address, order_state) VALUES ( 9, 24000, '2020-05-30 08:20:45', 'oWYht5c21cH1BXcgIWcNSvt5YBBQ', '广东省广州市海珠区新港中路397号', 4);
