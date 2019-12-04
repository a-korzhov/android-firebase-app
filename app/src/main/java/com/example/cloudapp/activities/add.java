package com.example.cloudapp.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cloudapp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class add extends AppCompatActivity {
    private EditText name, price, count;
    private Button add;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        databaseReference = FirebaseDatabase.getInstance().getReference("uploads");
        name = findViewById(R.id.edt_name);
        price = findViewById(R.id.edt_price);
        count = findViewById(R.id.edt_count);
        add = findViewById(R.id.btn_add);
        add.setOnClickListener(v -> {
            if (TextUtils.isEmpty(name.getText().toString())) {
                Toast.makeText(getApplicationContext(), "name should not be empty", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(price.getText().toString())) {
                Toast.makeText(getApplicationContext(), "price should not be empty", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(count.getText().toString())) {
                Toast.makeText(getApplicationContext(), "count should not be empty", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(name.getText().toString()) && TextUtils.isEmpty(price.getText().toString()) && TextUtils.isEmpty(count.getText().toString())) {
                Toast.makeText(getApplicationContext(), "fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                DatabaseReference databaseReference1 = databaseReference.push();
                databaseReference1.child("name").setValue(name.getText().toString());
                databaseReference1.child("price").setValue(price.getText().toString());
                databaseReference1.child("count").setValue(count.getText().toString());

            }
        });
    }
}
