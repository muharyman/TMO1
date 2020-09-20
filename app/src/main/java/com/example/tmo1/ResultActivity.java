package com.example.tmo1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResultActivity extends AppCompatActivity {
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.text2)
    TextView text2;
    @BindView(R.id.lihatSummary)
    Button lihatSummary;

    @BindView(R.id.terminalx1)
    TextView terminalx1;

    @BindView(R.id.terminalx2)
    TextView terminalx2;

    @BindView(R.id.terminalx3)
    TextView terminalx3;

    @BindView(R.id.instrumentalx1)
    TextView instrumentalx1;

    @BindView(R.id.instrumentalx2)
    TextView instrumentalx2;

    @BindView(R.id.instrumentalx3)
    TextView instrumentalx3;

    AppDatabase database;
    User user ;
    String nama;
    String pekerjaan;

    ArrayList<String> terminalValue;
    ArrayList<String> instrumentalValue;
    ArrayList<Integer> listCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        assert bundle != null;
        nama = bundle.getString("STRING_I_NAMA");
        pekerjaan = bundle.getString("STRING_I_PEKERJAAN");

        database = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "dbUser").allowMainThreadQueries().build();

        user = new User();
        terminalValue = new ArrayList<String>();
        instrumentalValue = new ArrayList<String>();

        user = database.userDao().getUserByNama(nama);

        listCount = new ArrayList<Integer>();

        int t1 = database.userDao().getSumTerminal1(pekerjaan);
        int t2 = database.userDao().getSumTerminal2(pekerjaan);
        int t3 = database.userDao().getSumTerminal3(pekerjaan);
        int t4 = database.userDao().getSumTerminal4(pekerjaan);
        int t5 = database.userDao().getSumTerminal5(pekerjaan);
        int t6 = database.userDao().getSumTerminal6(pekerjaan);
        int t7 = database.userDao().getSumTerminal7(pekerjaan);
        int t8 = database.userDao().getSumTerminal8(pekerjaan);
        int t9 = database.userDao().getSumTerminal9(pekerjaan);
        int t10 = database.userDao().getSumTerminal10(pekerjaan);
        int t11 = database.userDao().getSumTerminal11(pekerjaan);
        int t12 = database.userDao().getSumTerminal12(pekerjaan);
        int t13 = database.userDao().getSumTerminal13(pekerjaan);
        int t14 = database.userDao().getSumTerminal14(pekerjaan);
        int t15 = database.userDao().getSumTerminal15(pekerjaan);
        int t16 = database.userDao().getSumTerminal16(pekerjaan);
        int t17 = database.userDao().getSumTerminal17(pekerjaan);
        int t18 = database.userDao().getSumTerminal18(pekerjaan);

        listCount.add(t1); listCount.add(t2);
        listCount.add(t3); listCount.add(t4);
        listCount.add(t5); listCount.add(t6);
        listCount.add(t7); listCount.add(t8);
        listCount.add(t9); listCount.add(t10);
        listCount.add(t11); listCount.add(t12);
        listCount.add(t13); listCount.add(t14);
        listCount.add(t15); listCount.add(t16);
        listCount.add(t17); listCount.add(t18);



        // Terminal
        if (user.terminal1 ==1 ){
            terminalValue.add("A comfortable life");
        }

        if (user.terminal2 == 1) {
            terminalValue.add("An exciting life");
        }

        if (user.terminal3 == 1) {
            terminalValue.add("A sense of accomplishment");
        }

        if (user.terminal4 == 1) {
            terminalValue.add("A world at peace");
        }

        if (user.terminal5 == 1) {
            terminalValue.add("A world of beauty");
        }

        if (user.terminal6 == 1) {
            terminalValue.add("Equality");
        }

        if (user.terminal7 == 1) {
            terminalValue.add("Family security");
        }

        if (user.terminal8 == 1) {
            terminalValue.add("Freedom");
        }

        if (user.terminal9 == 1) {
            terminalValue.add("Happinness");
        }

        if (user.terminal10 == 1) {
            terminalValue.add("Inner harmony");
        }

        if (user.terminal11 == 1) {
            terminalValue.add("Mature love");
        }

        if (user.terminal12 == 1) {
            terminalValue.add("National security");
        }

        if (user.terminal13 == 1) {
            terminalValue.add("Pleasure");
        }

        if (user.terminal14 == 1) {
            terminalValue.add("Salvation");
        }

        if (user.terminal15 == 1) {
            terminalValue.add("Self-respect");
        }

        if (user.terminal16 == 1) {
            terminalValue.add("Social recognition");
        }

        if (user.terminal17 == 1) {
            terminalValue.add("True friendship");
        }
        if (user.terminal18 == 1) {
            terminalValue.add("Wisdom");
        }

        // Instrumental

        if (user.instrumental1 ==1 ){
            instrumentalValue.add("Ambitious");
        }

        if (user.instrumental2 == 1) {
            instrumentalValue.add("Broad-minded");
        }

        if (user.instrumental3 == 1) {
            instrumentalValue.add("Capable");
        }

        if (user.instrumental4 == 1) {
            instrumentalValue.add("Cheerful");
        }

        if (user.instrumental5 == 1) {
            instrumentalValue.add("Clean");
        }

        if (user.instrumental6 == 1) {
            instrumentalValue.add("Courageous");
        }

        if (user.instrumental7 == 1) {
            instrumentalValue.add("Forgiving");
        }

        if (user.instrumental8 == 1) {
            instrumentalValue.add("Helpful");
        }

        if (user.instrumental9 == 1) {
            instrumentalValue.add("Honest");
        }

        if (user.instrumental10 == 1) {
            instrumentalValue.add("Imaginative");
        }

        if (user.instrumental11 == 1) {
            instrumentalValue.add("Independent");
        }

        if (user.instrumental12 == 1) {
            instrumentalValue.add("Intellectual");
        }

        if (user.instrumental13 == 1) {
            instrumentalValue.add("Logical");
        }

        if (user.instrumental14 == 1) {
            instrumentalValue.add("Loving");
        }

        if (user.instrumental15 == 1) {
            instrumentalValue.add("Obedient");
        }

        if (user.instrumental16 == 1) {
            instrumentalValue.add("Polite");
        }

        if (user.instrumental17 == 1) {
            instrumentalValue.add("Responsible");
        }
        if (user.instrumental18 == 1) {
            instrumentalValue.add("Self-controlled");
        }

        text1.setText(user.namaLengkap);
        text2.setText(user.pekerjaan);
        terminalx1.setText(terminalValue.get(0));
        terminalx2.setText(terminalValue.get(1));
        terminalx3.setText(terminalValue.get(2));
        instrumentalx1.setText(instrumentalValue.get(0));
        instrumentalx2.setText(instrumentalValue.get(1));
        instrumentalx3.setText(instrumentalValue.get(2));
    }

    @OnClick(R.id.lihatSummary)
    public void click(){
        Intent intent =  new Intent(this, SummaryActivity.class);
        intent.putExtra("LIST_TERMINAL", listCount);
        startActivity(intent);
    }



}
