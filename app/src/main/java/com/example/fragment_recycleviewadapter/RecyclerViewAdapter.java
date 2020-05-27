package com.example.fragment_recycleviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//1.繼承RecyclerView.Adapter<>
//2.準備 MyViewHolder extends  RecyclerView.ViewHolder ,要放入Adapter<>李
//3.實作三個方法
//4.將抓到的葉面View 建構式放入MyViewHolder回傳
//5.改寫回傳我資料結構的大小


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<Contact> mData; //這邊資料結構包我們寫的Model

    //3.建構式告知是哪個Context Fragment跟要玩的資料結構近來,初始化
    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext; //建構式Context哪個葉面
        this.mData = mData; //你要丟進來的吃廖
    }


    //4.將抓到的葉面View 建構式放入MyViewHolder回傳
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//實作1
        //4.將抓到的葉面View 建構式放入MyViewHolder回傳
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder ;
    }

    //7.設定元件資料
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {//實作2
        //設定元件資料
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getPhoto());
    }

    //5.改寫回傳我資料結構的大小
    @Override
    public int getItemCount() {//實作3
        return mData.size();
    }

    //2.MyViewHolder繼承,這邊抓到的view元件初始話
    public static class  MyViewHolder extends  RecyclerView.ViewHolder{
        //6.將抓到的元件初始化
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.name_contact);
            tv_phone = itemView.findViewById(R.id.phone_contact);
            img = itemView.findViewById(R.id.img_contact);
        }
    }
}
