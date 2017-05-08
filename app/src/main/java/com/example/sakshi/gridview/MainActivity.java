package com.example.sakshi.gridview;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ImageView imageView;

    GridView gridView;
    ArrayList<Bean> userList;
    UserAdaptar userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
        initViews();
    }

    void initViews(){
        gridView = (GridView) findViewById(R.id.gridView);
        userList = new ArrayList<>();

        Bean u1 = new Bean(R.drawable.gen_one);
        Bean u2 = new Bean(R.drawable.gne_two);
        Bean u3 = new Bean(R.drawable.gne_three);
        Bean u4 = new Bean(R.drawable.gne_four);
        Bean u5 = new Bean(R.drawable.gne_five);

        userList.add(u1); //0
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5); //n-1

        userAdapter = new UserAdaptar(this,R.layout.grid_item,userList);
        gridView.setAdapter(userAdapter);
        gridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
