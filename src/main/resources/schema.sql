CREATE TABLE "accounts" (
    owner VARCHAR(100) NOT NULL PRIMARY KEY,
    balance DECIMAL(19,4) NOT NULL
);

INSERT INTO "accounts" VALUES ('Jana', 11000.00);
INSERT INTO "accounts" VALUES ('Manne', 10000.00);