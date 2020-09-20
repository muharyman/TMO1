package com.example.tmo1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.text2)
    TextView text2;
    AppDatabase database;
    User user ;
    String nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            nama = bundle.getString("STRING_I_NEED");
        }

        database = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "dbUser").allowMainThreadQueries().build();

        user = new User();

        user = database.userDao().getUserById(nama);
        int test = database.userDao().getSumTerminal1("bebek");
        text1.setText(user.namaLengkap);
        text2.setText(String.valueOf(test));

    }

}
