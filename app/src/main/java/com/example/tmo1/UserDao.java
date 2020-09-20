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
    User getUserById(String name);

    @Query("SELECT SUM(terminal1) FROM tuser WHERE pekerjaan = :pekerjaan")
    int getSumTerminal1(String pekerjaan);

}
