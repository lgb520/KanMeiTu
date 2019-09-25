package com.ixuea.courses.kanmeitu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ixuea.courses.kanmeitu.MainActivity;
import com.ixuea.courses.kanmeitu.R;
import com.ixuea.courses.kanmeitu.domain.Image;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private List<Image> datas=new ArrayList<com.ixuea.courses.kanmeitu.domain.Image>();
    private final Context context;
    private final LayoutInflater inflater;

    public ImageAdapter(MainActivity context){
        this.context=context;
        inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //parent传递到inflate
        return new ViewHolder(inflater.inflate(R.layout.item_image,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         holder.bindData(datas.get(position));
    }

    @Override
    public int getItemCount() {

        return datas.size();
    }

    public void setData(List<Image> datas){
        this.datas.clear();
        this.datas.addAll(datas);


    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private final ImageView iv;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            iv = itemView.findViewById(R.id.iv);
        }
        public void bindData(Image data){
            //显示图片
        }
    }
}
