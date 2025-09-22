package cis3334.unit5_pizzarycycle;

import android.app.Application;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {

    private List<Pizza> pizzaList;

    public OrderAdapter(Application application, MainViewModel mainViewModel) {
        this.pizzaList = new ArrayList<>();
    }

    public void updatePizzaList(List<Pizza> pizzaList) {
        this.pizzaList.addAll(pizzaList);
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.order_row, parent, false);
        return new OrderViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        if (pizzaList != null && position < pizzaList.size()) {
            Pizza pizza = pizzaList.get(position);

            // Basic formatting first
            holder.textViewOrder.setText(pizza.toString());

            Log.d("CIS 3334", "Binding: " + pizza.toString());

        }
    }

    @Override
    public int getItemCount() {
        return pizzaList != null ? pizzaList.size() : 0;
    }
}
