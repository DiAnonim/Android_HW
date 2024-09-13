package kz.example.homework1.Homework1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kz.example.homework1.Homework1.Task1.Task1Activity;
import kz.example.homework1.Homework1.Task2.Task2Activity;
import kz.example.homework1.Homework1.Task3.Task3Activity;
import kz.example.homework1.R;

public class MainActivity_HW1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_hw1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickTask1(View view){
        Intent intent = new Intent(this, Task1Activity.class);
        startActivity(intent);
    }

    public void onClickTask2(View view){
        Intent intent = new Intent(this, Task2Activity.class);
        startActivity(intent);
    }

    public void onClickTask3(View view){
        Intent intent = new Intent(this, Task3Activity.class);
        startActivity(intent);
    }
}