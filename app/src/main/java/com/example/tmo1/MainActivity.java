package com.example.tmo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public int count_terminal;
    public int count_instrumental;
    @BindView(R.id.terminal1) CheckBox terminal1; @BindView(R.id.terminal2) CheckBox terminal2;
    @BindView(R.id.terminal3) CheckBox terminal3; @BindView(R.id.terminal4) CheckBox terminal4;
    @BindView(R.id.terminal5) CheckBox terminal5; @BindView(R.id.terminal6) CheckBox terminal6;
    @BindView(R.id.terminal7) CheckBox terminal7; @BindView(R.id.terminal8) CheckBox terminal8;
    @BindView(R.id.terminal9) CheckBox terminal9; @BindView(R.id.terminal10) CheckBox terminal10;
    @BindView(R.id.terminal11) CheckBox terminal11; @BindView(R.id.terminal12) CheckBox terminal12;
    @BindView(R.id.terminal13) CheckBox terminal13; @BindView(R.id.terminal14) CheckBox terminal14;
    @BindView(R.id.terminal15) CheckBox terminal15; @BindView(R.id.terminal16) CheckBox terminal16;
    @BindView(R.id.terminal17) CheckBox terminal17; @BindView(R.id.terminal18) CheckBox terminal18;

    @BindView(R.id.instrumental1) CheckBox instrumental1; @BindView(R.id.instrumental2) CheckBox instrumental2;
    @BindView(R.id.instrumental3) CheckBox instrumental3; @BindView(R.id.instrumental4) CheckBox instrumental4;
    @BindView(R.id.instrumental5) CheckBox instrumental5; @BindView(R.id.instrumental6) CheckBox instrumental6;
    @BindView(R.id.instrumental7) CheckBox instrumental7; @BindView(R.id.instrumental8) CheckBox instrumental8;
    @BindView(R.id.instrumental9) CheckBox instrumental9; @BindView(R.id.instrumental10) CheckBox instrumental10;
    @BindView(R.id.instrumental11) CheckBox instrumental11; @BindView(R.id.instrumental12) CheckBox instrumental12;
    @BindView(R.id.instrumental13) CheckBox instrumental13; @BindView(R.id.instrumental14) CheckBox instrumental14;
    @BindView(R.id.instrumental15) CheckBox instrumental15; @BindView(R.id.instrumental16) CheckBox instrumental16;
    @BindView(R.id.instrumental17) CheckBox instrumental17; @BindView(R.id.instrumental18) CheckBox instrumental18;

    @BindView(R.id.nama_lengkap)
    EditText namaLengkap ;
    @BindView(R.id.pekerjaan)
    EditText pekerjaan ;

    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Terminal
        terminal1.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal2.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal3.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal4.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal5.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal6.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal7.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal8.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal9.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal10.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal11.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal12.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal13.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal14.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal15.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal16.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal17.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));
        terminal18.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNot(isChecked));

        // Instrumental
        instrumental1.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental2.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental3.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental4.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental5.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental6.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental7.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental8.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental9.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental10.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental11.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental12.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental13.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental14.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental15.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental16.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental17.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));
        instrumental18.setOnCheckedChangeListener((buttonView, isChecked) -> isCheckedOrNotTwo(isChecked));

        database = Room.databaseBuilder(
                getApplicationContext(),
                AppDatabase.class,
                "dbUser") //Nama File Database yang akan disimpan
                .build();

    }

    private void isCheckedOrNot(boolean isChecked) {
        if (isChecked) {
            count_terminal++;
        } else {
            if (count_terminal > 0) {
                count_terminal--;
            }
        }
    }

    private void isCheckedOrNotTwo(boolean isChecked) {
        if (isChecked) {
            count_instrumental++;
        } else {
            if (count_instrumental > 0) {
                count_instrumental--;
            }
        }
    }

    @SuppressLint("StaticFieldLeak")
    private void insertData(final User user){
        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                //Menjalankan proses insert data
                return database.userDao().insertUser(user);
            }

            @Override
            protected void onPostExecute(Long status) {
                //Menandakan bahwa data berhasil disimpan
                Toast.makeText(MainActivity.this, "Status Row "+status, Toast.LENGTH_SHORT).show();
            }
        }.execute();
    }

    @OnClick(R.id.submit)
    public void submit() {
        if (namaLengkap.getText().toString().equals("") || pekerjaan.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Nama atau Pekerjaan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else if (count_instrumental < 3 || count_instrumental > 5 || count_terminal < 3 || count_terminal > 5) {
            Log.d("count_terminal", String.valueOf(count_terminal));
            Log.d("count_instrumental", String.valueOf(count_instrumental));
            Toast.makeText(MainActivity.this, "Pilihlah 3 - 5 poin di setiap kategori", Toast.LENGTH_SHORT).show();
        } else {
            User data = new User();

            data.namaLengkap = namaLengkap.getText().toString();
            data.pekerjaan = pekerjaan.getText().toString();

            int terminal_1 = terminal1.isChecked() ? 1 : 0;
            int terminal_2 = terminal2.isChecked() ? 1 : 0;
            int terminal_3 = terminal3.isChecked() ? 1 : 0;
            int terminal_4 = terminal4.isChecked() ? 1 : 0;
            int terminal_5 = terminal5.isChecked() ? 1 : 0;
            int terminal_6 = terminal6.isChecked() ? 1 : 0;
            int terminal_7 = terminal7.isChecked() ? 1 : 0;
            int terminal_8 = terminal8.isChecked() ? 1 : 0;
            int terminal_9 = terminal9.isChecked() ? 1 : 0;
            int terminal_10 = terminal10.isChecked() ? 1 : 0;
            int terminal_11 = terminal11.isChecked() ? 1 : 0;
            int terminal_12 = terminal12.isChecked() ? 1 : 0;
            int terminal_13 = terminal13.isChecked() ? 1 : 0;
            int terminal_14 = terminal14.isChecked() ? 1 : 0;
            int terminal_15 = terminal15.isChecked() ? 1 : 0;
            int terminal_16 = terminal16.isChecked() ? 1 : 0;
            int terminal_17 = terminal17.isChecked() ? 1 : 0;
            int terminal_18 = terminal18.isChecked() ? 1 : 0;
            int instrumental_1 = instrumental1.isChecked() ? 1 : 0;
            int instrumental_2 = instrumental2.isChecked() ? 1 : 0;
            int instrumental_3 = instrumental3.isChecked() ? 1 : 0;
            int instrumental_4 = instrumental4.isChecked() ? 1 : 0;
            int instrumental_5 = instrumental5.isChecked() ? 1 : 0;
            int instrumental_6 = instrumental6.isChecked() ? 1 : 0;
            int instrumental_7 = instrumental7.isChecked() ? 1 : 0;
            int instrumental_8 = instrumental8.isChecked() ? 1 : 0;
            int instrumental_9 = instrumental9.isChecked() ? 1 : 0;
            int instrumental_10 = instrumental10.isChecked() ? 1 : 0;
            int instrumental_11 = instrumental11.isChecked() ? 1 : 0;
            int instrumental_12 = instrumental12.isChecked() ? 1 : 0;
            int instrumental_13 = instrumental13.isChecked() ? 1 : 0;
            int instrumental_14 = instrumental14.isChecked() ? 1 : 0;
            int instrumental_15 = instrumental15.isChecked() ? 1 : 0;
            int instrumental_16 = instrumental16.isChecked() ? 1 : 0;
            int instrumental_17 = instrumental17.isChecked() ? 1 : 0;
            int instrumental_18 = instrumental18.isChecked() ? 1 : 0;

            data.terminal1 = terminal_1;
            data.terminal2 = terminal_2;
            data.terminal3 = terminal_3;
            data.terminal4 = terminal_4;
            data.terminal5 = terminal_5;
            data.terminal6 = terminal_6;
            data.terminal7 = terminal_7;
            data.terminal8 = terminal_8;
            data.terminal9 = terminal_9;
            data.terminal10 = terminal_10;
            data.terminal11 = terminal_11;
            data.terminal12 = terminal_12;
            data.terminal13 = terminal_13;
            data.terminal14 = terminal_14;
            data.terminal15 = terminal_15;
            data.terminal16 = terminal_16;
            data.terminal17 = terminal_17;
            data.terminal18 = terminal_18;

            data.instrumental1 = instrumental_1;
            data.instrumental2 = instrumental_2;
            data.instrumental3 = instrumental_3;
            data.instrumental4 = instrumental_4;
            data.instrumental5 = instrumental_5;
            data.instrumental6 = instrumental_6;
            data.instrumental7 = instrumental_7;
            data.instrumental8 = instrumental_8;
            data.instrumental9 = instrumental_9;
            data.instrumental10 = instrumental_10;
            data.instrumental11 = instrumental_11;
            data.instrumental12 = instrumental_12;
            data.instrumental13 = instrumental_13;
            data.instrumental14 = instrumental_14;
            data.instrumental15 = instrumental_15;
            data.instrumental16 = instrumental_16;
            data.instrumental17 = instrumental_17;
            data.instrumental18 = instrumental_18;

            insertData(data);

            Toast.makeText(MainActivity.this, "Data Berhasil disimpan", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("STRING_I_NAMA", namaLengkap.getText().toString());
            intent.putExtra("STRING_I_PEKERJAAN", pekerjaan.getText().toString());
            startActivity(intent);

            namaLengkap.setText("");
            pekerjaan.setText("");

        }
    }

}