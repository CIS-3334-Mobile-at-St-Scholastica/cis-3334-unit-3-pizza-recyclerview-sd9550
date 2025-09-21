package cis3334.unit5_pizzarycycle;

import android.app.Application;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {


    private final MainViewModel mainViewModel;
    private final Application application;
    private List<Pizza> pizzaList;

    public OrderAdapter(Application application, MainViewModel mainViewModel) {
        this.application = application;
        this.mainViewModel = mainViewModel;
        this.pizzaList = new ArrayList<>();
    }

    public void updatePizzaList(List<Pizza> pizzaList) {
        this.pizzaList.addAll(pizzaList);
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
