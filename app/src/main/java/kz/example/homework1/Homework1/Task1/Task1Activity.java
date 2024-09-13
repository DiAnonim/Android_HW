package kz.example.homework1.Homework1.Task1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import kz.example.homework1.R;

//Задание 1: Работа с ArrayAdapter
//  1. Создайте приложение, которое будет отображать список элементов
//(например, список имен) с помощью ListView и ArrayAdapter.
//  2. Реализуйте добавление нового элемента в список по нажатию на кнопку.
//Новый элемент должен вводиться в текстовое поле и добавляться в
//список.
//  3. При добавлении нового элемента список должен автоматически
//обновляться и отображать добавленный элемент.
//  4. Напишите отчет, в котором опишите, как работает ArrayAdapter и
//какие шаги необходимы для его использования в приложении.


public class Task1Activity extends AppCompatActivity {

    private List<String> namesList;
    private ArrayAdapter <String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hw1_task1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        namesList = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namesList);
    }

    public void onClickAddName(View view) {

        EditText newName = findViewById(R.id.editText_NewName);

        namesList.add(newName.getText().toString());

        ListView listView = findViewById(R.id.task1_listView);
        arrayAdapter.notifyDataSetChanged();
        listView.setAdapter(arrayAdapter);
    }
}