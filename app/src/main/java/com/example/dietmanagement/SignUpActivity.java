package com.example.dietmanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    EditText id = findViewById(R.id.idET_singUp);
    Button duplication_id = findViewById(R.id.idDoubleCheckBTN_singUp);
    EditText nickname = findViewById(R.id.nickNameET_singUp);
    Button duplication_nickname = findViewById(R.id.nickNameDoubleCheckBTN_singUp);
    EditText pw = findViewById(R.id.pwET_singUp);
    EditText pw_check = findViewById(R.id.pwCheckET_singUp);
    EditText height = findViewById(R.id.heightET_singUp);
    EditText weight = findViewById(R.id.weightET_singUp);
    Spinner gender = findViewById(R.id.genderSpinner_singUp);
    Button singup = findViewById(R.id.singUpBTN_singUp);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        duplication_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        duplication_nickname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}