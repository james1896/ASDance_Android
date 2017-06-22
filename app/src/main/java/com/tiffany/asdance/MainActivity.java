package com.tiffany.asdance;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.tiffany.asdance.course.CourseItemOnClickListener;
import com.tiffany.asdance.course.CourseRecycleAdapter;
import com.tiffany.asdance.course.DividerGridItemDecoration;
import com.tiffany.asdance.course.RecyclerViewGridAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CourseItemOnClickListener {


    private RecyclerView recy;
    private View lastItemView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();  //获取 RecyClerView 适配器 需要的数据

        initData();  // 加载数据的方法


    }

    private void getData() {//虚拟数据



    }
        private void initData() {

            //     LinearLayoutMannager 是一个布局排列 ， 管理的接口,子类都都需要按照接口的规范来实现。

            recy=(RecyclerView)findViewById(R.id.reyview);
            LinearLayoutManager ms= new LinearLayoutManager(this);

            ms.setOrientation(LinearLayoutManager.HORIZONTAL);// 设置 recyclerview 布局方式为横向布局

            //     LinearLayoutManager 种 含有3 种布局样式  第一个就是最常用的 1.横向 , 2. 竖向,3.偏移

            recy.setLayoutManager(ms);  //给RecyClerView 添加设置好的布局样式

            CourseRecycleAdapter adapter=new CourseRecycleAdapter(new String[]{"item1", "item2", "item3",
                                                                                "item4", "item5", "item6",
                                            "item7", "item8", "item9", "item10", "item11", "item12"});

             //初始化适配器
            adapter.setItemOnClickListener(this);

            recy.setAdapter(adapter);  // 对 recyclerview 添加数据内容





            //网格布局
//            List<String> mDatas = new ArrayList<>();
//            mDatas.add("全景");
//            mDatas.add("前台");
//            mDatas.add("大厅");
//            mDatas.add("后台");
//            mDatas.add("大厅");
//            mDatas.add("全景");
//            mDatas.add("前台");
//            mDatas.add("后台");
//            mDatas.add("全景");
//            mDatas.add("后台");
//            mDatas.add("大厅");
//            RecyclerViewGridAdapter mAdapter = new RecyclerViewGridAdapter(this, mDatas);
//            GridLayoutManager layoutManager = new GridLayoutManager(this, 5);
//            recy.setLayoutManager(layoutManager);
//            recy.addItemDecoration(new DividerGridItemDecoration(this, 5));
//            recy.setAdapter(mAdapter);

        }


    @Override
    public void onCourseItemOnClick(View view, int postion) {
        Log.e("onitemClick",""+postion);

        view.setBackgroundColor(Color.RED);
        if(this.lastItemView != null){
            this.lastItemView.setBackgroundColor(getResources().getColor(R.color.courseGroundColorBlack));
        }
        this.lastItemView = view;
    }
}
