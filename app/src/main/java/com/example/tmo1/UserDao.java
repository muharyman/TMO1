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

    @Query("SELECT pekerjaan, SUM(terminal1) AS count FROM tUser GROUP BY pekerjaan")
    List<ValueCount> getSumTotal1ByPekerjaan();

    class ValueCount {
       public String pekerjaan;
       public Integer count;
    }
}
