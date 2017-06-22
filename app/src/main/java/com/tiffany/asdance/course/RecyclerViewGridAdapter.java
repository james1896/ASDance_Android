package com.tiffany.asdance.course;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tiffany.asdance.R;

import java.util.List;

/**
 * Created by moses on 22/06/2017.
 */

//必须要有Viewhoder泛型
public class RecyclerViewGridAdapter extends RecyclerView.Adapter
        <RecyclerViewGridAdapter.MyViewHolder> {

    private LayoutInflater mInflater;

    private List<String> mDatas;

    public RecyclerViewGridAdapter(Context mContext, List<String> objects) {
        mInflater = LayoutInflater.from(mContext);
        mDatas = objects;
    }
    //布局填充
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.course_gridview, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }
    //数据设置
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(mDatas.get(position));
    }
    //返回数据的数量
    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(
                    R.id.adapter_wuliu_grid_title);
        }
    }
}