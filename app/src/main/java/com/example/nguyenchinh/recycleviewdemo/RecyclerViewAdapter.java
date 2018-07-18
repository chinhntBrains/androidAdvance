package com.example.nguyenchinh.recycleviewdemo;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{

        private List<String> heroNames = new ArrayList<>();
        private List<Integer> heroImages = new ArrayList<>();

        public RecyclerViewAdapter(List<String> heroNames, List<Integer> heroImages) {
            this.heroNames = heroNames;
            this.heroImages = heroImages;
        }

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.item, parent, false);
            return new RecyclerViewHolder(view);
        }

        @SuppressLint("NewApi")
        @Override
        public void onBindViewHolder(RecyclerViewHolder holder, int position) {

            holder.heroImage.setImageResource(heroImages.get(position));
            holder.heroName.setText(heroNames.get(position));
        }

        @Override
        public int getItemCount() {
            return heroNames.size();
        }


        public class RecyclerViewHolder extends RecyclerView.ViewHolder {
            ImageView heroImage;
            TextView heroName;
            public RecyclerViewHolder(View itemView) {
                super(itemView);
                heroImage = itemView.findViewById(R.id.heroView);
                heroName = itemView.findViewById(R.id.heroText);
            }
        }
    }


