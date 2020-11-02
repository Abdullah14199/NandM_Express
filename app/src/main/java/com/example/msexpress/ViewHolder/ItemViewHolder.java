package com.example.msexpress.ViewHolder;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.msexpress.InterFace.itemClickListner;
import com.example.msexpress.R;


public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName , txtProductDescription, txtProductPrice , txtProductStatus ;
    public ImageView imageView;
    public itemClickListner listner;

    public ItemViewHolder(@NonNull View itemView)
    {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_seller_image);
        txtProductName = itemView.findViewById(R.id.seller_product_name);
        txtProductDescription = itemView.findViewById(R.id.product_seller_description);
        txtProductPrice = itemView.findViewById(R.id.product_seller_price);
        txtProductStatus = itemView.findViewById(R.id.product_state);

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
