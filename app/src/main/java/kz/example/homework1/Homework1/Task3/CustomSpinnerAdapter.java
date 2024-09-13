package kz.example.homework1.Homework1.Task3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import kz.example.homework1.R;

public class CustomSpinnerAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] categories;
    private int[] images;

    public CustomSpinnerAdapter(Context context, String[] categories, int[] images) {
        super(context, R.layout.spinner_item_task3, categories);
        this.context = context;
        this.categories = categories;
        this.images = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item_task3, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.itemIcon);
        TextView textView = convertView.findViewById(R.id.itemText);

        imageView.setImageResource(images[position]);
        textView.setText(categories[position]);

        return convertView;
    }
}
