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

public class RecyeclerViewAdapterVihara extends RecyclerView.Adapter<RecyeclerViewAdapterVihara.ViewHolder> {
    private ArrayList<String> fototempatibadah= new ArrayList<>();
    private ArrayList<String> namatempatibadah= new ArrayList<>();
    private ArrayList<String> infotempatibadah= new ArrayList<>();
    private Context context;

    public RecyeclerViewAdapterVihara(ArrayList<String> fototempatibadah, ArrayList<String> namatempatibadah, ArrayList<String> infotempatibadah, Context context) {
        this.fototempatibadah = fototempatibadah;
        this.namatempatibadah = namatempatibadah;
        this.infotempatibadah = infotempatibadah;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_recyclerviewvihara,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fototempatibadah.get(position)).into(holder.imgfototempatibadah);
        holder.txtnamatempatibadah.setText(namatempatibadah.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, namatempatibadah.get(position), Toast.LENGTH_LONG).show();

                Intent intent= new Intent(context, DetailActivityVihara.class);

                intent.putExtra("foto_tempatibadah",fototempatibadah.get(position));
                intent.putExtra("nama_tempatibadah",namatempatibadah.get(position));
                intent.putExtra("info_tempatibadah",infotempatibadah.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namatempatibadah.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgfototempatibadah;
        TextView txtnamatempatibadah;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgfototempatibadah = itemView.findViewById(R.id.imgfotoibadah);
            txtnamatempatibadah= itemView.findViewById(R.id.txtnamaibadah);
            constraintLayout=itemView.findViewById(R.id.constrainLayout);
        }
    }
}
