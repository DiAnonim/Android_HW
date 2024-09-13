package kz.example.homework1.Homework1.Task2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import kz.example.homework1.R;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private List<Product> productList;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.product_item_task2, parent, false);
        }

        Product product = (Product) getItem(position);

        ImageView imageView = convertView.findViewById(R.id.product_image);
        TextView titleView = convertView.findViewById(R.id.product_title);
        TextView descView = convertView.findViewById(R.id.product_desc);
        TextView priceView = convertView.findViewById(R.id.product_price);

        imageView.setImageResource(product.getImage());
        titleView.setText(product.getTitle());
        descView.setText(product.getDesc());
        priceView.setText(String.valueOf(product.getPrice()));

        return convertView;
    }

}
