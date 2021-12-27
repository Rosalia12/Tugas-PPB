package com.example.tourpekanbaru;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecylerviewAdapterHotel  extends RecyclerView.Adapter<RecylerviewAdapterHotel.ViewHolder> {

    private ArrayList<String> fotohotel= new ArrayList<>();
    private ArrayList<String> namahotel= new ArrayList<>();
    private ArrayList<String> infohotel= new ArrayList<>();
    private Context context;

    public RecylerviewAdapterHotel(ArrayList<String> fotohotel, ArrayList<String> namahotel, ArrayList<String> infohotel, Context context) {
        this.fotohotel = fotohotel;
        this.namahotel = namahotel;
        this.infohotel = infohotel;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_reycleviewadapterhotel,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotohotel.get(position)).into(holder.imgfotohotel);
        holder.txtnamahotel.setText(namahotel.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, namamakanan.get(position), Toast.LENGTH_LONG).show();

                Intent intent= new Intent(context, DetailActivityHotel.class);

                intent.putExtra("foto_hotel",fotohotel.get(position));
                intent.putExtra("nama_hotel",namahotel.get(position));
                intent.putExtra("info_hotel",infohotel.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namahotel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgfotohotel;
        TextView txtnamahotel;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgfotohotel = itemView.findViewById(R.id.imgfotohotel);
            txtnamahotel= itemView.findViewById(R.id.txtnamahotel);
            constraintLayout=itemView.findViewById(R.id.constrainLayout);
        }
    }
}
