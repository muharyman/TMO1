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
}
