package com.faisal.mohammad.filesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPreferences = getSharedPreferences("myFile", Context.MODE_PRIVATE);
        findViewById(R.id.btnSave).setOnClickListener((View fiasal) -> {
            String fName = ((EditText) findViewById(R.id.edtFName)).getText().toString();
            String LName = ((EditText) findViewById(R.id.edtLname)).getText().toString();
//            SharedPreferences.Editor editor = mPreferences.edit();
//            editor.putString("fNameKey", fName);
//            editor.putString("lNameKey", LName);
//            editor.apply();

            StudentClass student= new StudentClass(fName,LName);
           new InsertAsyncTask(DataBaseClass.getmInstance(MainActivity.this).daoStudent()).execute(student);
//           InsertAsyncTask asy= new InsertAsyncTask(DataBaseClass.getmInstance(MainActivity.this).daoStudent());
//           asy.execute(student);
            // .insetStudent(student);
        });

        findViewById(R.id.button2).setOnClickListener((View v) -> {
            ((EditText) findViewById(R.id.edtFName)).setText(mPreferences.getString("fNameKey","N/a"));
            ((EditText) findViewById(R.id.edtLname)).setText(mPreferences.getString("lNameKey","N/a"));
        });
    }


}