DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `user_name` varchar(18) default NULL,
  `pass_word` varchar(18) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES ('1', '1', '1');
INSERT INTO user VALUES ('2', '2', '2');
INSERT INTO user VALUES ('3', '3', '3');