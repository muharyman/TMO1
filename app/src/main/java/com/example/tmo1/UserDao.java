package com.example.tmo1;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM tUser")
    List<User> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertUser(User user);
    
    @Query("SELECT * FROM tUser WHERE namaLengkap = :name")
    User getUserByNama(String name);

    @Query("SELECT SUM(terminal1) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal1(String pekerjaan);

    @Query("SELECT SUM(terminal2) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal2(String pekerjaan);

    @Query("SELECT SUM(terminal3) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal3(String pekerjaan);

    @Query("SELECT SUM(terminal4) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal4(String pekerjaan);

    @Query("SELECT SUM(terminal5) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal5(String pekerjaan);

    @Query("SELECT SUM(terminal6) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal6(String pekerjaan);

    @Query("SELECT SUM(terminal7) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal7(String pekerjaan);

    @Query("SELECT SUM(terminal8) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal8(String pekerjaan);

    @Query("SELECT SUM(terminal9) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal9(String pekerjaan);

    @Query("SELECT SUM(terminal10) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal10(String pekerjaan);

    @Query("SELECT SUM(terminal11) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal11(String pekerjaan);

    @Query("SELECT SUM(terminal12) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal12(String pekerjaan);

    @Query("SELECT SUM(terminal13) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal13(String pekerjaan);

    @Query("SELECT SUM(terminal14) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal14(String pekerjaan);

    @Query("SELECT SUM(terminal15) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal15(String pekerjaan);

    @Query("SELECT SUM(terminal16) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal16(String pekerjaan);

    @Query("SELECT SUM(terminal17) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal17(String pekerjaan);

    @Query("SELECT SUM(terminal18) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal18(String pekerjaan);

    @Query("SELECT SUM(instrumental1) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental1(String pekerjaan);

    @Query("SELECT SUM(instrumental2) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental2(String pekerjaan);

    @Query("SELECT SUM(instrumental3) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental3(String pekerjaan);

    @Query("SELECT SUM(instrumental4) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental4(String pekerjaan);

    @Query("SELECT SUM(instrumental5) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental5(String pekerjaan);

    @Query("SELECT SUM(instrumental6) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental6(String pekerjaan);

    @Query("SELECT SUM(instrumental7) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental7(String pekerjaan);

    @Query("SELECT SUM(instrumental8) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental8(String pekerjaan);

    @Query("SELECT SUM(instrumental9) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental9(String pekerjaan);

    @Query("SELECT SUM(instrumental10) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental10(String pekerjaan);

    @Query("SELECT SUM(instrumental11) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental11(String pekerjaan);

    @Query("SELECT SUM(instrumental12) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental12(String pekerjaan);

    @Query("SELECT SUM(instrumental13) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental13(String pekerjaan);

    @Query("SELECT SUM(instrumental14) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental14(String pekerjaan);

    @Query("SELECT SUM(instrumental15) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental15(String pekerjaan);

    @Query("SELECT SUM(instrumental16) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental16(String pekerjaan);

    @Query("SELECT SUM(instrumental17) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental17(String pekerjaan);

    @Query("SELECT SUM(instrumental18) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSuminstrumental18(String pekerjaan);

    // Edited by Hamdi
    @Query("SELECT pekerjaan, SUM(terminal1) AS count FROM tUser GROUP BY pekerjaan")
    List<ValueCount> getSumTotal1ByPekerjaan();

    class ValueCount {
       public String pekerjaan;
       public Integer count;
    }

//     @Query("SELECT SUM(terminal1) AS c1,
//                    SUM(terminal2) AS c2,
//                    SUM(terminal3) AS c3,
//                    SUM(terminal4) AS c4,
//                    SUM(terminal5) AS c5,
//                    SUM(terminal6) AS c6,
//                    SUM(terminal7) AS c7,
//                    SUM(terminal8) AS c8,
//                    SUM(terminal9) AS c9,
//                    SUM(terminal10) AS c10,
//                    SUM(terminal11) AS c11,
//                    SUM(terminal12) AS c12,
//                    SUM(terminal13) AS c13,
//                    SUM(terminal14) AS c14,
//                    SUM(terminal15) AS c15,
//                    SUM(terminal16) AS c16,
//                    SUM(terminal17) AS c17,
//                    SUM(terminal18) AS c18
//             FROM tUser")
//     ValueCount getSumTerminals();

//     class ValueCount {
//        public Integer c1;
//        public Integer c2;
//        public Integer c3;
//        public Integer c4;
//        public Integer c5;
//        public Integer c6;
//        public Integer c7;
//        public Integer c8;
//        public Integer c9;
//        public Integer c10;
//        public Integer c11;
//        public Integer c12;
//        public Integer c13;
//        public Integer c14;
//        public Integer c15;
//        public Integer c16;
//        public Integer c17;
//        public Integer c18;
//     }

//     @Query("SELECT pekerjaan, SUM(terminal1) AS count FROM tUser GROUP BY pekerjaan")
//     List<ValueGroupCount> getSumTotal1ByPekerjaan();

//     class ValueGroupCount {
//        public String pekerjaan;
//        public Integer count;
//     }

}
