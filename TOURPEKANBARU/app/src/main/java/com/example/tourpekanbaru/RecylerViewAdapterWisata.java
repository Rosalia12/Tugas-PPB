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

public class RecylerViewAdapterWisata extends RecyclerView.Adapter<RecylerViewAdapterWisata.ViewHolder> {
    private ArrayList<String> fotowisata=new ArrayList<>();
    private ArrayList<String> namawisata=new ArrayList<>();
    private ArrayList<String> infowisata=new ArrayList<>();
    private Context context;

    public RecylerViewAdapterWisata(ArrayList<String> fotowisata, ArrayList<String> namawisata, ArrayList<String> infowisata, Context context) {
        this.fotowisata = fotowisata;
        this.namawisata = namawisata;
        this.infowisata = infowisata;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_reycleviewadapterwisata,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotowisata.get(position)).into(holder.imgfotowisata);
        holder.txtnamawisata.setText(namawisata.get(position));
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, namawisata.get(position), Toast.LENGTH_LONG).show();
                Intent intent= new Intent(context, DetailActivityWisata.class);
                intent.putExtra("foto_wisata",fotowisata.get(position));
                intent.putExtra("nama_wisata",namawisata.get(position));
                intent.putExtra("info_wisata",infowisata.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namawisata.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgfotowisata;
        TextView txtnamawisata;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgfotowisata = itemView.findViewById(R.id.imgfotowisata);
            txtnamawisata= itemView.findViewById(R.id.txtnamawisata);
            constraintLayout=itemView.findViewById(R.id.constrainLayout);
        }
    }
}
