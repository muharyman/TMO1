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
