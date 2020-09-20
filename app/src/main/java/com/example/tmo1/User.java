package com.example.tmo1;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "tUser")
public class User implements Serializable {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "namaLengkap") public String namaLengkap;
    @ColumnInfo(name = "pekerjaan") public String pekerjaan;
    @ColumnInfo(name = "namaPerusahaan") public String namaPerusahaan;

    // Terminal
    @ColumnInfo(name = "terminal1") public int terminal1;
    @ColumnInfo(name = "terminal2") public int terminal2;
    @ColumnInfo(name = "terminal3") public int terminal3;
    @ColumnInfo(name = "terminal4") public int terminal4;
    @ColumnInfo(name = "terminal5") public int terminal5;
    @ColumnInfo(name = "terminal6") public int terminal6;
    @ColumnInfo(name = "terminal7") public int terminal7;
    @ColumnInfo(name = "terminal8") public int terminal8;
    @ColumnInfo(name = "terminal9") public int terminal9;
    @ColumnInfo(name = "terminal10") public int terminal10;
    @ColumnInfo(name = "terminal11") public int terminal11;
    @ColumnInfo(name = "terminal12") public int terminal12;
    @ColumnInfo(name = "terminal13") public int terminal13;
    @ColumnInfo(name = "terminal14") public int terminal14;
    @ColumnInfo(name = "terminal15") public int terminal15;
    @ColumnInfo(name = "terminal16") public int terminal16;
    @ColumnInfo(name = "terminal17") public int terminal17;
    @ColumnInfo(name = "terminal18") public int terminal18;

    //Instrumental
    @ColumnInfo(name = "instrumental1") public int instrumental1;
    @ColumnInfo(name = "instrumental2") public int instrumental2;
    @ColumnInfo(name = "instrumental3") public int instrumental3;
    @ColumnInfo(name = "instrumental4") public int instrumental4;
    @ColumnInfo(name = "instrumental5") public int instrumental5;
    @ColumnInfo(name = "instrumental6") public int instrumental6;
    @ColumnInfo(name = "instrumental7") public int instrumental7;
    @ColumnInfo(name = "instrumental8") public int instrumental8;
    @ColumnInfo(name = "instrumental9") public int instrumental9;
    @ColumnInfo(name = "instrumental10") public int instrumental10;
    @ColumnInfo(name = "instrumental11") public int instrumental11;
    @ColumnInfo(name = "instrumental12") public int instrumental12;
    @ColumnInfo(name = "instrumental13") public int instrumental13;
    @ColumnInfo(name = "instrumental14") public int instrumental14;
    @ColumnInfo(name = "instrumental15") public int instrumental15;
    @ColumnInfo(name = "instrumental16") public int instrumental16;
    @ColumnInfo(name = "instrumental17") public int instrumental17;
    @ColumnInfo(name = "instrumental18") public int instrumental18;
}
