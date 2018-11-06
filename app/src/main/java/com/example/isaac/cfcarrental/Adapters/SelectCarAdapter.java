package com.example.isaac.cfcarrental.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.isaac.cfcarrental.R;

import java.util.List;

public class SelectCarAdapter extends RecyclerView.Adapter<SelectCarAdapter.SelectCarViewHolder> {


    private Context mContext;
    private List<SelectCarHolder> mList;

    public SelectCarAdapter(Context mContext, List<SelectCarHolder> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public SelectCarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.select_car_holder, viewGroup, false);
        return new SelectCarViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectCarViewHolder selectCarViewHolder, int i) {

        selectCarViewHolder.fuelType.setText(mList.get(i).getFuelType().toString());
        selectCarViewHolder.carSeat.setText(mList.get(i).getCarSeat().toString());
        selectCarViewHolder.model.setText(mList.get(i).getModel().toString());
        selectCarViewHolder.manufacture.setText(mList.get(i).getManufacture().toString());
        selectCarViewHolder.plateNumber.setText(mList.get(i).getPlateNumber().toString());
        selectCarViewHolder.price.setText(mList.get(i).getPrice().toString());
        selectCarViewHolder.milage.setText(mList.get(i).getMilage().toString());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class SelectCarViewHolder extends RecyclerView.ViewHolder{

        TextView plateNumber, price, milage, manufacture, model, carSeat, fuelType;

        public SelectCarViewHolder(@NonNull View itemView) {
            super(itemView);

            plateNumber = itemView.findViewById(R.id.plateNumber);
            price = itemView.findViewById(R.id.price);
            milage = itemView.findViewById(R.id.mileage);
            manufacture = itemView.findViewById(R.id.manufacturer);
            model = itemView.findViewById(R.id.model);
            carSeat = itemView.findViewById(R.id.carSeat);
            fuelType = itemView.findViewById(R.id.fuelType);
        }
    }
}
