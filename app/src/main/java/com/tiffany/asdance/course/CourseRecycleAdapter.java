package com.tiffany.asdance.course;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tiffany.asdance.R;

public class CourseRecycleAdapter extends RecyclerView.Adapter<CourseRecycleAdapter.ViewHolder> {

    public String[] datas = null;
    public CourseRecycleAdapter(String[] datas) {
        this.datas = datas;
    }

    //创建新View，被LayoutManager所调用
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.course_gridview,viewGroup,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }



    //将数据与界面进行绑定的操作
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.mTextView.setText(datas[position]);

    }

    //获取数据的数量
    @Override
    public int getItemCount() {

        return datas.length;

    }

//自定义的ViewHolder，持有每个Item的的所有界面元素

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public ViewHolder(View view){
            super(view);
            mTextView = (TextView) view.findViewById(R.id.adapter_wuliu_grid_title);
        }
    }

}