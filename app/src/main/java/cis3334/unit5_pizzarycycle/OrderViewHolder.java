package cis3334.unit5_pizzarycycle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageViewOrder;
    TextView textViewOrder;
    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewOrder = itemView.findViewById(R.id.imageViewOrder);
        textViewOrder = itemView.findViewById(R.id.textViewOrder);

    }
}
