package com.rodrigobravo.polla20;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamHolder> {

    public Context context;
    private List<Team> teamList;

    public TeamAdapter(Context context, List<Team> teams) {
        this.context = context;
        teamList = teams;
    }

    @NonNull
    @Override
    public TeamHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent , false);
        return new TeamHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamHolder holder, int position) {

        Team team = teamList.get(position);
        holder.name.setText(team.getName().toString());
        holder.code.setText(team.getCode());
        holder.crest.setText(team.getCrest());
        Glide.with(context).load(team.getCrest()).into(holder.imageView);

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , DetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("name" , team.getName());
                bundle.putString("code" , team.getCode());
                bundle.putString("crest" , team.getCrest());

                intent.putExtras(bundle);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public class TeamHolder extends RecyclerView.ViewHolder{

       ConstraintLayout constraintLayout;
        ImageView imageView;
        TextView name, code, crest;

        public TeamHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.team_tv);
            code = itemView.findViewById(R.id.iniciales_tv);
            crest = itemView.findViewById(R.id.code_tv);
            constraintLayout = itemView.findViewById(R.id.main_layout);
        }
    }
}
