package com.example.vesprada.ruletastats;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 15;
    private static final String DATABASE_NAME = "NoAzar.db";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE_RULETA = "CREATE TABLE " + Ruleta.TABLE + "("
                + Ruleta.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Ruleta.KEY_NOMBRE + " TEXT, "
                + Ruleta.KEY_ELECTRICA + " INTEGER)";

        db.execSQL(CREATE_TABLE_RULETA);

        String insertRuletas = "";
        insertRuletas = "INSERT INTO Ruleta VALUES(1,'Ar1',0)";db.execSQL(insertRuletas);
        insertRuletas = "INSERT INTO Ruleta VALUES(2,'Ar2',0)";db.execSQL(insertRuletas);

        String CREATE_TABLE_CRUPIER = "CREATE TABLE " + Crupier.TABLE + "("
                + Crupier.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Crupier.KEY_NOMBRE + " TEXT, "
                + Crupier.KEY_DESCRIPCION + " TEXT)";

        db.execSQL(CREATE_TABLE_CRUPIER);

        String insertCrupiers = "";
        insertCrupiers = "INSERT INTO Crupier VALUES(1,'Angélica','Bajita simpática morena pechugona')"; db.execSQL(insertCrupiers);
        insertCrupiers = "INSERT INTO Crupier VALUES(2,'Mariquilla','El que parece mariquilla')"; db.execSQL(insertCrupiers);
        insertCrupiers = "INSERT INTO Crupier VALUES(4,'Pelo rosa','Rubia con medio pelo rosa')"; db.execSQL(insertCrupiers);
        insertCrupiers = "INSERT INTO Crupier VALUES(5,'Irene','<3')"; db.execSQL(insertCrupiers);
        insertCrupiers = "INSERT INTO Crupier VALUES(6,'Argentina','La chica que habla guacamayo')"; db.execSQL(insertCrupiers);



        String CREATE_TABLE_TIRADA = "CREATE TABLE " + Tirada.TABLE + "("
                + Tirada.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Tirada.KEY_ID_CRUPIER + " INTEGER, "
                + Tirada.KEY_ID_RULETA + " INTEGER, "
                + Tirada.KEY_NUMERO + " INTEGER, "
                + "FOREIGN KEY (" + Tirada.KEY_ID_CRUPIER + ") REFERENCES " + Crupier.TABLE + "(" + Tirada.KEY_ID_CRUPIER + ")"
                + "FOREIGN KEY (" + Tirada.KEY_ID_RULETA + ") REFERENCES " + Ruleta.TABLE + "(" + Tirada.KEY_ID_RULETA + "))";

        db.execSQL(CREATE_TABLE_TIRADA);

        String insertTiradas = "";
        insertTiradas = "INSERT INTO Tirada VALUES(1,1,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(2,1,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(3,1,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(4,1,1,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(5,1,1,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(6,1,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(7,1,1,15)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(8,1,1,0)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(9,1,1,26)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(10,1,1,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(11,1,1,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(12,2,1,35)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(13,2,1,7)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(14,2,1,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(15,2,1,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(16,2,1,2)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(17,2,1,30)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(18,2,1,35)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(19,2,1,16)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(20,2,1,11)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(21,2,1,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(22,2,1,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(23,2,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(24,2,1,13)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(25,4,1,0)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(26,4,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(27,4,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(28,NULL,1,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(29,NULL,1,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(30,NULL,1,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(31,NULL,1,26)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(32,NULL,1,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(33,NULL,1,2)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(34,NULL,1,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(35,NULL,1,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(36,NULL,1,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(37,NULL,1,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(38,NULL,1,15)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(39,NULL,1,19)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(40,NULL,1,17)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(41,NULL,1,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(42,NULL,1,13)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(43,4,1,6)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(44,NULL,2,1)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(45,NULL,2,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(46,NULL,2,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(47,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(48,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(49,NULL,2,21)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(50,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(51,NULL,2,1)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(52,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(53,NULL,2,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(54,NULL,2,30)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(55,NULL,2,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(56,NULL,2,6)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(57,NULL,2,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(58,NULL,2,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(59,NULL,2,19)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(60,NULL,2,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(61,NULL,2,26)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(62,NULL,2,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(63,NULL,1,4)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(64,4,1,35)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(65,NULL,1,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(66,NULL,1,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(67,5,1,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(68,5,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(69,NULL,2,35)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(70,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(71,NULL,2,27)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(72,5,1,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(73,NULL,2,6)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(74,5,1,21)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(75,NULL,2,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(76,5,1,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(77,5,1,27)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(78,NULL,1,26)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(79,NULL,2,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(80,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(81,NULL,1,10)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(82,1,2,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(83,NULL,1,15)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(84,NULL,2,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(85,NULL,2,4)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(86,NULL,1,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(87,NULL,2,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(88,NULL,1,17)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(89,NULL,2,21)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(90,NULL,2,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(91,NULL,1,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(92,NULL,1,0)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(93,NULL,2,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(94,NULL,1,7)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(95,NULL,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(96,NULL,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(97,NULL,1,21)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(98,NULL,2,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(99,NULL,2,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(100,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(101,NULL,2,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(102,NULL,2,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(103,NULL,2,15)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(104,NULL,1,17)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(105,NULL,1,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(106,NULL,1,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(107,NULL,1,10)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(108,NULL,1,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(109,NULL,1,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(110,NULL,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(111,NULL,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(112,NULL,1,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(113,NULL,1,26)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(114,NULL,1,10)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(115,NULL,1,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(116,NULL,1,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(117,NULL,1,34)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(118,NULL,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(119,NULL,1,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(120,NULL,1,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(121,NULL,1,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(122,NULL,1,1)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(123,NULL,1,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(124,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(125,NULL,2,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(126,NULL,2,27)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(127,NULL,2,21)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(128,NULL,2,13)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(129,NULL,2,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(130,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(131,NULL,2,13)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(132,NULL,2,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(133,NULL,2,35)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(134,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(135,NULL,2,16)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(136,NULL,2,27)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(137,NULL,2,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(138,NULL,2,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(139,NULL,2,16)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(140,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(141,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(142,NULL,2,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(143,NULL,1,15)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(144,NULL,2,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(145,NULL,1,26)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(146,NULL,1,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(147,NULL,2,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(148,NULL,1,11)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(149,NULL,1,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(150,NULL,2,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(151,NULL,1,21)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(152,NULL,2,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(153,NULL,2,29)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(154,NULL,1,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(155,NULL,1,15)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(156,NULL,1,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(157,NULL,1,35)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(158,NULL,1,19)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(159,NULL,2,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(160,NULL,2,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(161,NULL,2,29)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(162,NULL,1,34)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(163,NULL,1,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(164,NULL,2,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(165,NULL,1,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(166,NULL,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(167,NULL,1,2)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(168,NULL,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(169,NULL,1,4)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(170,NULL,1,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(171,NULL,1,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(172,NULL,1,19)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(173,NULL,2,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(174,NULL,2,21)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(175,NULL,2,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(176,NULL,2,19)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(177,NULL,2,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(178,NULL,2,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(179,NULL,2,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(180,NULL,2,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(181,NULL,2,29)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(182,NULL,2,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(183,NULL,1,29)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(184,NULL,1,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(185,NULL,1,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(186,NULL,1,16)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(187,NULL,1,6)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(188,1,1,13)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(189,NULL,1,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(190,NULL,2,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(191,NULL,2,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(192,NULL,2,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(193,NULL,2,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(194,NULL,2,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(195,NULL,2,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(196,NULL,2,0)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(197,NULL,2,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(198,NULL,1,7)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(199,NULL,1,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(200,6,1,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(201,6,1,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(202,6,1,35)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(203,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(204,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(205,NULL,2,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(206,NULL,2,11)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(207,NULL,2,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(208,6,1,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(209,6,1,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(210,6,1,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(211,6,1,29)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(212,6,1,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(213,6,1,15)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(214,6,1,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(215,6,1,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(216,6,1,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(217,6,1,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(218,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(219,6,1,10)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(220,6,1,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(221,6,1,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(222,6,1,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(223,6,1,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(224,6,1,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(225,6,1,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(226,6,1,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(227,6,1,1)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(228,NULL,2,7)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(229,NULL,2,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(230,NULL,2,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(231,NULL,2,31)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(232,NULL,2,9)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(233,NULL,2,5)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(234,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(235,NULL,2,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(236,NULL,2,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(237,NULL,2,19)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(238,NULL,1,19)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(239,6,1,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(240,NULL,2,7)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(241,NULL,2,14)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(242,NULL,2,12)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(243,6,1,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(244,6,1,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(245,NULL,2,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(246,6,1,1)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(247,NULL,2,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(248,NULL,2,16)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(249,NULL,2,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(250,NULL,2,27)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(251,NULL,2,24)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(252,NULL,2,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(253,NULL,2,8)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(254,NULL,2,2)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(255,NULL,2,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(256,NULL,2,6)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(257,NULL,2,18)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(258,NULL,2,1)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(259,NULL,2,33)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(260,NULL,2,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(261,NULL,2,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(262,NULL,2,29)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(263,NULL,2,17)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(264,NULL,2,22)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(265,NULL,2,6)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(266,NULL,2,32)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(267,6,1,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(268,6,1,25)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(269,6,1,4)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(270,6,1,10)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(271,6,1,23)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(272,6,1,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(273,6,1,27)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(274,6,1,3)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(275,6,1,17)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(276,6,1,10)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(277,6,1,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(278,6,1,7)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(279,6,1,1)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(280,6,1,36)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(281,6,1,20)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(282,6,1,6)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(283,6,1,29)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(284,6,1,28)";db.execSQL(insertTiradas);
        insertTiradas = "INSERT INTO Tirada VALUES(285,6,1,10)";db.execSQL(insertTiradas);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + Ruleta.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + Crupier.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + Tirada.TABLE);

        onCreate(db);
    }
}
