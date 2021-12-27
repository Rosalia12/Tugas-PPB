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

public class RecyclerViewAdapterKuliner  extends RecyclerView.Adapter<RecyclerViewAdapterKuliner.ViewHolder> {

    private ArrayList<String> fotokuliner= new ArrayList<>();
    private ArrayList<String> namakuliner= new ArrayList<>();
    private ArrayList<String> infokuliner= new ArrayList<>();
    private Context context;

    public RecyclerViewAdapterKuliner(ArrayList<String> fotokuliner, ArrayList<String> namakuliner, ArrayList<String> infokuliner, Context context) {
        this.fotokuliner = fotokuliner;
        this.namakuliner = namakuliner;
        this.infokuliner = infokuliner;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_recyclerview_adapter_kuliner,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotokuliner.get(position)).into(holder.imgfotokuliner);
        holder.txtnamakuliner.setText(namakuliner.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, namamakanan.get(position), Toast.LENGTH_LONG).show();

                Intent intent= new Intent(context, DetailActivityKuliner.class);

                intent.putExtra("foto_kuliner",fotokuliner.get(position));
                intent.putExtra("nama_kuliner",namakuliner.get(position));
                intent.putExtra("info_kuliner",infokuliner.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namakuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgfotokuliner;
        TextView txtnamakuliner;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgfotokuliner = itemView.findViewById(R.id.imgfotokuliner);
            txtnamakuliner= itemView.findViewById(R.id.txtnamakuliner);
            constraintLayout=itemView.findViewById(R.id.constrainLayout);
        }
    }
}
