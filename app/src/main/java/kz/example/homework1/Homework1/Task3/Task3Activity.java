package kz.example.homework1.Homework1.Task3;


import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kz.example.homework1.R;


//Задание 4: Spinner с кастомным ArrayAdapter
//  1. Создайте приложение, которое будет использовать Spinner для выбора
//из списка опций (например, выбор категории товаров).
//  2. Реализуйте кастомный ArrayAdapter для Spinner, который будет
//отображать элементы списка с кастомной разметкой (например, с
//изображением и текстом).
//  3. Добавьте обработчик события выбора элемента из Spinner, который
//будет выводить выбранную категорию на экран.
//   4. В отчете опишите, как кастомизировать ArrayAdapter для Spinner и
//как реализовать взаимодействие пользователя с этим элементом.

public class Task3Activity extends AppCompatActivity {

    private Spinner spinner;
    private TextView selectedText;

    String[] categories = {"Электроника", "Одежда", "Книги"};
    int[] images = {R.drawable.task3_img1, R.drawable.task3_img2, R.drawable.task3_img3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw1_task3);

        spinner = findViewById(R.id.spinner_hw1_task3);
        selectedText = findViewById(R.id.textView_hw1_task3);

        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(this, categories, images);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                selectedText.setText("Вы выбрали: " + categories[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

}