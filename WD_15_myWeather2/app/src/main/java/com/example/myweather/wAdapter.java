package com.example.myweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myweather.wItem;

import java.util.List;

public class wAdapter extends RecyclerView.Adapter<wAdapter.ViewHolder> {
    private List<wItem> witems;
    private Context context;

    public wAdapter(Context context, List<wItem> items) {
        this.context = context;
        this.witems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        wItem item = witems.get(position);
        holder.city.setText(item.getCity());
        holder.temperature.setText(item.getTemperature());
        holder.feelsLike.setText(item.getFeelsLike());
        holder.tempMax.setText(item.getTempMax());
        holder.tempMin.setText(item.getTempMin());
        holder.pressure.setText(item.getPressure());
        holder.humidity.setText(item.getHumidity());
    }

    @Override
    public int getItemCount() {
        return witems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView city, temperature, feelsLike, tempMax, tempMin, pressure, humidity;

        public ViewHolder(View itemView) {
            super(itemView);
            city = itemView.findViewById(R.id.city);
            temperature = itemView.findViewById(R.id.temperature);
            feelsLike = itemView.findViewById(R.id.feels_like);
            tempMax = itemView.findViewById(R.id.temp_max);
            tempMin = itemView.findViewById(R.id.temp_min);
            pressure = itemView.findViewById(R.id.pressure);
            humidity = itemView.findViewById(R.id.humidity);
        }
    }
}
