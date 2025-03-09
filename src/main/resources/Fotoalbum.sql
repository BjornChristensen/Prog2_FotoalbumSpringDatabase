CREATE DATABASE  IF NOT EXISTS `fotoalbum`;
USE `fotoalbum`;

DROP TABLE IF EXISTS `foto`;
CREATE TABLE `foto` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` longtext,
  `imageFileName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `foto` WRITE;
INSERT INTO foto VALUES (1, 'Brooklyn_Bridge', 'Brooklyn Bridge er en af tre broer, som binder bydelene Manhattan og Brooklyn i New York sammen. Den strækker sig 1834 meter over East River. Hovedspændet over selve vandet er 486 meter, noget som gjorde den til verdens længste hængebro, da den stod færdig i 1883. Wikipedia', 'img/Brooklyn_Bridge.jpg');
INSERT INTO foto VALUES (2, 'GoldenGate', 'Golden Gate-broen er en hængebro, der spænder over Golden Gate-udmundingen af San Francisco-bugten i Stillehavet. Den forbinder San Francisco på den nordlige spids af San Francisco-halvøen med Marin County, som en del af U.S. Highway 101 og California State Highway 1. Wikipedia', 'img/GoldenGate.jpg');
INSERT INTO foto VALUES (3, 'Rialto', 'Rialtobroen er den ældste af de fire broer over Canal Grande i Venedig i Italien. Wikipedia', 'img/Rialto.jpg');
INSERT INTO foto VALUES (4, 'Tower', 'Tower Bridge er en bro i London, som fører over floden Themsen. Den blev åbnet i 1894. Broen er en dobbelt klapbro, hvis hejseværk oprindeligt var drevet af dampmaskiner, men nu er elektriske. Broen har et sydtårn og et nordtårn, der er udformet i stil med Tower of London, som ligger lige ved siden af. Wikipedia', 'img/Tower.jpg');
UNLOCK TABLES;

