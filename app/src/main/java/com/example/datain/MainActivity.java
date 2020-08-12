package com.example.datain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;

    private Button b;
    private String t1,t2,t3;

    private DatabaseReference dbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et3 = (EditText) findViewById(R.id.et3);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        b = (Button) findViewById(R.id.b);
        dbu = FirebaseDatabase.getInstance().getReference("menulist");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t3 = et3.getText().toString();
                t1 = et1.getText().toString();
                t2 = et2.getText().toString();
                String id = dbu.push().getKey();
                menulist m = new menulist(id,t3,t1,t2);
                dbu.child(id).setValue(m);


            }
        });
    }
}
