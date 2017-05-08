package com.example.sakshi.gridview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sakshi on 07-May-17.
 */

public class UserAdaptar extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<Bean> objects;

    public UserAdaptar(Context context, int resource, ArrayList<Bean> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View view = null;
        view = LayoutInflater.from(context).inflate(resource, parent, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        Bean bean = objects.get(position);
        imageView.setBackgroundResource(bean.getImage());
        return view;
    }
}
