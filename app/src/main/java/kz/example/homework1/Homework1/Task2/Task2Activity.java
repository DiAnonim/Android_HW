package kz.example.homework1.Homework1.Task2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import kz.example.homework1.R;


//Задание 2: Использование BaseAdapter
//  1. Создайте приложение, которое будет отображать сложный список
//элементов (например, список продуктов с изображением, названием и
//ценой) с помощью ListView и BaseAdapter.
//   2. Реализуйте кастомный адаптер на основе BaseAdapter, который будет
//связывать данные (изображение, название, цена) с соответствующими
//элементами интерфейса (ImageView, TextView).
//   3. Добавьте возможность удаления элемента из списка по долгому нажатию
//на него. При удалении список должен обновляться.
//  4. Напишите отчет, в котором подробно объясните процесс создания и
//работы с BaseAdapter.


public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw1_task2);

        ListView listView = findViewById(R.id.task2_listView);
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(R.drawable.task2_img1, "Красное яблоко ", "Яблоко", 100));
        productList.add(new Product(R.drawable.task2_img2, "Хлеб горячий", "Хлеб", 200));
        productList.add(new Product(R.drawable.task2_img3, "Свежее коровье молоко", "Молоко", 300));

        ProductAdapter productAdapter = new ProductAdapter(this, productList);
        listView.setAdapter(productAdapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                productList.remove(position);
                productAdapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "Элемент удален", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
