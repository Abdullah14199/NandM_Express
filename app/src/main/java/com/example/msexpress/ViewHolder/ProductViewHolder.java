package com.example.msexpress.ViewHolder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.msexpress.InterFace.itemClickListner;
import com.example.msexpress.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName , txtProductDescription, txtProductPrice ;
    public ImageView imageView;
    public itemClickListner listner;

    public ProductViewHolder(@NonNull View itemView)
    {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_image);
        txtProductName = itemView.findViewById(R.id.product_name);
        txtProductDescription = itemView.findViewById(R.id.product_description);
        txtProductPrice = itemView.findViewById(R.id.product_price);

    }

    public void setItemClickListner(AdapterView.OnItemClickListener listner)
    {
        this.listner = (itemClickListner) listner;
    }

    @Override
    public void onClick(View view)
    {
        listner.onClick(view, getAdapterPosition() , false);

    }
}
