package com.example.tmo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int count_terminal = 0;
    public int count_instrumental = 0;
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
    @BindView(R.id.nama_perusahaan)
    EditText namaPerusahaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Log.d("terminal", String.valueOf(count_terminal));

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.terminal1) {
            if (terminal1.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal2) {
            if (terminal2.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal3) {
            if (terminal4.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal5) {
            if (terminal5.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal6) {
            if (terminal6.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal7) {
            if (terminal7.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal8) {
            if (terminal8.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal9) {
            if (terminal9.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal10) {
            if (terminal11.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal12) {
            if (terminal12.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal13) {
            if (terminal13.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal14) {
            if (terminal14.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal15) {
            if (terminal15.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal16) {
            if (terminal16.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal17) {
            if (terminal17.isChecked()) {
                count_terminal += 1;
            }
        }
        if (view.getId() == R.id.terminal18) {
            if (terminal18.isChecked()) {
                count_terminal += 1;
            }
        }

        if (view.getId() == R.id.instrumental1) {
            if (instrumental1.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental2) {
            if (instrumental2.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental3) {
            if (instrumental3.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental4) {
            if (instrumental4.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental5) {
            if (instrumental5.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental6) {
            if (instrumental6.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental7) {
            if (instrumental7.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental8) {
            if (instrumental8.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental9) {
            if (instrumental9.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental10) {
            if (instrumental10.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental11) {
            if (instrumental11.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental12) {
            if (instrumental13.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental14) {
            if (instrumental14.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental15) {
            if (instrumental15.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental16) {
            if (instrumental16.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental17) {
            if (instrumental17.isChecked()) {
                count_instrumental += 1;
            }
        }
        if (view.getId() == R.id.instrumental18) {
            if (instrumental18.isChecked()) {
                count_instrumental += 1;
            }
        }

    }

    @OnClick(R.id.submit)
    public void submit(){
        String name = namaLengkap.getText().toString();
        String job = pekerjaan.getText().toString();
        String company = namaPerusahaan.getText().toString();
        int terminal_1 = terminal1.isChecked() ? 1 : 0 ; int terminal_2 = terminal2.isChecked() ? 1 : 0 ;
        int terminal_3 = terminal3.isChecked() ? 1 : 0 ; int terminal_4 = terminal4.isChecked() ? 1 : 0 ;
        int terminal_5 = terminal5.isChecked() ? 1 : 0 ; int terminal_6 = terminal6.isChecked() ? 1 : 0 ;
        int terminal_7 = terminal7.isChecked() ? 1 : 0 ; int terminal_8 = terminal8.isChecked() ? 1 : 0 ;
        int terminal_9 = terminal9.isChecked() ? 1 : 0 ; int terminal_10 = terminal10.isChecked() ? 1 : 0 ;
        int terminal_11 = terminal11.isChecked() ? 1 : 0 ; int terminal_12 = terminal12.isChecked() ? 1 : 0 ;
        int terminal_13 = terminal13.isChecked() ? 1 : 0 ; int terminal_14 = terminal14.isChecked() ? 1 : 0 ;
        int terminal_15 = terminal15.isChecked() ? 1 : 0 ; int terminal_16 = terminal16.isChecked() ? 1 : 0 ;
        int terminal_17 = terminal17.isChecked() ? 1 : 0 ; int terminal_18 = terminal18.isChecked() ? 1 : 0 ;
        int instrumental_1 = instrumental1.isChecked() ? 1 : 0 ; int instrumental_2 = instrumental2.isChecked() ? 1 : 0 ;
        int instrumental_3 = instrumental3.isChecked() ? 1 : 0 ; int instrumental_4 = instrumental4.isChecked() ? 1 : 0 ;
        int instrumental_5 = instrumental5.isChecked() ? 1 : 0 ; int instrumental_6 = instrumental6.isChecked() ? 1 : 0 ;
        int instrumental_7 = instrumental7.isChecked() ? 1 : 0 ; int instrumental_8 = instrumental8.isChecked() ? 1 : 0 ;
        int instrumental_9 = instrumental9.isChecked() ? 1 : 0 ; int instrumental_10 = instrumental10.isChecked() ? 1 : 0 ;
        int instrumental_11 = instrumental11.isChecked() ? 1 : 0 ; int instrumental_12 = instrumental12.isChecked() ? 1 : 0 ;
        int instrumental_13 = instrumental13.isChecked() ? 1 : 0 ; int instrumental_14 = instrumental14.isChecked() ? 1 : 0 ;
        int instrumental_15 = instrumental15.isChecked() ? 1 : 0 ; int instrumental_16 = instrumental16.isChecked() ? 1 : 0 ;
        int instrumental_17 = instrumental17.isChecked() ? 1 : 0 ; int instrumental_18 = instrumental18.isChecked() ? 1 : 0 ;
        String test = "" + name + job + company + terminal_1 + terminal_2;
        Toast.makeText(this,test, Toast.LENGTH_LONG).show();
    }

}