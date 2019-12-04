package com.example.cloudapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {
    private List<ListData> listdata;
    private Context context;

    public adapter(List<ListData> list_data, Context context) {
        this.listdata = list_data;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.ViewHolder holder, int position) {
        ListData ld = listdata.get(position);
        holder.name.setText(context.getText(R.string.product_name) + ld.getName());
        holder.price.setText(context.getText(R.string.product_price) + ld.getPrice() + "$");
        holder.count.setText(context.getText(R.string.product_count) + ld.getCount());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, price, count;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_name);
            price = itemView.findViewById(R.id.txt_price);
            count = itemView.findViewById(R.id.txt_count);
        }
    }
}
