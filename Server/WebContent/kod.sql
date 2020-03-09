BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "kod" (
	"id"	INTEGER PRIMARY KEY AUTOINCREMENT,
	"name"	TEXT,
	"path"	TEXT
);
INSERT INTO "kod" VALUES (1,'001','http://192.168.0.59:8085/NaszServer/index.html');
INSERT INTO "kod" VALUES (2,'002','http://192.168.0.59:8085/NaszServer/index1.html');
INSERT INTO "kod" VALUES (3,'003','http://192.168.0.59:8085/NaszServer/index2.html');
INSERT INTO "kod" VALUES (4,'004','http://192.168.0.59:8085/NaszServer/index3.html');
INSERT INTO "kod" VALUES (5,'005','http://192.168.0.59:8085/NaszServer/index4.html');
COMMIT;
