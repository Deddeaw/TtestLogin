package sdu.cs58.deddeaw.testlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, passwordEditText;
    Button loginButton;
    String nameString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.edtName);
        passwordEditText = findViewById(R.id.edtPassword);
        loginButton = findViewById(R.id.bntLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameString = nameEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                if (nameString.length() == 0) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();

                }else {//ถ้าไม่เป็นค่าว่างให้เปิดหน้าเกม
                    Intent startIntent = new Intent(MainActivity.this, LoginActivity.class);//การเรียกใช้ Instent
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);

                }
            }
        });

    }//end onCreate
}//end class
